package com.example.cmmsiboot;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.cmmsiboot.Workspace.WorkspaceActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class EditFaultActivity extends MybaseActivity {
    private FloatingActionButton fab_main, fab_before, fab_after, fabQuoteMain, fabQuoteUpload, fabPurchaseOrder;
    private Boolean isMenuOpen = false;
    private final OvershootInterpolator interpolator = new OvershootInterpolator();
    private final Float translationY = 600f;
    private MaterialButton scanLocationbtn,addRemarkstxtBtn,delRemarkstxtBtn;
    private LinearLayout linearLayout;
    String receivedDate,receivedTime,techName,techId,result;
    private int  remarksId,listRmarksNo;
    String frId,remarksString;
    String equp,repTime,repDate;
    private EditText faultIdtxt,requestorNametxt,reportedDatetxt,reportedTimetxt,departmenttxt,contacttxt,prioritytxt,buildingtxt,locationtxt,divisiontxt,
            locdescrptiontxt,faultcategrytxt,fdescriptiontxt,maintgrptxt,equipmenttxt,observationtxt,actiontakentxt,tachniciantxt;
    AutoCompleteTextView enddatespinner,endtimespinner;
    private TextInputEditText editTextRemarks;

    String clientFrId, customerRefId, requestorName, requestorContactNo, locationDesc, status,
            faultCategoryDesc, locationName, buildingName, departmentName, maintGrpName, priorityName,
            faultCategoryName, cost, quotationStatus, acknowledgerCode, purchaseOrder,
            technicianSignature, completedBy, eotType, observation, actionTaken, costCenter,
            labourHrs, images, activationTime, arrivalTime, restartTime, responseTime, downTime,
            pauseTime, completionTime, acknowledgementTime, eotTime, reportedDate, fmmCaseId,
            reportedTime, requesterName, maintenanceGroup, faultDetail, createdBy, createdDate,
            startDate, endDate, costId, startTime, endTime, reasonForOutstanding, equipmentName,
            divisionName, updatedBy;
    boolean editable, locationScanned;
    List<String> remarksList= new ArrayList<>();
    List<AttendedBy> attendedBy= new ArrayList<>();
    String spinnertext;
    ArrayList<Integer> techList = new ArrayList<>();
    List<String>stechList = new ArrayList<>();
    String[] listItems;
    boolean[] checkedItems;
    EditText technicianTxt;
    List attendedByIdsList;
    List<TextInputEditText>editTextList = new ArrayList<TextInputEditText>();

    Department department = new Department();
    Building building = new Building();
    Location location = new Location();
    Priority priority = new Priority();
    FaultCategory faultCategory = new FaultCategory();
    MaintGrp maintGrp = new MaintGrp();
    Division division = new Division();
    Equipment equipment;

    {
        equipment = null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View viewLayout = layoutInflater.inflate(R.layout.activity_edit_fault, null, false);
        drawer.addView(viewLayout, 0);
        pageTitle.setText("Fault Report Detail");
        fab_main = findViewById(R.id.images_id);
        fab_before = findViewById(R.id.before_id);
        fab_after = findViewById(R.id.after_id);
        Intent edIntent = getIntent();
         frId = edIntent.getStringExtra("selectedfrId");
        Log.d("SELTEDDDFRID>>>>>",frId);
        faultIdtxt = findViewById(R.id.frIdEditText);
        requestorNametxt = findViewById(R.id.reqNameEditTextEditFault);

        contacttxt = findViewById(R.id.contactNumber);

        departmenttxt = findViewById(R.id.dept_number);

        prioritytxt = findViewById(R.id.priorityNumber);

        buildingtxt = findViewById(R.id.buildingNumber);

        locationtxt = findViewById(R.id.unitNumber);

        divisiontxt = findViewById(R.id.divisionNumberSpinner);

        locdescrptiontxt = findViewById(R.id.locationDescrip);
        faultcategrytxt = findViewById(R.id.faultCategory);
        faultCategory.setName(faultcategrytxt.getText().toString());
        Log.d("FaCCCCTT", String.valueOf(faultCategory));
        fdescriptiontxt = findViewById(R.id.faultDetails);

        maintgrptxt= findViewById(R.id.mainGrp);

        reportedDatetxt = findViewById(R.id.activation_date);
        reportedTimetxt = findViewById(R.id.activation_time);
        equipmenttxt = findViewById(R.id.equipmentTextViewEditFault);
        //equipment.setName(equipmenttxt.getText().toString());
        observationtxt = findViewById(R.id.observation);
        actiontakentxt = findViewById(R.id.actionTaken);
        linearLayout = findViewById(R.id.layout_remarks);
        addRemarkstxtBtn = findViewById(R.id.addRemarksBtn);
        delRemarkstxtBtn = findViewById(R.id.deleteRemarksBtn);
 // remarkstext = findViewById(R.id.remarksTextView);

        enddatespinner = findViewById(R.id.response_time);
        endtimespinner = findViewById(R.id.acknowlegde_time);
        tachniciantxt = findViewById(R.id.techtv);
        addRemarkstxtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
/*
                //plusc.setText(String.valueOf(pluscount));
                // Create EditText
                final EditText editText = new EditText(EditFaultActivity.this);
                editText.setHint("Remarks");
                editText.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT));
                editText.setPadding(20, 20, 20, 20);

                // Add EditText to LinearLayout
                if (linearLayout != null) {
                    if(linearLayout.getChildCount()<12){
                        //int remarksId++;
                        //plusc.setText(String.valueOf(remarksId));
                       // Log.d("IDDDD",String.valueOf(remarksId));
                        linearLayout.addView(editText);
                    }


                }*/
                if (linearLayout.getChildCount() < 9) {
                    remarksId++;

                   linearLayout.addView(createNewEditText(remarksString, remarksId));
                }


            }
        });
        delRemarkstxtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /* // minuscounter= remarksId--;
               // micounter.setText(String.valueOf(minuscounter));
               // Log.d("MMMCCNN", String.valueOf(minuscounter));

                // TODO Auto-generated method stub
               // if(minuscounter>0 ){
                    int pos=(Integer) view.getTag();



                    linearLayout.removeViewAt(pos);
                   // if(minuscounter==1 ){
                       // delBtn.setEnabled(false);

                    //}




               // }*/

                deleteRemarks(view);

            }
        });

       // delRemarkstxtBtn.setTag(linearLayout.getChildCount()+1);



        enddatespinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePicker();
            }
        });
        endtimespinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               showTimePicker();
            }
        });
        Call<FrDto> call = ApiClient.getUserServices().editFault(frId,token);
        call.enqueue(new Callback<FrDto>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(Call<FrDto> call, Response<FrDto> response) {
                if(response.code()==200){
                    FrDto obj = response.body();

                    faultIdtxt.setText(obj.getFrId());
                   // Log.d("..........",refaultId);
                    requestorNametxt.setText(obj.getRequestorName());
                    requestorName = requestorNametxt.getText().toString();
                    departmenttxt.setText(obj.getDepartment().getName());
                    department.setName(departmenttxt.getText().toString());
                    department.setId(obj.getDepartment().getId());
                    contacttxt.setText(obj.getRequestorContactNo());
                    requestorContactNo= contacttxt.getText().toString();
                    prioritytxt.setText(obj.getPriority().getPriorityId());
                    priority.setPriorityId(prioritytxt.getText().toString());
                    priority.setId(obj.getPriority().getId());
                    buildingtxt.setText(obj.getBuilding().getName());
                    building.setId(obj.getBuilding().getId());
                    building.setName(buildingtxt.getText().toString());
                    locationtxt.setText(obj.getLocation().getName());
                    location.setId(obj.getLocation().getId());
                    location.setName(locationtxt.getText().toString());
                    divisiontxt.setText(obj.getDivision().getName());
                    division.setId(obj.getDivision().getId());
                    division.setName(locationtxt.getText().toString());
                    locdescrptiontxt.setText(obj.getLocationDesc());
                    faultcategrytxt.setText(obj.getFaultCategory().getName());
                    faultCategory.setName(faultcategrytxt.getText().toString());
                    faultCategory.setId(obj.getFaultCategory().getId());
                    fdescriptiontxt.setText(obj.getFaultCategoryDesc());
                    maintgrptxt.setText(obj.getMaintGrp().getName());
                    maintGrp.setName(maintgrptxt.getText().toString());
                    maintGrp.setId(obj.getMaintGrp().getId());
                    if(obj.getObservation()!=null){
                    observationtxt.setText(obj.getObservation().toString());
                    }else
                        observationtxt.setText("");
                    if(obj.getActionTaken()!=null){
                    actiontakentxt.setText(obj.getActionTaken().toString());
                    }else actiontakentxt.setText("");
                  /*  List<String> receivedRemarksStrings = obj.getRemarks();
                    for(int g =0;g<receivedRemarksStrings.size();g++){
                        String remarksString =receivedRemarksStrings.get(g).toString();
                        listRmarksNo =g+1;
                        linearLayout.addView(createNewEditText(remarksString,g));
                       //
                        // Log.d("RRRSSSTTT",remarksString+remarksId);
                        //editTextList.add( receivedRemarksStrings.get(g));
                    }*/


                    //Date parse
                     repDate = obj.getReportedDate();
                    Log.d("=======",repDate);
                    String datentime = repDate;
                    Date init =null;
                    try {
                        init =new SimpleDateFormat("yyyy-MM-dd").parse(datentime);


                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
            SimpleDateFormat formatter = null;
            formatter= new SimpleDateFormat("dd-MM-yyyy");
           receivedDate= formatter.format(init);
            Log.d("DateFomateed",receivedDate);

            //Date Set
            reportedDatetxt.setText(receivedDate);
            //Time Parse
             repTime = obj.getReportedTime();
             Log.d("RepotedTIMMMM",repTime);
             String rtime = repTime;
             Date initTime = null;
                    try {
                        initTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(rtime);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    SimpleDateFormat format = null;
                    format = new SimpleDateFormat("HH:mm");
                    receivedTime = format.format(initTime);
                    Log.d("RRRRTTTTTT",receivedTime);
                    //TimeSet
                    reportedTimetxt.setText(receivedTime);
                    equipment= new Equipment();

                    if(obj.getEquipment()!=null) {
                        equp = obj.getEquipment().getName();
                        equipmenttxt.setText(equp);
                        equipment.setName(obj.getEquipment().getName());
                        equipment.setId(obj.getEquipment().getId());

                   }else if(obj.getEquipment()==null){

                        equipmenttxt.setText("no equipment");
                       equipment=null;
                    }

                    List<AttendedBy> receivedTechList = obj.getAttendedBy();
                    List<String> list = new ArrayList<>();

                   Log.d("SZZZZZZ", String.valueOf(receivedTechList.size()));

                  for(int i=0;i<receivedTechList.size();i++){

                      Log.d("LLLLLSSS", String.valueOf(receivedTechList.get(i).getId()));
                        techId = String.valueOf(receivedTechList.get(i).getId());
                      Log.d("TECNNANANAN",receivedTechList.get(i).getName());
                     techName = receivedTechList.get(i).getName();
                      list.add(techName);
                      Log.d("ListVVVV", String.valueOf(list));
                      if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                        result = String.join(",", list);
                          Log.d("lISTVALUUUUU",result);
                      }

                            //Technicians added to the edit text view
                             tachniciantxt.setText(result);

                      //Added technician list for the call for UpdateFault report
                     // attendedBy.add((AttendedBy) obj.getAttendedBy());
                      //ArrayList<AttendedBy> attendedBy = new ArrayList<>();
                    for(int k=0;k<receivedTechList.size();k++){
                        AttendedBy attendedBy1 = new AttendedBy();
                        attendedBy1.setId(receivedTechList.get(k).getId());
                        attendedBy1.setName(receivedTechList.get(k).getName());
                        Log.d("ALLLNNNNTTTT",String.valueOf(attendedBy1));
                        // attendedBy.add(new AttendedBy(id));
                        attendedBy.add(attendedBy1);
                      Log.d("SETVALUEAAAA",String.valueOf(attendedBy));
                    }


                 }

                        Log.d("mustrunfivetimesfor 1",techName);



                       /*   //if (receivedTechList[i] != null) {
                         //  list.add(receivedTechList[i]);
                       // }
                        String value = attendedBy.get(i).toString();
                       stechList.add(value);
                        for(int j=0;j<stechList.size();j++){
                            Log.d("NNNNNTTTTTT",stechList.get(j));
                        }

                    }*/


                   // receivedTechList = list.toArray(new String[list.size()]);
                    //Arrays.sort(aprovados);
                    //System.out.println(Arrays.asList(aprovados));

                    //}



                   // Log.d("REQNNNNNNNNNN",recName);
                    String jsonString = new Gson().toJson(obj);
                    Log.d("``````",jsonString);
                }
            }

            @Override
            public void onFailure(Call<FrDto> call, Throwable t) {

            }
        });
        scanLocationbtn = findViewById(R.id.scanlocationbttn);
        scanLocationbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent in = new Intent(EditFaultActivity.this, SearchActivity.class);
                String observation = observationtxt.getText().toString();
                actionTaken = actiontakentxt.getText().toString();
                frId = faultIdtxt.getText().toString();
                locationDesc = locdescrptiontxt.getText().toString();
                faultCategoryDesc= fdescriptiontxt.getText().toString();
                reportedDate = reportedDatetxt.getText().toString();
                reportedTime = reportedTimetxt.getText().toString();
                endDate =enddatespinner.getText().toString();
                endTime = endtimespinner.getText().toString();


                Log.d("OOOOTTTT",observation);


                if(!editTextList.isEmpty()){
                    for(int nremaks=0;nremaks<editTextList.size();nremaks++){
                        String addedRemarks = editTextList.get(nremaks).getText().toString();
                        if(!addedRemarks.trim().isEmpty()){
                            remarksList.add(addedRemarks);
                            Log.d("ADDEDRRRRMM>", String.valueOf(remarksList.size()));
                        }else remarksList=null;

                    }
                }


                FrDto frDto = new FrDto(frId, clientFrId,
                        customerRefId, requestorName, requestorContactNo,
                        location,building, division,
                        locationDesc, faultCategory,
                        priority,department, maintGrp,
                        remarksList, status,faultCategoryDesc,
                        locationName, buildingName, departmentName,
                        maintGrpName, priorityName,faultCategoryName,
                        cost,editable,quotationStatus,  acknowledgerCode, purchaseOrder,
                        attendedBy,technicianSignature, completedBy,eotType,
                        equipment,observation, actionTaken,costCenter,  labourHrs,
                        images,  activationTime, arrivalTime,  restartTime,locationScanned,
                        responseTime,downTime, pauseTime,  completionTime, acknowledgementTime,
                        eotTime,repDate,  fmmCaseId,  repTime,  workspace, requesterName,
                        maintenanceGroup, faultDetail, createdBy, createdDate,
                        startDate, endDate,  costId,  startTime,  endTime,
                        reasonForOutstanding,  equipmentName,  divisionName,  updatedBy);
                String sentUpdatefault = new Gson().toJson(frDto);
                Log.d(">>>>???",sentUpdatefault);
                Call<Void>updatefaultCall = ApiClient.getUserServices().updateFault(frDto,username,token,workspace);
                updatefaultCall.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {
                        if(response.code()==200){
                            Toast.makeText(EditFaultActivity.this,"Fault reported updated",Toast.LENGTH_SHORT).show();
                            view.getContext().startActivity(in);

                        }
                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {

                    }
                });


            }
        });

        initializeFab();
       // Log.d("RRRRRRDDDOOOO",repDate);

        //dateParser();

    }

    private void deleteRemarks(View view) {
        //if (!editTextList.isEmpty()) {
            if (linearLayout.getChildCount() > 1) {
               // if (autoCompleteSpinner.getText().equals("Closed")) {
                    if (linearLayout.getChildCount() > 2) {
                      linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
                       // int index = editTextList.size() - 1;
                       // editTextList.remove(index);
                    }
                } else {
                   linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
                   // int index = editTextList.size() - 1;
                   // editTextList.remove(index);
                }
            //}
        //}
    }

    private void initializeFab() {
        fab_before.setAlpha(0f);
        fab_after.setAlpha(0f);
        fab_before.setTranslationY(translationY);
        fab_after.setTranslationY(translationY);
       /* fabPurchaseOrder.setAlpha(0f);
        fabQuoteUpload.setAlpha(0f);
        fabQuoteUpload.setTranslationY(translationY);
        fabPurchaseOrder.setTranslationY(translationY);*/
       /* fabQuoteMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isMenuOpenQuote) {
                    closeQuote();
                } else {
                    openQuote();
                }
            }
        });
        fabPurchaseOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditFaultOnSearchActivity.this, ViewPurchaseOnly.class);
                intent.putExtra("token", token);
                intent.putExtra("value", "Before");
                intent.putExtra("checkForFrid", frid);
                intent.putExtra("role", role);
                intent.putExtra("workspace", workSpaceid);
                intent.putExtra("frId", frIdEditText.getText().toString());
                intent.putExtra("status", autoCompleteSpinner.getText().toString());
                startActivity(intent);
            }
        });
        fabQuoteUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditFaultOnSearchActivity.this, UploadFile.class);
                intent.putExtra("token", token);
                intent.putExtra("value", "Before");
                intent.putExtra("checkForFrid", frid);
                intent.putExtra("role", role);
                intent.putExtra("workspace", workSpaceid);
                intent.putExtra("frId", frIdEditText.getText().toString());
                intent.putExtra("status", autoCompleteSpinner.getText().toString());
                startActivity(intent);
            }
        });*/
        fab_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (isMenuOpen) {
                    closeMenu();
                    Toast.makeText(EditFaultActivity.this,"Camera pressed",Toast.LENGTH_SHORT).show();
                    /*fabLayoutQuotation.setVisibility(View.VISIBLE);*/
                } else {
                    openMenu();
                    /* fabLayoutQuotation.setVisibility(View.GONE);*/
                }
            }
        });
        fab_before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditFaultActivity.this, ImageActivity.class);
                intent.putExtra("token", token);
                intent.putExtra("value", "Before");
                intent.putExtra("checkForFrid", frId);
                intent.putExtra("role", role);
                intent.putExtra("fromFrDetail", "FrDetailPaGE");
                intent.putExtra("workspace", workspace);
               // intent.putExtra("frId", frIdEditText.getText().toString());
               // intent.putExtra("status", autoCompleteSpinner.getText().toString());
                startActivity(intent);
            }
        });
        fab_after.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditFaultActivity.this, ImageActivity.class);
              intent.putExtra("token", token);
                intent.putExtra("value", "After");
                intent.putExtra("checkForFrid", frId);
               // intent.putExtra("fromFrDetail", "FrDetailPaGE");
                intent.putExtra("workspace", workspace);
                 intent.putExtra("role", role);
                 /*intent.putExtra("status", autoCompleteSpinner.getText().toString());
                intent.putExtra("frId", frIdEditText.getText().toString());*/
                startActivity(intent);
            }
        });
    }

   /* private void closeQuote() {
        isMenuOpenQuote = !isMenuOpenQuote;
        fabQuoteMain.animate().setInterpolator(interpolator).rotation(0f).setDuration(300).start();
        fabQuoteUpload.animate().translationY(translationY).setInterpolator(interpolator).setDuration(300).start();
        fabPurchaseOrder.animate().translationY(translationY).setInterpolator(interpolator).setDuration(300).start();
    }

    private void openQuote() {
        isMenuOpenQuote = !isMenuOpenQuote;
        fabQuoteMain.animate().setInterpolator(interpolator).rotation(0f).setDuration(300).start();
        fabPurchaseOrder.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        fabQuoteUpload.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
    }*/

    private void openMenu() {
        isMenuOpen = !isMenuOpen;
        fab_main.animate().setInterpolator(interpolator).rotation(0f).setDuration(300).start();
        fab_before.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        fab_after.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
    }

    private void closeMenu() {
        isMenuOpen = !isMenuOpen;
        fab_main.animate().setInterpolator(interpolator).rotation(0f).setDuration(300).start();
        fab_before.animate().translationY(translationY).setInterpolator(interpolator).setDuration(300).start();
        fab_after.animate().translationY(translationY).setInterpolator(interpolator).setDuration(300).start();
    }
    private void showDatePicker(){
        int day,month,year;
        final Calendar cal = Calendar.getInstance();
        day = cal.get(Calendar.DAY_OF_MONTH);
        month = cal.get(Calendar.MONTH);
        year = cal.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog = new DatePickerDialog(EditFaultActivity.this, android.R.style.Theme_DeviceDefault_Light_Dialog, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int day, int month, int year) {
                enddatespinner.setText(year+"-"+(month+1)+"-"+day);

            }
        },day,month,year);
        datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis()-1000);
        datePickerDialog.show();
    }
    private void showTimePicker(){
        final  Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog;


            timePickerDialog = new TimePickerDialog(EditFaultActivity.this, android.R.style.Theme_DeviceDefault_Light_Dialog, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int hour, int minute) {

                    endtimespinner.setText(String.format(Locale.getDefault(),"%02d:%02d",hour,minute));

                }
            },hour,minute,true);
            timePickerDialog.show();

        }
    @NotNull
    private TextView createNewEditText(String remarksString, int remarksId) {
        LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(LinearLayout
                .LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lparams.setMargins(20, 8, 20, 8);
        editTextRemarks = new TextInputEditText(this);
        editTextRemarks.setId(remarksId);
        Log.d("RRRIDDD", String.valueOf(editTextRemarks.getId()));

        //editTextRemarks.setBackgroundResource(R.drawable.mybutton);
        editTextRemarks.setText(remarksString);

        editTextRemarks.setLayoutParams(lparams);
        editTextRemarks.setPadding(35, 30, 30, 30);
        editTextRemarks.setHint("   add remarks");
        editTextRemarks.setMinHeight(60);
        editTextRemarks.setMaxWidth(linearLayout.getWidth());
      editTextList.add(editTextRemarks);
      for(int i=0;i<editTextList.size();i++){
          String ediv = editTextList.get(i).getText().toString();

          Log.d("vvvaavaedd",ediv);

      }

        return editTextRemarks;
    }




}