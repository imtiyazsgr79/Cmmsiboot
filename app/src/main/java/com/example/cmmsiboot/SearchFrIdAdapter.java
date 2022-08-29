package com.example.cmmsiboot;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;

public class SearchFrIdAdapter extends RecyclerView.Adapter<SearchFrIdAdapter.ViewHolder> {
    private Context context;
    ArrayList<SearchResponse>searcherIdLists =new ArrayList<>();
    public SearchFrIdAdapter(Context context,ArrayList<SearchResponse> searcherIdLists) {
        this.context = context;
        this.searcherIdLists = searcherIdLists;
    }

    @NonNull
    @Override
    public SearchFrIdAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater  layoutInflater = LayoutInflater.from(parent.getContext());
        View v =layoutInflater.inflate(R.layout.search_item_view,parent,false);
        ViewHolder sViewHolder = new ViewHolder(v);

        return sViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SearchFrIdAdapter.ViewHolder holder, int position) {
   // String sList = searchList.get(position);
        SearchResponse sList = searcherIdLists.get(position);
        holder.frId.setText(sList.getFrId());
        holder.locName.setText(sList.getLocationNameName());


    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String selectedId = sList.getFrId();
            Intent sinIntent = new Intent(view.getContext(),EditFaultActivity.class);
            sinIntent.putExtra("selectedfrId",selectedId);
            view.getContext().startActivity(sinIntent);

        }
    });

    }

    @Override
    public int getItemCount() {
        return searcherIdLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView frId;
        TextView locName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            frId = itemView.findViewById(R.id.frid_tv);
            locName = itemView.findViewById(R.id.desc_tv);
        }
    }
}
