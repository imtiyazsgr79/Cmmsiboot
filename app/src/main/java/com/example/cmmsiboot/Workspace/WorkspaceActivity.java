package com.example.cmmsiboot.Workspace;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.cmmsiboot.ApiClient;
import com.example.cmmsiboot.LogoutClass;
import com.example.cmmsiboot.R;
import com.google.android.material.appbar.MaterialToolbar;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WorkspaceActivity extends AppCompatActivity {
    private static final String SHARED_PREFS = "";
    private MaterialToolbar toolbar;
    private String wname,wrtoken;
    private ArrayList<String> receivecRList = new ArrayList<>();
  //ArrayList<Workspace> rwkSpacelst = new ArrayList<>();
  ArrayList<Workspace> workspaceList = new ArrayList<Workspace>();

    private RecyclerView workspaceRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workspace);
        //getSupportActionBar().hide();
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        LinearLayout linearLayout = findViewById(R.id.workspace);
        workspaceRecyclerView= findViewById(R.id.recycler_view_workspace);
        Intent wIntent = getIntent();
      wname = wIntent.getStringExtra("name");
      wrtoken = wIntent.getStringExtra("token");
        receivecRList = wIntent.getStringArrayListExtra("rolesList");
         String deviceTokenw = wIntent.getStringExtra("deviceToken");
        SharedPreferences preferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.putString("token",wrtoken);
        editor.putString("deviceToken",deviceTokenw);
        editor.putString("name",wname);
        editor.putString("role", String.valueOf(receivecRList));

        editor.apply();
      Log.d("UUUUUUUU",wname);
        Log.d("TTTTTTTTT",wrtoken);
        Log.d("TTTTTTTTT", String.valueOf(receivecRList));
     allWorkspaces(wname,wrtoken);
       // ArrayList<String> workspaceList = new ArrayList<String();
       /* workspaceList.add(0,"aste");
        workspaceList.add(1,"stie");
        workspaceList.add(2, "sif");
        workspaceList.add(3,"aste");
        workspaceList.add(4,"stie");
        workspaceList.add(5, "sif");
        workspaceList.add(6,"aste");
        workspaceList.add(7,"stie");
        workspaceList.add(8, "sif");
        workspaceList.add(9,"aste");
        workspaceList.add(10,"stie");
        workspaceList.add(11, "sif");*/

      /*  WorkspaceRecyclerAdapter myAdapter = new WorkspaceRecyclerAdapter(workspaceList);
        workspaceRecyclerView.setAdapter(myAdapter);

        workspaceRecyclerView.setLayoutManager(new LinearLayoutManager(this));*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
     getMenuInflater().inflate(R.menu.menu_workspace, menu);
        return true;
    }
    /*ADD IN  MENU android:onClick="onOptionsItemSelected"*/
    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()){
            case R.id.logoutmenu:
               Toast.makeText(this,"Logout Successful",Toast.LENGTH_SHORT).show();
               LogoutClass logoutClass = new LogoutClass();
               logoutClass.logout(this);

        }
        return true;

    }
    public void allWorkspaces(String wname,String wrtoken) {
        Call<ArrayList<Workspace>> call = ApiClient.getUserServices().getWorkspace(wname, wrtoken);
            call.enqueue(new Callback<ArrayList<Workspace>>() {
                @Override
                public void onResponse(Call<ArrayList<Workspace>> call, Response<ArrayList<Workspace>> response) {
                    if(response.code()==200){
                 ArrayList<Workspace> workList = response.body();

                    for(int i=0;i<workList.size();i++){
                        Log.d("WorKSpacesssssss",String.valueOf(i));
                        Log.d("++++++++",workList.toString());
                        String workspaceid = workList.get(i).getWorkspaceId();
                        String buildingDescription = workList.get(i).getBuildingDescription();
                        workspaceList.add(new Workspace(workspaceid,buildingDescription));



                    }
                        WorkspaceRecyclerAdapter myAdapter = new WorkspaceRecyclerAdapter(workspaceList,WorkspaceActivity.this);
                        workspaceRecyclerView.setAdapter(myAdapter);

                        workspaceRecyclerView.setLayoutManager(new LinearLayoutManager( WorkspaceActivity.this));

                    }
                }

                @Override
                public void onFailure(Call<ArrayList<Workspace>> call, Throwable t) {

                }
            });

    }
    //To Disable Back button
    @Override
   public void onBackPressed(){
        return;
   }
    //Method to act like you have pressed Home
   /* @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }*/
}