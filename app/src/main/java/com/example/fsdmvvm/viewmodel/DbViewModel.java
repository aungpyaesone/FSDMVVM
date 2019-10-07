package com.example.fsdmvvm.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.fsdmvvm.database.AppDatabase;
import com.example.fsdmvvm.database.RateRepository;
import com.example.fsdmvvm.database.RatesData;

public class DbViewModel extends AndroidViewModel {
    private RateRepository rateRepository;
    private LiveData<RatesData> ratesDataLiveData;

    public DbViewModel(@NonNull Application application) {
        super(application);
        rateRepository = new RateRepository(application);
        ratesDataLiveData = rateRepository.getAllRate();
    }

    public LiveData<RatesData> getRatesDataLiveData(){
        return ratesDataLiveData;
    }

    public void insert(RatesData ratesData){
        rateRepository.insert(ratesData);
    }
}
