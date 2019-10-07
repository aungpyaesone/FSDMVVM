package com.example.fsdmvvm.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.fsdmvvm.database.RateRepository;
import com.example.fsdmvvm.database.RatesData;
import com.example.fsdmvvm.model.CurrencyResponse;
import com.example.fsdmvvm.network.CurrencyRepository;

import java.util.List;

public class CustomViewModel extends AndroidViewModel {

    private MutableLiveData<CurrencyResponse> mutableLiveData;
    private CurrencyRepository currencyRepository;

    public CustomViewModel(@NonNull Application application) {
        super(application);
        currencyRepository = new CurrencyRepository();
        init();

    }

    public void init() {
        if(mutableLiveData != null)
        {
            return;
        }

        currencyRepository = CurrencyRepository.getInstance();
        mutableLiveData = currencyRepository.getCurrencyResponse();
    }

    public LiveData<CurrencyResponse> getCurrency(){
        return mutableLiveData;
    }
}
