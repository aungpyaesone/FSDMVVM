package com.example.fsdmvvm.network;

import com.example.fsdmvvm.model.CurrencyResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("latest")
    Call<CurrencyResponse> getCurrencyResponse();
}
