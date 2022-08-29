package com.example.cmmsiboot;


import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cmmsiboot.Services.Equipments;
import com.google.gson.JsonArray;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchEquipmentActivity extends MybaseActivity {
    ListView eqListView;
    ArrayList<Equipments> eqsearchList =new ArrayList<>();
    RecyclerView equipmentRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_equipment);
        pageTitle.setText("Search Equipment");
        SearchView equipmentsearch = findViewById(R.id.search_equip);
        equipmentRecyclerView=findViewById(R.id.recycler_view_equipment);
        //eqListView = findViewById(R.id.listview_equip_search);
        //SearchEquipmentAdapter adapter = new SearchEquipmentAdapter(eqsearchList);
        //SearchAdapterList searchAdapterList = new SearchAdapterList();
        //eqListView.setAdapter(adapter);
        //eqListView.setLayoutManager(new LinearLayoutManager(this));

        equipmentsearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                loadSearchEquipment(s);
                if(s.isEmpty()){
                    eqsearchList.clear();
                }else {
                    loadSearchEquipment(s);
                }

                return false;
            }
        });



    }
    public void loadSearchEquipment(String s){
        Call<JsonArray> call = ApiClient.getUserServices().getEquipments(token, workspace);
        call.enqueue(new Callback<JsonArray>() {
            @Override
            public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {
                if (response.code() == 200) {
                    JsonArray jsonArrayEquipList = response.body();
                    for (int i = 0; i < jsonArrayEquipList.size(); i++) {
                        Log.d("ARRAYLISTSize>>", String.valueOf(jsonArrayEquipList.size()));
                        Log.d("ARRAYLISTSeaEqment>>", String.valueOf(jsonArrayEquipList));
                        int eqId = jsonArrayEquipList.get(i).getAsJsonObject().get("id").getAsInt();
                        String eqName =jsonArrayEquipList.get(i).getAsJsonObject().get("name").getAsString();
                        eqsearchList.add(new Equipments(eqId,eqName));

                    }
                    /*SearchAdapterList searchAdapterList = new SearchAdapterList(SearchEquipmentActivity.this,eqsearchList);
                    eqListView.setAdapter(searchAdapterList);
                    searchAdapterList.notifyDataSetChanged();*/
                    SearchEquipmentAdapter searchEquipmentAdapter = new SearchEquipmentAdapter(SearchEquipmentActivity.this,eqsearchList);
                    equipmentRecyclerView.setAdapter(searchEquipmentAdapter);
                    equipmentRecyclerView.setLayoutManager(new LinearLayoutManager(SearchEquipmentActivity.this));
                    searchEquipmentAdapter.notifyDataSetChanged();

                }
            }

            @Override
            public void onFailure(Call<JsonArray> call, Throwable t) {

            }
        });
    }
}