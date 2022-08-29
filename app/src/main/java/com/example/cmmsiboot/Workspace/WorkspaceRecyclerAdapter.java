package com.example.cmmsiboot.Workspace;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cmmsiboot.R;
import com.example.cmmsiboot.SearchActivity;

import java.util.ArrayList;

public class WorkspaceRecyclerAdapter extends RecyclerView.Adapter<WorkspaceRecyclerAdapter.ViewHolder>{
    private static final String SHARED_PREFS= "";
    private static final String MODE_PRIVATE= "";
    ArrayList<Workspace> workspaceList = new ArrayList<>();



    public WorkspaceRecyclerAdapter(ArrayList<Workspace> workspaceList, Context context ) {
        this.workspaceList = workspaceList;
        this.context  = context;

    }
    private Context context;

    @NonNull
    @Override
    public WorkspaceRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.workspce_recycler_item_view, parent, false);
        ViewHolder farmsViewHolder = new ViewHolder(v);
        return farmsViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull WorkspaceRecyclerAdapter.ViewHolder holder, int position) {
        Workspace wkList = workspaceList.get(position);
        holder.workspaceId.setText(wkList.getWorkspaceId());
        holder.buildingDescription.setText(wkList.getBuildingDescription());
        SharedPreferences preferences = this.context.getSharedPreferences(SHARED_PREFS,Context.MODE_PRIVATE);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wsintent = new Intent(view.getContext(), SearchActivity.class);
                    String id = wkList.getWorkspaceId();
                preferences.edit().putString("workspaceId", id ).apply();

                view.getContext().startActivity(wsintent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return workspaceList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView buildingDescription,workspaceId;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            buildingDescription = itemView.findViewById(R.id.worskspace_tv);
            workspaceId = itemView.findViewById(R.id.desc_tv);
        }
    }
}
