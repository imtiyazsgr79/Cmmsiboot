package com.example.cmmsiboot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MybaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private static final String SHARED_PREFS = "";
    public MaterialToolbar toolbar ;
    public TextView pageTitle;
    public DrawerLayout drawer;
    public  NavigationView navigationView;
    public ActionBarDrawerToggle toggle;
    //public String username="user";
    public String token,role,username,workspace;
    public ImageView logoutIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mybase);
        pageTitle = findViewById(R.id.toolbar_tv_name);
        toolbar  = findViewById(R.id.toolbar_mybase);
        logoutIcon =findViewById(R.id.logicon);
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        token = sharedPreferences.getString("token", "");
        role = sharedPreferences.getString("role", "");
        username = sharedPreferences.getString("name", "").toUpperCase();
        workspace = sharedPreferences.getString("workspaceId", "");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        sharedPreferences.edit().putString("token",token).apply();
        sharedPreferences.edit().putString("role",role).apply();
        sharedPreferences.edit().putString("name",username).apply();
        sharedPreferences.edit().putString("workspaceId",workspace).apply();
        Log.d("TTTTTTTTKKK",token);
        Log.d("ROLEEEEEE",role);
        Log.d("WORSSSSS",workspace);
        Log.d("UUUUUUUUSSS",username);



          /*View headerView = navigationView.getHeaderView(0);
        TextView usernameTv = (TextView) headerView.findViewById(R.id.headerName);
        usernameTv.setText(username);*/
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navView);

        navigationView.setNavigationItemSelectedListener(this);
        toggle = new ActionBarDrawerToggle(this, drawer, toolbar, 0, 0);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        Menu navMenu = navigationView.getMenu();


        logoutIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 /*add This in Customm_toolbar android:background="?android:attr/selectableItemBackground"*/
                LogoutClass logoutClass = new LogoutClass();
                logoutClass.logout(MybaseActivity.this);
                Toast.makeText(getApplicationContext(), "Logout Successful", Toast.LENGTH_SHORT).show();
            }
        });


    }
    public void intentMethod(Class cla, String value) {

        if (!(getClass().equals(cla))) {
            Intent intent = new Intent(getApplicationContext(), cla);
            /*intent.putExtra("workspace", workspace);*/
            intent.putExtra("value", value);
            startActivity(intent);
            finish();

        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.create_fr:
                //Toast.makeText(this, "Create Fr pressed", Toast.LENGTH_SHORT).show();
                intentMethod(CreateFaultActivity.class,"");
               /* Intent intent  = new Intent(getBaseContext(),CreateFaultActivity.class);
                startActivity(intent);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                finish();*/

                break;

            case R.id.search_fr:
                Toast.makeText(this, "Search Fault pressed", Toast.LENGTH_SHORT).show();
                intentMethod(SearchActivity.class,"");

                break;
            case R.id.scan_fr:
                Toast.makeText(this, "Scan Fault Pressed", Toast.LENGTH_SHORT).show();
                intentMethod(ScannerActivity.class,"");
                break;
            case R.id.search_tsk:
                Toast.makeText(this, "Search task Pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.scan_tsk:
                Toast.makeText(this, "Scan Task Pressed", Toast.LENGTH_SHORT).show();
                break;

        }


       /* if (toggle.onOptionsItemSelected(item)) {
            return true;
        }*/

      /*  return super.onOptionsItemSelected(item);*/
        drawer.closeDrawer(GravityCompat.START);
        return false;
    }

}