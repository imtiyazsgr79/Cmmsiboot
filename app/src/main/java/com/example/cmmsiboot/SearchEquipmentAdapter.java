package com.example.cmmsiboot;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cmmsiboot.Services.Equipments;

import java.util.ArrayList;


public class SearchEquipmentAdapter extends RecyclerView.Adapter<SearchEquipmentAdapter.ViewHolder> {
    private Context context;
    ArrayList<Equipments>eqsearchList = new ArrayList();
    public SearchEquipmentAdapter(Context context, ArrayList<Equipments> eqsearchList) {
        this.eqsearchList = eqsearchList;
        this.context = context;
    }

    @NonNull
    @Override
    public SearchEquipmentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.equipment_search_item_view,parent,false);
        ViewHolder eviewHolder = new ViewHolder(v);
        return eviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SearchEquipmentAdapter.ViewHolder holder, int position) {
        Equipments eqList = eqsearchList.get(position);
      holder.equipmentName.setText(eqList.getEquipmentName());
      holder.itemView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

           /*   Intent cintent = new Intent(view.getContext(),CreateFaultActivity.class);
              String equipmentsearched = eqList.getEquipmentName();
              cintent.putExtra("equipmentNameSearchResult",equipmentsearched);


              view.getContext().startActivity(cintent);*/
              String searchedEqName = eqList.getEquipmentName();
              String searchedEqId = String.valueOf(eqList.getEquipmentId());

              //Equipment equipment = new Equipment();
              //equipment.setEquipmentId(searchedEqId);
              //equipment.setName(searchedEqName);

              Intent seqI = new Intent();
              seqI.putExtra("equipmentId",searchedEqId);
              seqI.putExtra("equipment_Name",searchedEqName);
             // Log.d("SEARADDDDD%%",searchedEqId);
              //Log.d("SEARANNNNN%%",searchedEqName);

              ((Activity) context).setResult(Activity.RESULT_OK,seqI);
              ((Activity) context).finish();

          }
      });



    }

    @Override
    public int getItemCount() {
        return eqsearchList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView equipmentName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            equipmentName = itemView.findViewById(R.id.equipment_name);

        }
    }
}
