package com.example.cmmsiboot;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.cmmsiboot.Workspace.WorkspaceActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.FirebaseMessaging;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity<MainActivityLogin> extends AppCompatActivity {
	private ProgressDialog mProgress;
	private static final int STORAGE_PERMISSION_CODE = 1;
	private MaterialButton button;
	private TextInputLayout hintUser,hintPassword;
	private TextInputEditText userName,userPassword;
	public static final String SHARED_PREFS = "sharedPrefs";
	private SharedPreferences.Editor editor;
	private String nameString,passwordString,deviceToken;
	private ArrayList<String >receivedRolesList = new ArrayList<String>();



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	   // getSupportActionBar().hide();
		SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
		editor = sharedPreferences.edit();
		FirebaseApp.initializeApp(getApplicationContext());
		FirebaseInstallations.getInstance().getToken(true);

		FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener<String>() {
			@Override
			public void onComplete(@NonNull Task<String> task) {
				if (task.isSuccessful()) {
					deviceToken = task.getResult();
					Log.w("FCM Token ",task.getResult());
					Log.d("FCM Token ",task.getResult());
					//Toast.makeText(MainActivity.this, deviceToken, Toast.LENGTH_SHORT).show();
				}
			}
		});
		setContentView(R.layout.activity_main);
		userName = findViewById(R.id.text_user);
		userPassword = findViewById(R.id.text_password);
		hintUser = findViewById(R.id.hint_username);
		hintPassword = findViewById(R.id.hint_password);
		button = findViewById(R.id.btn_login);
		if (!(ContextCompat.checkSelfPermission(this,
				Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
				&& ContextCompat.checkSelfPermission(this,
				Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED
				&& ContextCompat.checkSelfPermission(this,
				Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED
				&& ContextCompat.checkSelfPermission(this,
				Manifest.permission.ACCESS_NOTIFICATION_POLICY) == PackageManager.PERMISSION_GRANTED)) {
			requestStoragePermission();
			button.setEnabled(false);
		} else {
			button.setEnabled(true);
		}
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				nameString = userName.getText().toString();
				passwordString = userPassword.getText().toString();
				UserRequest userRequest = new UserRequest(nameString, passwordString, deviceToken);
				if (!userName.getText().toString().isEmpty() || !userPassword.getText().toString().isEmpty()) {
				   hintUser.setErrorEnabled(false);
					hintPassword.setErrorEnabled(false);

				} else {
					Toast.makeText(MainActivity.this,"Please fill all fields",Toast.LENGTH_SHORT).show();
					//Toast.makeText(MainActivityLogin.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
				   hintUser.setError("Required");
				   hintPassword.setError("Required");
				}
				loginUser(userRequest);

			   // Intent intent = new Intent(getApplicationContext(), WorkspaceActivity.class);
			   // startActivity(intent);

			}
		});

	}
	public void requestStoragePermission() {

		new AlertDialog.Builder(this)
				.setTitle("Permission needed")
				.setCancelable(false)
				.setMessage("This Application needs location and other permissions")
				.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@RequiresApi(api = Build.VERSION_CODES.M)
					@Override
					public void onClick(DialogInterface dialog, int which) {
						ActivityCompat.requestPermissions(MainActivity.this,
								new String[]{Manifest.permission.ACCESS_FINE_LOCATION,
										Manifest.permission.READ_EXTERNAL_STORAGE,
										Manifest.permission.CAMERA,
										Manifest.permission.ACCESS_NOTIFICATION_POLICY}, STORAGE_PERMISSION_CODE);
					}
				})
				.create().show();
	}

	@Override
	public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == STORAGE_PERMISSION_CODE) {
			if (grantResults.length > 0
					&& grantResults[0] == PackageManager.PERMISSION_GRANTED
					&& grantResults[1] == PackageManager.PERMISSION_GRANTED
					&& grantResults[2] == PackageManager.PERMISSION_GRANTED
					&& grantResults[3] == PackageManager.PERMISSION_GRANTED) {
				button.setEnabled(true);
			} else {
				new AlertDialog.Builder(this)
						.setTitle("Permission Denied")
						.setMessage("Please enable the permissions in settings")
						.setCancelable(false)
						.setPositiveButton("ok", null)
						.create().show();
			}
		}
	}
	public void loginUser(UserRequest userRequest){
		mProgress = new ProgressDialog(MainActivity.this);
		mProgress.setTitle("Authenticating...");
		mProgress.setCancelable(false);
		mProgress.setIndeterminate(true);
		mProgress.show();
		Call<UserResponse> call = ApiClient.getUserServices().saveUser(userRequest);
		call.enqueue(new Callback<UserResponse>() {
			@Override
			public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
				if(response.code()==200){
				//UserResponse userResponse = response.body();
				String userName =response.body().getUsername();
				String auttoken = response. body().getToken();
				receivedRolesList = response.body().getRoles();

				Log.d("++++++",userName);
				Log.d("???????",auttoken);
				Log.d(")))))",receivedRolesList.toString());

					Intent intent = new Intent(getApplicationContext(), WorkspaceActivity.class);
					intent.putExtra("name",userName);
					intent.putExtra("token",auttoken);
					intent.putExtra("rolesList",receivedRolesList);
					intent .putExtra("deviceToken",deviceToken);
					startActivity(intent);
				}  else if (response.code() == 202) {
				Toast.makeText(MainActivity.this, "Please check the username and password", Toast.LENGTH_SHORT).show();
			} else if (response.code() == 401) {
				Toast.makeText(MainActivity.this, Constants.ERROR_CODE_401_MESSAGE_LOGIN, Toast.LENGTH_SHORT).show();
			} else if (response.code() == 500) {
				Toast.makeText(MainActivity.this, Constants.ERROR_CODE_500_MESSAGE, Toast.LENGTH_SHORT).show();
			} else if (response.code() == 404) {
				Toast.makeText(MainActivity.this, Constants.ERROR_CODE_404_MESSAGE, Toast.LENGTH_SHORT).show();
			} else if (response.code() == 400) {
				Toast.makeText(MainActivity.this, Constants.ERROR_CODE_400_MESSAGE, Toast.LENGTH_SHORT).show();
			}
				mProgress.dismiss();
			}

			@Override
			public void onFailure(Call<UserResponse> call, Throwable t) {

			}
		});
	}

}
