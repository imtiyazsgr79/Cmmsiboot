package com.example.cmmsiboot;

import android.content.Context;

import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class ApiClient {
    public static Retrofit getRetrofit() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        //Context context = SplashScreenActivity.getAppContext();
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
//                .addInterceptor(new ChuckerInterceptor(context))
                .readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://192.168.2.8:8081/api/")
//                .baseUrl("http://103.24.4.168:8088/cmmstest/api/")
              //  .baseUrl("http://103.24.4.168:8085/cmms/api/")
           .baseUrl("http://192.168.0.184:8086/api/")// azaan
             // .baseUrl("http://103.24.4.168:8088/cmmsboot/api/")
               // .baseUrl("http://192.168.0.130:8081/api/") //khal

//faizan did it
// git success
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory
                        .create(new GsonBuilder().setLenient()
                                .serializeNulls().create()))
                .client(okHttpClient)
                .build();
        return retrofit;
    }

    public static UserService getUserServices() {
        return getRetrofit().create(UserService.class);
    }
}
