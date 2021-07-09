package com.example.itegy.retrofit;

import com.example.itegy.Model.CheckUserResponse;
import com.example.itegy.Model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface IOnlineShoppingAPI {
    @FormUrlEncoded
    @POST("check_user.php")
    Call<CheckUserResponse> checkUserExists(@Field("user_id")int id);

    @FormUrlEncoded
    @POST("register.php")
    Call<User> registerNewUser(@Field("user_id")int id
   , @Field("user_name")String name
    ,@Field("user_email")String email
    ,@Field("user_user_country")String country
    ,@Field("user_adress_detail")String adress_detail
    ,@Field("user_image")int img);

}
