package com.example.cmmsiboot;


import com.example.cmmsiboot.Workspace.Workspace;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserService {
    //login to user account
    @POST("authenticate")
    @Headers("Content-Type: application/json")
    Call<UserResponse> saveUser(@Body UserRequest userRequest);

    //generate workspace
    @GET("workspace/getall")
    @Headers("Content-Type: application/json")
    Call<ArrayList<Workspace>>getWorkspace(@Query("username") String username,
                                           @Header("Authorization") String token);
    //Logout user
    @POST("logout?")
    @Headers("Content-Type: application/json")
    Call<Void> logoutUser(@Query("deviceToken") String query,
                          @Header("Authorization") String token);

    //Create Fault Report Admin
    @POST("faultreport")
    @Headers("Content-Type: application/json")
    Call<JsonObject> createFaultReport(@Body FrDto frDto ,
                                       @Header("username") String username,
                                       @Header("Authorization") String token,
                                       @Header("workspace") String workspace
                                       );
    @GET("general/departments/{workspace}")
    @Headers("Content-Type: application/json")
    Call<JsonArray> getDepartment(@Header("Authorization") String token
                                , @Path("workspace") String workspaceIdPath);

    @GET("general/buildings/{workspace}")
    @Headers("Content-Type: application/json")
    Call<JsonArray> getBuildings(@Header("Authorization") String token
            , @Path("workspace") String workspaceIdPath);

    @GET("general/locations/{buildId}")
    @Headers("Content-Type: application/json")
    Call<JsonArray> getLocation(@Header("Authorization") String token
            , @Path("buildId") String builId);


    @GET("general/priorty/{workspace}")
    @Headers("Content-Type: application/json")
    Call<JsonArray> getPriority(@Header("Authorization") String token
            , @Path("workspace") String workspaceIdPath);

    @GET("general/faultCategories/{workspace}")
    @Headers("Content-Type: application/json")
    Call<JsonArray> getFaultCategories(
            @Header("Authorization") String token
            , @Path("workspace") String workspaceIdPath);

    @GET("general/maintenanceGrpCategory/{workspace}")
    @Headers("Content-Type: application/json")
    Call<JsonArray> getMaintenanceGrp(
            @Header("Authorization") String token
            , @Path("workspace") String workspaceIdPath);

    @GET("general/divisions/{workspace}")
    @Headers("Content-Type: application/json")
    Call<JsonArray> getDivision(
            @Header("Authorization") String token
            , @Path("workspace") String workspaceIdPath);

    @GET("general/technicians/")
    @Headers("Content-Type: application/json")
    Call<JsonArray> getTechicians(@Header("Authorization") String token
            , @Header("workspace") String workspaceIdPath);
    /*@GET("general/technicians/{workspace}")
    @Headers("Content-Type: application/json")
    Call<JsonArray> getTechicians(@Path("workspace") String workspaceId
          );*/

    @GET("faultreport/search")
    @Headers("Content-Type: application/json")
    Call<JsonArray> getSearchResult(@Header("workspace") String dynamicWorkSpace,
                                               @Query("query") String s,
                                               @Header("Authorization") String token,
                                               @Header("role") String role);

    @GET("general/equipments/")
    @Headers("Content-Type: application/json")
    Call<JsonArray> getEquipments(@Header("Authorization") String token
            , @Header("workspace") String workspaceIdPath);

    @GET("faultreport/edit/{frId}")
    @Headers("Content-Type: application/json")
    Call<FrDto> editFault(@Path("frId") String frId,
                                    @Header("Authorization") String token
                                    );
    @GET("faultreport/{value}image/{frId}")
    @Headers("Content-Type: application/json")
    Call<List<BeforeImageResponse>> getBeforeImage(@Path("value") String value,
                                                   @Path("frId") String frId,
                                                   @Header("workspace") String workspace,
                                                   @Header("Authorization") String token);

    //call alreaddy images
    @GET("faultreport/getimage/{imageName}")
    @Headers("Content-Type: application/json")
    Call<ResponseBody> getImageBase64(@Path("imageName") String imagename,
                                      @Header("workspace") String workspace,
                                      @Header("Authorization") String token);

    @POST("faultreport/{value}image")
    @Headers("Content-Type: application/json")
    Call<Void> uploadImage(@Path("value") String value,
                                                   @Header("workspace") String workspace,
                                                   @Header("Authorization") String token,
                                                    @Body UploadImageRequest uploadImageRequest);



    @PUT("faultreport")
    @Headers("Content-Type: application/json")
    Call<Void> updateFault(@Body FrDto frDto ,
                                       @Header("username") String username,
                                       @Header("Authorization") String token,
                                       @Header("workspace") String workspace
    );
    @POST("faultreport/delete/image")
    @Headers("Content-Type: application/json")
    Call<Void> postDeleteImage(@Body DeleteImageRequest deleteImageRequest,
                               @Header("workspace") String workspace,
                               @Header("Authorization") String token,
                               @Header("role") String role);



}
