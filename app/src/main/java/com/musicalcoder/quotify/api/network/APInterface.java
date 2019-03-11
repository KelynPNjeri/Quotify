package com.musicalcoder.quotify.api.network;

import com.musicalcoder.quotify.api.model.UserDetails;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APInterface {

    @POST("/auth/register")
    Call<UserDetails> createAccount(@Body UserDetails user);
}
