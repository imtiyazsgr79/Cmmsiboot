package com.example.cmmsiboot;

import static android.app.Activity.RESULT_OK;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.cmmsiboot.Services.Equipments;

import java.util.ArrayList;

public class SearchAdapterList extends BaseAdapter {
    ArrayList<Equipments> eqsearchList;
    private Context context;

    public SearchAdapterList(Context context, ArrayList<Equipments> eqsearchList) {
        this.eqsearchList= eqsearchList;
        this.context = context;

    }

    @Override
    public int getCount() {
        return eqsearchList.size();
    }

    @Override
    public Object getItem(int position) {
        return eqsearchList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View eqView, ViewGroup parent) {
        if (eqView==null){
                eqView= LayoutInflater.from(context).inflate(R.layout.equipment_details_view,parent,false);
                Equipments eqItem = (Equipments) getItem(position);
            TextView eqId = eqView.findViewById(R.id.textview_eq_id);
            TextView eqName = eqView.findViewById(R.id.textview_eq_name);
            eqId.setText(String.valueOf(eqItem.getEquipmentId()));
            eqName.setText(eqItem.getEquipmentName());
        }
        eqView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedId = ((TextView )view.findViewById(R.id.textview_eq_id)).getText().toString();
                String selectedeqName = ((TextView )view.findViewById(R.id.textview_eq_name)).getText().toString();
                Intent eqsIntent = new Intent();
                eqsIntent.putExtra("equipmentId",Integer.parseInt(selectedId));
                eqsIntent.putExtra("equipmentName",selectedeqName);
                ((Activity) context).setResult(RESULT_OK, eqsIntent);
                ((Activity) context).finish();


            }
        });

        return eqView;
    }
}
