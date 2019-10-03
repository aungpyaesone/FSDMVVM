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
    private RateRepository rateRepository;
    private LiveData<List<RatesData>> allRates;

    public CustomViewModel(@NonNull Application application) {
        super(application);
        currencyRepository = new CurrencyRepository();
        rateRepository = new RateRepository(application);
       // allRates = rateRepository.getAllRate();
        init();

    }
    public void insert(RatesData ratesData)
    {
        rateRepository.insert(ratesData);
    }

    public LiveData<List<RatesData>> getAllRate()
    {
        allRates = rateRepository.getAllRate();
        return allRates;
    }

    public void init() {
        if(mutableLiveData != null)
        {
            return;
        }

        currencyRepository = CurrencyRepository.getInstance();
        rateRepository = RateRepository.getInstance();
        mutableLiveData = currencyRepository.getCurrencyResponse();
    }

    public LiveData<CurrencyResponse> getCurrency(){
        return mutableLiveData;
    }
}
