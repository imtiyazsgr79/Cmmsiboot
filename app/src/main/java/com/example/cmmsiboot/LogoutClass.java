package com.example.cmmsiboot;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LogoutClass {

    private static final String SHARED_PREF ="" ;

    public void logout(Activity activity){

        SharedPreferences  sharedPreferences =activity.getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE);
        String deviceToken = sharedPreferences.getString("deviceToken","");
        String token = sharedPreferences.getString("token","");
        ProgressDialog progressDialog = new ProgressDialog(activity);
        progressDialog.setTitle("Signing out!");
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.show();
        Call<Void>  callLogOut = ApiClient.getUserServices().logoutUser(deviceToken,token);
        callLogOut.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if(response.code()==200){
                    SharedPreferences  sharedPreferences1 = activity.getSharedPreferences(SHARED_PREF,Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences1.edit();
                    editor.clear();
                    editor.apply();
                    Intent intent = new Intent(activity,MainActivity.class);
                    activity.startActivity(intent);
                    activity.finishAffinity();
                }
                progressDialog.dismiss();
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {

            }
        });



    }
}
