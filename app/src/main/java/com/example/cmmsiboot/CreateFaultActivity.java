    package com.example.cmmsiboot;

    import android.app.Activity;
    import android.app.AlertDialog;
    import android.app.DatePickerDialog;
    import android.app.TimePickerDialog;
    import android.content.Context;
    import android.content.DialogInterface;
    import android.content.Intent;
    import android.graphics.Bitmap;
    import android.media.Image;
    import android.os.Build;
    import android.os.Bundle;
    import android.provider.MediaStore;
    import android.text.TextUtils;
    import android.util.Base64;
    import android.util.Log;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.animation.OvershootInterpolator;
    import android.widget.AdapterView;
    import android.widget.ArrayAdapter;
    import android.widget.AutoCompleteTextView;
    import android.widget.Button;
    import android.widget.DatePicker;
    import android.widget.EditText;
    import android.widget.TimePicker;
    import android.widget.Toast;

    import androidx.annotation.Nullable;
    import androidx.annotation.RequiresApi;

    import com.example.cmmsiboot.Workspace.WorkspaceActivity;
    import com.google.android.material.floatingactionbutton.FloatingActionButton;
    import com.google.android.material.textfield.TextInputEditText;
    import com.google.android.material.timepicker.MaterialTimePicker;
    import com.google.gson.Gson;
    import com.google.gson.JsonArray;
    import com.google.gson.JsonObject;


    import org.json.JSONException;
    import org.json.JSONObject;

    import java.io.ByteArrayOutputStream;
    import java.text.DateFormat;
    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Calendar;
    import java.util.Date;
    import java.util.List;
    import java.util.Locale;

    import retrofit2.Call;
    import retrofit2.Callback;
    import retrofit2.Response;

    public class CreateFaultActivity extends MybaseActivity {
        /*  private final String  workspace ="cmms-DEM-082018-001";
          private final String  token ="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTY1NjA5MzM3MCwiaWF0IjoxNjU1OTg1MzcwfQ.v2w-Uxy-HPDQWb5Ou7eEiHiIa7A53rdbkaS_pDkP0DM_UzXUwSwgG6NmLls21f4nEcDQlytvm5wkP4O7IGJEaw";
          private final String  username ="ADMIN";*/
        private Context context;
        private static final String SHARED_PREF = "";
        public TextInputEditText fridd, contact, equipmentTxt;
        private Boolean isMenuOpen = false;
        private final OvershootInterpolator interpolator = new OvershootInterpolator();
        private Float translationY = 600f;
        String frId,imagebs64fromcamera;
        EditText Datetxt, Timetxt, endDatetxt, endTimetxt, locdestxt, faultcatDestxt, requesterNameTxt;
        //public  int depId,buildId,priorityId,faultCat,maintGrpId,divisionId=0;
        public int depId,buildId, priorityId, faultCat, maintGrpId, divisionId,equipmentId,locId,faultId;

        AutoCompleteTextView departmentspinner, buildingspinner, locationspinner, priorityspinner,
                faultcatagspinner, maintegrpspinner, divisionspinner, startdatespinner, startTimespinner,
                endDatespinner, endTimespinner;
        private List<list> genralDepList = new ArrayList<>();
        private List<list> genralBuildingList = new ArrayList<>();
        private List<list> genralLocationList = new ArrayList<>();
        private List<list> genralEquipment = new ArrayList<>();
        private List<list> genralPriorityList = new ArrayList<>();
        private List<list> genralFaultCatList = new ArrayList<>();
        private List<list> genralFaultMaintGrp = new ArrayList<>();
        private List<list> genralDivisionList = new ArrayList<>();
        private List<list> generalTechList = new ArrayList<list>();
        private ArrayAdapter<list> deptListAdapter;
        private ArrayAdapter<list> buildingAdapter;
        private ArrayAdapter<list> locationAdapter;
        private ArrayAdapter<list> priAdapter;
        private ArrayAdapter<list> faultCatAdapter;
        private ArrayAdapter<list> maintAdapter;
        private ArrayAdapter<list> divisionAdapter;
        private Button createFaultBtn, technicianbtn, equipmentbtn;
        private FloatingActionButton bfImageBtn,cambtn,aftBtn;

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


        //Constructor Strings


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
        List<String> remarks;
        List<AttendedBy> attendedBy;
        String spinnertext;
        ArrayList<Integer> techList = new ArrayList<>();
        List<String> stockList = new ArrayList<>();
        String[] listItems;
        boolean[] checkedItems;
        EditText technicianTxt;
        List attendedByIdsList;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            Intent creIn = getIntent();
            imagebs64fromcamera=creIn.getStringExtra("createImageFa");
           // images= ccimagebs64;
            //Log.d("BASE^$STRINGSENT",images);

         /*





        List<String> genralLoaction = new ArrayList<String>();
               List<String> genralEquipment = new ArrayList<String>();
             List<String> genraltechlist = new ArrayList<String>();
     ArrayAdapter<list> deptListAdapter;

               ArrayAdapter<String> divisionAdapter;




                ArrayAdapter<String> locationAdapter;
              ArrayAdapter<String> equipmentAdapter;
              TextInputEditText frid,contact,locdes;
              TextInputEditText faultcatag,faultdesc,division, technician;
              AutoCompleteTextView department,building,location,equipment,priority,maintegrp;
              Button createFaultBtn;*/

            super.onCreate(savedInstanceState);
            LayoutInflater layoutInflater = LayoutInflater.from(this);
            View viewLayout = layoutInflater.inflate(R.layout.activity_create_fault, null, false);
            drawer.addView(viewLayout, 0);
            pageTitle.setText("Create Fault Report");
            attendedByIdsList = new ArrayList();
            //fridd = findViewById(R.id.frId);
            //frId = fridd.getText().toString();

            bfImageBtn = findViewById(R.id.before_id);
            cambtn = findViewById(R.id.images_id) ;
            departmentspinner = findViewById(R.id.departmentSpinner);
            buildingspinner = findViewById(R.id.buildingSpinner);
            locationspinner = findViewById(R.id.locationSpinner);
            priorityspinner = findViewById(R.id.prioritySpinner);
            faultcatagspinner = findViewById(R.id.faultCategorySpinner);
            maintegrpspinner = findViewById(R.id.selectMaintenanceSpinner);
            divisionspinner = findViewById(R.id.divisionSpinner);
            createFaultBtn = findViewById(R.id.buttonCreateFaultReport);
            startdatespinner = findViewById(R.id.startDate);
            startTimespinner = findViewById(R.id.startTime);
            technicianbtn = findViewById(R.id.select_tech);
            equipmentbtn = findViewById(R.id.equipment_btn);
            equipmentTxt = findViewById(R.id.equipment_textview);

            equipmentbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(CreateFaultActivity.this, SearchEquipmentActivity.class);
                    startActivityForResult(intent, 1);
                    //finish();
                }


            });


            // Toast.makeText(getApplicationContext(),equipmentSearched,Toast.LENGTH_LONG).show();
            //??? Log.d("SEARCHEDEEEEE&&&&77",equipmentSearched);


            technicianbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder tbuilder = new AlertDialog.Builder(CreateFaultActivity.this);
                    tbuilder.setTitle("Select Tecnician");


                    tbuilder.setMultiChoiceItems(listItems, checkedItems, (dialog, position, isChecked) -> {
                        if (isChecked) {
                            if (!techList.contains(position)) {
                                techList.add(position);

                            }

                        } else if (techList.contains(position)) {
                            techList.remove(position);
                        }

                    });
                    tbuilder.setCancelable(false);
                    tbuilder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            String item = "";
                            for (int i = 0; i < techList.size(); i++) {
                                item = item + listItems[techList.get(i)];
                                if (i != techList.size() - 1) {
                                    item = item + ", ";
                                }

                            }

                            technicianTxt.setText(item);
                        }
                    });
                    tbuilder.show();
                    tbuilder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            dialogInterface.dismiss();
                        }
                    });

                }
            });


            startdatespinner.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showDatePickerDialogue();
                }

                private void showDatePickerDialogue() {
                    int day, month, year;
                    final Calendar cal = Calendar.getInstance();
                    day = cal.get(Calendar.DAY_OF_MONTH);
                    month = cal.get(Calendar.MONTH);
                    year = cal.get(Calendar.YEAR);

                    DatePickerDialog datePickerDialog = new DatePickerDialog(CreateFaultActivity.this, android.R.style.Theme_DeviceDefault_Light_Dialog, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker datePicker, int day, int month, int year) {
                            startdatespinner.setText(year + "-" + (month + 1) + "-" + day);

                        }
                    }, day, month, year);
                    datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
                    datePickerDialog.show();
                }
            });
            startTimespinner.setOnClickListener(new View.OnClickListener() {
                final Calendar cal = Calendar.getInstance();
                int hour = cal.get(Calendar.HOUR);
                int minute = cal.get(Calendar.MINUTE);

                @Override
                public void onClick(View view) {

                    showTimepickerDialogue();
                }

                private void showTimepickerDialogue() {
                    TimePickerDialog timePickerDialog;


                    timePickerDialog = new TimePickerDialog(CreateFaultActivity.this, android.R.style.Theme_DeviceDefault_Light_Dialog, new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker timePicker, int hour, int minute) {

                            startTimespinner.setText(String.format(Locale.getDefault(), "%02d:%02d", hour, minute));

                        }
                    }, hour, minute, true);
                    timePickerDialog.show();

                }
            });

            //contact = findViewById(R.id.contactNumber_fault);
            //Log.d("CONTA@",contact.getText().toString());

            /*location = findViewById(R.id.locationSpinner);
            equipment = findViewById(R.id.equipment_textview);


            locdes = findViewById(R.id.LocationDescriptionEditText);



            technician = findViewById(R.id.techtv);
            */
            //A*
            deptListAdapter = new ArrayAdapter<>(CreateFaultActivity.this, android.R.layout.simple_spinner_dropdown_item, genralDepList);
            deptListAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            departmentspinner.setAdapter(deptListAdapter);
            departmentspinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                    list item = (list) parent.getItemAtPosition(position);
                     depId = item.id;
                    String depname = item.name;
                    // Log.d("DepartmentIDDAAAAA+", String.valueOf(ddd));
                    //Log.d("DepartmentIDDAAAAA+", String.valueOf(item.id));
                  /*  //int[] fff={0};
                    //fff[0]=item.id;
                  for(int i=0;i<item.id;i++){
                      Log.d("LISTLENGTH&&&",String.valueOf(i));
                  }*/

                    department.setId(depId);
                    department.setName(depname);


                }

            });


            buildingAdapter = new ArrayAdapter<>(CreateFaultActivity.this, android.R.layout.simple_spinner_dropdown_item, genralBuildingList);
            buildingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            buildingspinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                    list item = (list) parent.getItemAtPosition(position);
                    //String item= parent.getItemAtPosition(position).toString();

                buildId = item.id;
                    String bulName = item.name;
                    //Log.d("B_____", String.valueOf(buildId));

                    building.setId(buildId);
                    building.setName(bulName);
                    callSpinnerLoc(buildId);

                    //Toast.makeText(CreateFaultActivity.this,buildId, Toast.LENGTH_SHORT).show();

                }
            });


            locationAdapter = new ArrayAdapter<>(CreateFaultActivity.this, android.R.layout.simple_spinner_dropdown_item, genralLocationList);
            locationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            locationspinner.setAdapter(locationAdapter);
            locationspinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                    list item = (list) parent.getItemAtPosition(position);
                   locId = item.id;
                    String locname = item.name;
                    location.setId(locId);
                    location.setName(locname);
                    // Log.d("DepartmentIDDAAAAA+", String.valueOf(ddd));
                    //Log.d("DepartmentIDDAAAAA+", String.valueOf(item.id));
                  /*  //int[] fff={0};
                    //fff[0]=item.id;
                  for(int i=0;i<item.id;i++){
                      Log.d("LISTLENGTH&&&",String.valueOf(i));
                  }*/

                    //  location.setId(ddd);
                    // location.setName(depname);


                }

            });
            priAdapter = new ArrayAdapter<>(CreateFaultActivity.this, android.R.layout.simple_spinner_dropdown_item, genralPriorityList);
            priAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            priorityspinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                    list item = (list) parent.getItemAtPosition(position);
                  priorityId = item.id;
                    String priName = item.name;
                    priority.setId(priorityId);
                    //NOT SET BECAUSE IN LIST CLASS SETTER IS EDITTED TO SET NAME AS IT TOSTRING METHOD SHOWS NAME
                    // priority.setPriorityId(priName);
                }
            });
            faultCatAdapter = new ArrayAdapter<>(CreateFaultActivity.this, android.R.layout.simple_spinner_dropdown_item, genralFaultCatList);
            faultCatAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            faultcatagspinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                    list item = (list) parent.getItemAtPosition(position);
                    //faultCat = item.id;
                   faultId = item.id;
                    String facName = item.name;
                    faultCategory.setId(faultId);
                    faultCategory.setName(facName);

                }
            });

            maintAdapter = new ArrayAdapter<>(CreateFaultActivity.this, android.R.layout.simple_spinner_dropdown_item, genralFaultMaintGrp);
            maintAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            maintegrpspinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                    list item = (list) parent.getItemAtPosition(position);
                    //maintGrpId = item.id;
                  maintGrpId = item.id;
                    String maintGrName = item.name;
                    maintGrp.setId(maintGrpId);
                    maintGrp.setName(maintGrName);
                }
            });
            divisionAdapter = new ArrayAdapter<>(CreateFaultActivity.this, android.R.layout.simple_spinner_dropdown_item, genralDivisionList);
            divisionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            divisionspinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                    list item = (list) parent.getItemAtPosition(position);
                    //divisionId = item.id;
                 divisionId = item.id;
                    String divisName = item.name;
                    // division.setId(divisionId);
                    division.setId(divisionId);
                    division.setName(divisName);
                }
            });



            /*Intent sintent = getIntent();
            String wId = sintent.getStringExtra("workSpaceId");
            SharedPreferences preferences = this.getApplicationContext().getSharedPreferences(SHARED_PREF, MODE_PRIVATE);
            String wname = preferences.getString("name", "");
            String token = preferences.getString("token", "");
            String workspace = preferences.getString("workspaceId", "");
            Log.d("MANEEEEEEE", wname);
            Log.d("TOKENNNNN", token);
            Log.d("WRRRRRR", workspace);*/


           /* Call<JsonObject> call = ApiClient.getUserServices().createFaultReport(faultReportDTO, username, token, workspace);
            call.enqueue(new Callback<JsonObject>() {
                @Override
                public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                    if (response.code() == 200) {
                        JsonObject js = response.body();

                        Toast.makeText(CreateFaultActivity.this, "Create Success", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<JsonObject> call, Throwable t) {

                }
            });*/

            //#calls
            initViews();
            callSpinnerDep();
            callSpinnerBuiildings();
            callSpinnerPriority();
            callSpinnerFaultCategory();
            callSpinnerMaintGrp();
            callSpinnerDivision();
            getTechnicians();
            //callEquipment();

            // NEED TO BE PLACED IN THE CREATE METHOD TO DISPLAY SENT JSONNNNNNNNNN
          /*  String jsonString = new Gson().toJson(frDto);
            Log.d("JsonString____________",jsonString);*/
            //initializeFab();


        }

        public void callSpinnerDep() {
            Call<JsonArray> call = ApiClient.getUserServices().getDepartment(token, workspace);
            call.enqueue(new Callback<JsonArray>() {
                @Override
                public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {
                    if (response.code() == 200) {
                        JsonArray jsonArrayDepList = response.body();
                        for (int i = 0; i < jsonArrayDepList.size(); i++) {
                            String name = jsonArrayDepList.get(i).getAsJsonObject().get("name").getAsString();
                            int id = jsonArrayDepList.get(i).getAsJsonObject().get("id").getAsInt();
                            Log.d("DepartmentNNNNNNN", name);
                            genralDepList.add(new list(name, id));
                            departmentspinner.setAdapter(deptListAdapter);

                        }

                    }
                }

                @Override
                public void onFailure(Call<JsonArray> call, Throwable t) {

                }
            });
        }


        public void callSpinnerBuiildings() {
            Call<JsonArray> call = ApiClient.getUserServices().getBuildings(token, workspace);
            call.enqueue(new Callback<JsonArray>() {
                @Override
                public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {
                    if (response.code() == 200) {
                        JsonArray jsonArrayBuilding = response.body();
                        for (int i = 0; i < jsonArrayBuilding.size(); i++) {
                            String name = jsonArrayBuilding.get(i).getAsJsonObject().get("name").getAsString();
                            int id = jsonArrayBuilding.get(i).getAsJsonObject().get("id").getAsInt();
                            Log.d("Buildigsssss", name);
                            genralBuildingList.add(new list(name, id));
                            buildingspinner.setAdapter(buildingAdapter);

                        }

                    }
                }

                @Override
                public void onFailure(Call<JsonArray> call, Throwable t) {

                }
            });
        }


        public void callSpinnerLoc(int buildId) {
            Call<JsonArray> call = ApiClient.getUserServices().getLocation(token, String.valueOf(buildId));
            call.enqueue(new Callback<JsonArray>() {
                @Override
                public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {
                    if (response.code() == 200) {
                        JsonArray jsonArrayDepList = response.body();
                        for (int i = 0; i < jsonArrayDepList.size(); i++) {
                            String name = jsonArrayDepList.get(i).getAsJsonObject().get("name").getAsString();
                            int id = jsonArrayDepList.get(i).getAsJsonObject().get("id").getAsInt();
                            Log.d("DepartmentNNNNNNN", name);
                            genralLocationList.add(new list(name, id));
                            locationspinner.setAdapter(locationAdapter);

                        }

                    }
                }

                @Override
                public void onFailure(Call<JsonArray> call, Throwable t) {

                }
            });
        }
   /*     public void callEquipment(){
            Call<JsonArray> call = ApiClient.getUserServices().getEquipments(token,workspace);
            call.enqueue(new Callback<JsonArray>() {
                @Override
                public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {
                    if(response.code()==200){
                        JsonArray jsonArrayEquipList = response.body();
                        for(int i=0;i<jsonArrayEquipList.size();i++){
                            Log.d("equipmentARRAYLIST",String.valueOf(jsonArrayEquipList)+i++);

                        }
                    }
                }

                @Override
                public void onFailure(Call<JsonArray> call, Throwable t) {

                }
            });
        }*/

        public void callSpinnerPriority() {
            Call<JsonArray> call = ApiClient.getUserServices().getPriority(token, workspace);
            call.enqueue(new Callback<JsonArray>() {
                @Override
                public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {
                    if (response.code() == 200) {
                        JsonArray jsonArrayPriority = response.body();
                        for (int i = 0; i < jsonArrayPriority.size(); i++) {
                            String name = jsonArrayPriority.get(i).getAsJsonObject().get("priorityId").getAsString();
                            int id = jsonArrayPriority.get(i).getAsJsonObject().get("id").getAsInt();
                            Log.d("PriorityYYYY", name);
                            genralPriorityList.add(new list(name, id));
                            priorityspinner.setAdapter(priAdapter);

                        }

                    }
                }

                @Override
                public void onFailure(Call<JsonArray> call, Throwable t) {

                }
            });
        }

        public void callSpinnerFaultCategory() {
            Call<JsonArray> call = ApiClient.getUserServices().getFaultCategories(token, workspace);
            call.enqueue(new Callback<JsonArray>() {
                @Override
                public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {
                    if (response.code() == 200) {
                        JsonArray jsonArrayFaultCat = response.body();
                        for (int i = 0; i < jsonArrayFaultCat.size(); i++) {
                            String name = jsonArrayFaultCat.get(i).getAsJsonObject().get("name").getAsString();
                            int id = jsonArrayFaultCat.get(i).getAsJsonObject().get("id").getAsInt();
                            Log.d("FaultCatGOOOO", name);
                            genralFaultCatList.add(new list(name, id));
                            faultcatagspinner.setAdapter(faultCatAdapter);

                        }

                    }
                }

                @Override
                public void onFailure(Call<JsonArray> call, Throwable t) {

                }
            });
        }

        public void callSpinnerMaintGrp() {
            Call<JsonArray> call = ApiClient.getUserServices().getMaintenanceGrp(token, workspace);
            call.enqueue(new Callback<JsonArray>() {
                @Override
                public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {
                    if (response.code() == 200) {
                        JsonArray jsonArrayMaintGrp = response.body();
                        for (int i = 0; i < jsonArrayMaintGrp.size(); i++) {
                            String name = jsonArrayMaintGrp.get(i).getAsJsonObject().get("name").getAsString();
                            int id = jsonArrayMaintGrp.get(i).getAsJsonObject().get("id").getAsInt();
                            Log.d("FaultCatGOOOO", name);
                            genralFaultMaintGrp.add(new list(name, id));
                            maintegrpspinner.setAdapter(maintAdapter);

                        }

                    }
                }

                @Override
                public void onFailure(Call<JsonArray> call, Throwable t) {

                }
            });
        }

        public void callSpinnerDivision() {
            Call<JsonArray> call = ApiClient.getUserServices().getDivision(token, workspace);
            call.enqueue(new Callback<JsonArray>() {
                @Override
                public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {
                    if (response.code() == 200) {
                        JsonArray jsonArrayDiv = response.body();
                        for (int i = 0; i < jsonArrayDiv.size(); i++) {
                            String name = jsonArrayDiv.get(i).getAsJsonObject().get("name").getAsString();
                            int id = jsonArrayDiv.get(i).getAsJsonObject().get("id").getAsInt();
                            Log.d("DivisionDDDD", name);
                            genralDivisionList.add(new list(name, id));
                            divisionspinner.setAdapter(divisionAdapter);

                        }

                    }
                }

                @Override
                public void onFailure(Call<JsonArray> call, Throwable t) {

                }
            });
        }

        public void getTechnicians() {
            Call<JsonArray> call = ApiClient.getUserServices().getTechicians(token, workspace);
            call.enqueue(new Callback<JsonArray>() {
                @Override
                public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {
                    if (response.code() == 200) {
                        JsonArray technicianArrayList = response.body();
                        for (int i = 0; i < technicianArrayList.size(); i++) {
                            int id = technicianArrayList.get(i).getAsJsonObject().get("id").getAsInt();
                            String name = technicianArrayList.get(i).getAsJsonObject().get("name").getAsString();
                            generalTechList.add(new list(name, id));

                            stockList.add(name);

                        }
                        //Log.d("",generalTechList);
                        listItems = new String[stockList.size()];
                        listItems = stockList.toArray(listItems);
                        checkedItems = new boolean[listItems.length];

                    }
                }

                @Override
                public void onFailure(Call<JsonArray> call, Throwable t) {

                }
            });
        }


        // C*

        public void initViews() {
            //selectTech = findViewById(R.id.selecttech);
            //techTv = findViewById(R.id.techtv);
            //eqwuipmentTextView = findViewById(R.id.equipment_textview);
            // selectEquipBtn = findViewById(R.id.select_equip_btn);
            // requestorNameEditText = findViewById(R.id.requestorNameEditText);
            contact = findViewById(R.id.contactNumber_fault);
            technicianTxt = findViewById(R.id.techtv);
            locdestxt = findViewById(R.id.LocationDescriptionEditText);
            faultcatDestxt = findViewById(R.id.FaultDescriptionEditText);
            requesterNameTxt = findViewById(R.id.requester_name);


            // equipmentTxt=findViewById(R.id.equipment_textview);


            //locationDescriptionEditText = findViewById(R.id.LocationDescriptionEditText);
            //faultDescriptionEditText = findViewById(R.id.FaultDescriptionEditText);
            // departmentspinner = findViewById(R.id.departmentSpinner);
            //buildingspinner = findViewById(R.id.buildingSpinner);
            //spinnerTechnician = findViewById(R.id.techSpinner);
            //locationSpinner = findViewById(R.id.locationSpinner);
            //priorityspinner = findViewById(R.id.prioritySpinner);
            //divisionspinner = findViewById(R.id.divisionSpinner);
            //faultcatagspinner = findViewById(R.id.faultCategorySpinner);
            //maintegrpspinner = findViewById(R.id.selectMaintenanceSpinner);
            //createFaultBtn = findViewById(R.id.buttonCreateFaultReport);
            //equipmentSpinner = findViewById(R.id.equipmentSpinner);

            genralDepList.add(new list("Select dept", 0));
             //genralEquipment.add(new list("Select Equipment", 0));
            genralPriorityList.add(new list("Select Priority", 0));
            genralDivisionList.add(new list("Select Division", 0));
            genralBuildingList.add(new list("Select Building", 0));
            genralFaultCatList.add(new list("Select Fault Categories", 0));
            genralFaultMaintGrp.add(new list("Select Maintainence", 0));
            //genralLoaction.add(new list("Select Location", 0));
            createFaultBtn.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.N)
                @Override
                public void onClick(View v) {
                    createFault();


                }
            });


        }

        public void createFault() {

            requestorContactNo = contact.getText().toString();
            String startDatet = startdatespinner.getText().toString();
            String startTimet = startTimespinner.getText().toString();
            locationDesc = locdestxt.getText().toString();
            faultCategoryDesc = faultcatDestxt.getText().toString();
            requestorName = requesterNameTxt.getText().toString();


            //technicianTxt = findViewById(R.id.techtv);
            String attendeby = technicianTxt.getText().toString();
            List<String> attendedbyList = Arrays.asList(attendeby.split(", "));
            Log.d("attendedbyNUMBERONCREATE", String.valueOf(attendedbyList.size()));
            for (int j = 0; j < attendedbyList.size(); j++) {
                String name = attendedbyList.get(j);
                for (list list : generalTechList) {
                    if (list.getName().equals(name)) {
                        Integer idd = list.id;
                        attendedByIdsList.add(idd);
                    }
                }
            }
            ArrayList<AttendedBy> attendedBy = new ArrayList<>();

            for (int k = 0; k < attendedByIdsList.size(); k++) {
                AttendedBy attendedbyObject = new AttendedBy();
                attendedbyObject.setId((Integer) attendedByIdsList.get(k));
                attendedBy.add(attendedbyObject);
            }

            boolean editable = false, locationScanned = false;

            //Time Formate

            String datentime = startDatet + " " + startTimet + ":" + 00;
            Date initdate = null;
            try {
                initdate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(datentime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat formatter = null;
            formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            String parsedDate = formatter.format(initdate);
            Log.d("DateFomateed", parsedDate);
            //reportedDate =parsedDate;
            reportedTime = parsedDate;


            //DATE PARSING AND MAKING REQUIRED FORMATE

            String dateString = startDatet + " " + "00:00:00";
            Date sdate = null;
            try {
                sdate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(dateString);


            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat simpleDateFormat = null;
            formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            String dateparsed = formatter.format(sdate);
            Log.d("NEWDATTTTTTTTT", dateparsed);
            reportedDate = dateparsed;

            //FaultReportDTO faultReportDTO = new FaultReportDTO(buildingObject,divisionObject,faultCategoryObject,priorityObject,departmentObject,maintGrpObject);
            //images =imagebs64fromcamera;
            if(requestorName.isEmpty()){
                requesterNameTxt.setError("Please Enter Requestor Name");
                Toast.makeText(this, "Please Enter Requestor Name", Toast.LENGTH_SHORT).show();

            } else if (depId == 0) {
                departmentspinner.setError("Please Select Department");
                Toast.makeText(this, "Please Select Department", Toast.LENGTH_SHORT).show();

            } else if (buildId == 0) {
                buildingspinner.setError("Please Select Building");
                Toast.makeText(this, "Please Select Building", Toast.LENGTH_SHORT).show();
            } else if (locId==0){
                locationspinner.setError("Please Select Location");
                Toast.makeText(this, "Please Select Toast", Toast.LENGTH_SHORT).show();
                /*departmentspinner, buildingspinner, locationspinner, priorityspinner,
                        faultcatagspinner, maintegrpspinner, divisionspinner, startdatespinner, startTimespinner,
                        endDatespinner, endTimespinner;*/
            /*}else if (equipmentId==0){
                equipmentTxt.setError("Please Select Equipment");
                Toast.makeText(this, "Please Select Equipment", Toast.LENGTH_SHORT).show();*/
            }else if (TextUtils.isEmpty(contact.getText())||requestorContactNo.length() < 10){
                contact.setError("Please Enter Contact no");
                Toast.makeText(this, "Please Enter Contact No", Toast.LENGTH_SHORT).show();
            }else if (priorityId==0){
                priorityspinner.setError("Please Select Priority");
                Toast.makeText(this, "Please Select Priority", Toast.LENGTH_SHORT).show();

            }else if ( TextUtils.isEmpty(locdestxt.getText())){
                locdestxt.setError("Location description is needed");
                Toast.makeText(this, "Loaction Description is Needed", Toast.LENGTH_SHORT).show();
            }else if (faultId==0){
                faultcatagspinner.setError("Please Select Fault Category");
                Toast.makeText(this, "Please Select Fault Category", Toast.LENGTH_SHORT).show();
            }else if ( TextUtils.isEmpty(faultcatDestxt.getText())){
                faultcatDestxt.setError("Fault description is Needed");
                Toast.makeText(this, "Fault description is Needed", Toast.LENGTH_SHORT).show();
            }else if (maintGrpId==0){
                maintegrpspinner.setError("Please Select Maintainance Group");
                Toast.makeText(this, "Please Select Maintainance Group", Toast.LENGTH_SHORT).show();

            }else if (divisionId==0){
                divisionspinner.setError("Please Select Division");
                Toast.makeText(this, "Please Select Division", Toast.LENGTH_SHORT).show();
            }else if (attendedByIdsList.isEmpty()){
                technicianTxt.setError("Please Select Technician");
                Toast.makeText(this, "Please Select Technician", Toast.LENGTH_SHORT).show();
            }else {

                FrDto frDto = new FrDto(frId, clientFrId,
                        customerRefId, requestorName, requestorContactNo,
                        location, building, division,
                        locationDesc, faultCategory,
                        priority, department, maintGrp,
                        remarks, status, faultCategoryDesc,
                        locationName, buildingName, departmentName,
                        maintGrpName, priorityName, faultCategoryName,
                        cost, editable, quotationStatus, acknowledgerCode, purchaseOrder,
                        attendedBy, technicianSignature, completedBy, eotType,
                        equipment, observation, actionTaken, costCenter, labourHrs,
                        images, activationTime, arrivalTime, restartTime, locationScanned,
                        responseTime, downTime, pauseTime, completionTime, acknowledgementTime,
                        eotTime, reportedDate, fmmCaseId, reportedTime, workspace, requesterName,
                        maintenanceGroup, faultDetail, createdBy, createdDate,
                        startDate, endDate, costId, startTime, endTime,
                        reasonForOutstanding, equipmentName, divisionName, updatedBy);
                   /* Log.d("REQUESTOR___________", frDto.getRequestorName());
                    Log.d("REQESRE*********", frDto.getRequesterName());
                    Log.d("CFR*********", frDto.getClientFrId().toString());
                    Log.d("RDATE", frDto.getReportedDate());
                    Log.d("CCCCCCC++++", frDto.getRequestorContactNo());*/
                //JsonObject j = new JsonObject();
                //FrDto frDto = new FrDto();
                // Log.d("IIIDIDDIID",String.valueOf(equipment.getId()));


                String jsonString = new Gson().toJson(frDto);
                Log.d("~~~~~", jsonString);
                AlertDialog.Builder createDialoge = new AlertDialog.Builder(CreateFaultActivity.this);
                createDialoge.setTitle("Upload Image")
                        .setMessage("Do you wnant to upload image")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // uploadImageOnCreate();
                                Call<JsonObject> call = ApiClient.getUserServices().createFaultReport(frDto, username, token, workspace);
                                call.enqueue(new Callback<JsonObject>() {
                                    @Override
                                    public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                                        JsonObject jso = response.body();
                                        String frrId = "";

                                        if (response.code() == 200) {
                                            try {
                                                JSONObject jsonObject = new JSONObject(String.valueOf(response.body()));
                                                frrId = jsonObject.getString("frId");
                                                Log.d("FRIDRECEIVEDDDD", frrId);

                                            } catch (JSONException e) {
                                                e.printStackTrace();
                                            }


                                            Intent intent = new Intent(CreateFaultActivity.this, ImageActivity.class);
                                            intent.putExtra("checkForFrid", frrId);
                                            intent.putExtra("token", token);
                                            intent.putExtra("value", "Before");
                                            //intent.putExtra("checkForFrid", frId);
                                            intent.putExtra("role", role);
                                            intent.putExtra("fromFrDetail", "FrDetailPaGE");
                                            intent.putExtra("workspace", workspace);
                                            startActivity(intent);

                                            Toast.makeText(getApplicationContext(), "Fault Created", Toast.LENGTH_SHORT).show();
                                        }


                                    }

                                    @Override
                                    public void onFailure(Call<JsonObject> call, Throwable t) {

                                    }
                                });
                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        Call<JsonObject> call = ApiClient.getUserServices().createFaultReport(frDto, username, token, workspace);
                        call.enqueue(new Callback<JsonObject>() {
                            @Override
                            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                                JsonObject jso = response.body();
                                String frrId = "";

                                if (response.code() == 200) {
                                    try {
                                        JSONObject jsonObject = new JSONObject(String.valueOf(response.body()));
                                        frrId = jsonObject.getString("frId");
                                        Log.d("FRIDRECEIVEDDDD", frrId);

                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }


                                    Intent intent = new Intent(CreateFaultActivity.this, SearchActivity.class);
                                /*intent.putExtra("checkForFrid",frrId);
                                intent.putExtra("token", token);
                                intent.putExtra("value", "Before");
                                //intent.putExtra("checkForFrid", frId);
                                intent.putExtra("role", role);
                                intent.putExtra("fromFrDetail", "FrDetailPaGE");
                                intent.putExtra("workspace", workspace);*/
                                    startActivity(intent);
                                    finish();
                                    Toast.makeText(CreateFaultActivity.this, "Fault Created", Toast.LENGTH_SHORT).show();
                                }


                            }

                            @Override
                            public void onFailure(Call<JsonObject> call, Throwable t) {

                            }
                        });
                        Intent intent = new Intent(CreateFaultActivity.this, SearchActivity.class);
                        startActivity(intent);
                    }
                });
                createDialoge.show();
            /*Call<JsonObject> call = ApiClient.getUserServices().createFaultReport(frDto, username, token, workspace);
            call.enqueue(new Callback<JsonObject>() {
                @Override
                public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                    JsonObject jso = response.body();
                    String frrId="";

                    if (response.code() == 200) {
                        try {
                            JSONObject jsonObject = new JSONObject(String.valueOf(response.body()));
                           frrId = jsonObject.getString("frId");
                            Log.d("FRIDRECEIVEDDDD",frrId);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }




                        Intent intent = new Intent(CreateFaultActivity.this, ImageActivity.class);
                     intent.putExtra("checkForFrid",frrId);
                        intent.putExtra("token", token);
                        intent.putExtra("value", "Before");
                        //intent.putExtra("checkForFrid", frId);
                        intent.putExtra("role", role);
                        intent.putExtra("fromFrDetail", "FrDetailPaGE");
                        intent.putExtra("workspace", workspace);
                        startActivity(intent);
                        finish();
                        Toast.makeText(CreateFaultActivity.this, "Fault Created", Toast.LENGTH_SHORT).show();
                    }


                }

                @Override
                public void onFailure(Call<JsonObject> call, Throwable t) {

                }
            });*/
            }
        }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            equipment =new Equipment();
            if (requestCode == 1) {
                if (resultCode == Activity.RESULT_OK) {
                    assert data != null;
                    String name = data.getStringExtra("equipment_Name");
                    Log.d("EEEEEPPNNN", name);
                    int id = Integer.parseInt(data.getStringExtra("equipmentId"));

                    Log.d("EEEEEPPNIDDDDD", String.valueOf(id));
                    equipmentTxt.setText(name);
                    equipment.setId(id);
                    equipment.setName(name);


                }

            }
            //if(data !=null){
            if(resultCode==21 && resultCode==RESULT_OK){
                Toast.makeText(this,"cameraresultcalled",Toast.LENGTH_LONG).show();

                Bitmap images = (Bitmap) data.getExtras().get("data");
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                images.compress(Bitmap.CompressFormat.JPEG, 70, bos);
                byte[] b = bos.toByteArray();
                String imageStringBase64i = Base64.encodeToString(b, Base64.DEFAULT);
                Log.d("CCCCCFFFNNN", imageStringBase64i);
                Intent camIn = new Intent();
                camIn.putExtra("createImageFa", imageStringBase64i);

                //seqI.putExtra("equipmentId",searchedEqId);
                //seqI.putExtra("equipment_Name",searchedEqName);
                // Log.d("SEARADDDDD%%",searchedEqId);
                //Log.d("SEARANNNNN%%",searchedEqName);

                ((Activity) context).setResult(Activity.RESULT_OK,camIn);
                ((Activity) context).finish();

            }
           // }
        }



        /*private void initializeFab() {
            bfImageBtn.setAlpha(0f);
           // fab_after.setAlpha(0f);
          bfImageBtn.setTranslationY(translationY);*/
            //fab_after.setTranslationY(translationY);
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
      /* cambtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if (isMenuOpen) {
                        closeMenu();
                        Toast.makeText(CreateFaultActivity.this,"Camera pressed",Toast.LENGTH_SHORT).show();
                        *//*fabLayoutQuotation.setVisibility(View.VISIBLE);*//*
                    } else {
                        openMenu();
                        *//* fabLayoutQuotation.setVisibility(View.GONE);*//*
                    }
                }
            });
           bfImageBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(CreateFaultActivity.this, CreateFaultImageActivity.class);
                   // Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    intent.putExtra("token", token);
                    intent.putExtra("value", "Before");
                    intent.putExtra("checkForFrid", frId);
                    intent.putExtra("role", role);
                    intent.putExtra("fromFrDetail", "FrDetailPaGE");
                    intent.putExtra("workspace", workspace);
                    // intent.putExtra("frId", frIdEditText.getText().toString());
                    // intent.putExtra("status", autoCompleteSpinner.getText().toString());
                    //startActivity(intent);
                    startActivityForResult(intent,21);

                }
            });*/
            /*fab_after.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(EditFaultActivity.this, ImageActivity.class);
                    intent.putExtra("token", token);
                    intent.putExtra("value", "After");
                    intent.putExtra("checkForFrid", frId);
                    // intent.putExtra("fromFrDetail", "FrDetailPaGE");
                    intent.putExtra("workspace", workspace);
                    intent.putExtra("role", role);
                 *//*intent.putExtra("status", autoCompleteSpinner.getText().toString());
                intent.putExtra("frId", frIdEditText.getText().toString());*//*
                    startActivity(intent);
                }
            });*/
       // }

        private void openMenu() {
            isMenuOpen = !isMenuOpen;
           cambtn.animate().setInterpolator(interpolator).rotation(0f).setDuration(300).start();
           bfImageBtn.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
            //fab_after.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        }

        private void closeMenu() {
            isMenuOpen = !isMenuOpen;
            cambtn.animate().setInterpolator(interpolator).rotation(0f).setDuration(300).start();
           bfImageBtn.animate().translationY(translationY).setInterpolator(interpolator).setDuration(300).start();
           // fab_after.animate().translationY(translationY).setInterpolator(interpolator).setDuration(300).start();
        }




    }
