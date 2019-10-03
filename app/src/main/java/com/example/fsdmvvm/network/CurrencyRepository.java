package com.example.fsdmvvm.network;

import androidx.lifecycle.MutableLiveData;

import com.example.fsdmvvm.model.CurrencyResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CurrencyRepository {
    private static CurrencyRepository currencyRepository;
    public static CurrencyRepository getInstance(){
        if(currencyRepository == null){
            currencyRepository = new CurrencyRepository();
        }
        return currencyRepository;
    }

    private APIInterface apiInterface;
    public CurrencyRepository(){
        apiInterface = ClientApi.getRetrofit().create(APIInterface.class);
    }

    public MutableLiveData<CurrencyResponse> getCurrencyResponse(){
        final MutableLiveData<CurrencyResponse> currencyData = new MutableLiveData<>();
        apiInterface.getCurrencyResponse().enqueue(new Callback<CurrencyResponse>() {
            @Override
            public void onResponse(Call<CurrencyResponse> call, Response<CurrencyResponse> response) {
                if (response.isSuccessful())
                {
                    currencyData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<CurrencyResponse> call, Throwable t) {
                currencyData.setValue(null);
            }
        });
        return currencyData;
    }
}
