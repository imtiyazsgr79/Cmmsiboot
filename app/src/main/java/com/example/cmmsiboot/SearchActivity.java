package com.example.cmmsiboot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.gson.JsonArray;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchActivity extends MybaseActivity {
    private static final String SHARED_PREF = "";
    private RecyclerView searchFridrecyclerview;
    private ImageView logouticon;
    MaterialToolbar toolbar;
    String workspaceId,token,username,role;
    ArrayList<SearchResponse> searchFrIdList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences preferences =  this.getApplicationContext().getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
      workspaceId = preferences.getString("workspaceId","");
        token = preferences.getString("token","");
        username = preferences.getString("name","");
     role = preferences.getString("role","");
        Log.d("SWWWWW",workspace);
        Log.d("SSSSSTTTT",token);
        Log.d("SNNNNN",username);
        Log.d("SRRRRRRR",role);


        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View viewLayout = layoutInflater.inflate(R.layout.activity_search, null, false);
        drawer.addView(viewLayout, 0);



        /* setContentView(R.layout.activity_search);*/
        /* toolbar = findViewById(R.id.toolbar);*/
        pageTitle.setText("Search Fault Report");
        SearchView searchView = findViewById(R.id.search_view);
        searchFridrecyclerview = findViewById(R.id.recycler_view_search);


        searchFridrecyclerview.setLayoutManager(new LinearLayoutManager(this));





        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
               /* searchList.add(0, "fid1");
                searchList.add(0, "fid2");
                searchList.add(0, "fid3");
                searchList.add(0, "fid4");*/

                if (s.isEmpty()) {
                    searchFrIdList.clear();

                } else {
                    loadSearch(s);
                    /*searchList.clear();
                    searchList.add(0, "fid1");
                    searchList.add(0, "fid2");
                    searchList.add(0, "fid3");
                    searchList.add(0, "fid4");*/
                }

                return false;
            }
        });


    }

    /*API CALL FOR SEARCH WITH PARAMETERS GOES HERE*/
   public void loadSearch(String s) {
       Call<JsonArray> call = ApiClient.getUserServices().getSearchResult(workspaceId,s,token,role);
        call.enqueue(new Callback<JsonArray>() {
            @Override
            public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {
                if(response.code()==200) {
                   // List<SearchResponse> list = response.body();
                    JsonArray jsonArrayFrids = response.body();
                    for(int i=0;i<jsonArrayFrids.size();i++){
                        String fidsList = String.valueOf(jsonArrayFrids);
                        Log.d("FRIDSSSSS",fidsList);
                        String frId = jsonArrayFrids.get(i).getAsJsonObject().get("frId").getAsString();
                        String locName = jsonArrayFrids.get(i).getAsJsonObject().getAsJsonObject("location").get("name").getAsString();
                        Log.d("LocationLLLLL",locName);
                        searchFrIdList.add(new SearchResponse(frId,locName));
                    }
                    SearchFrIdAdapter seachFrIdAdapter = new SearchFrIdAdapter(SearchActivity.this,searchFrIdList);
                   searchFridrecyclerview.setAdapter(seachFrIdAdapter);
                    seachFrIdAdapter.notifyDataSetChanged();


                }
            }

            @Override
            public void onFailure(Call<JsonArray> call, Throwable t) {

            }


        });

    }
}