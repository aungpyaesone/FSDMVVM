package com.example.fsdmvvm.database;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class RateRepository  {

    private CurrencyDao currencyDao;
    private LiveData<List<RatesData>> allRates;


    private static RateRepository rateRepository;

    public static RateRepository getInstance(){
        if(rateRepository == null){
            rateRepository = new RateRepository();
        }
        return rateRepository;
    }
    public RateRepository(){}

    public RateRepository(Application application)
    {
        AppDatabase database = AppDatabase.getInstance(application);
        currencyDao = database.currencyDao();
        allRates = currencyDao.getAllRates();
    }


    public void insert(RatesData ratesData)
    {
        new InsertRateAsyncTask(currencyDao).execute(ratesData);
    }

    public LiveData<List<RatesData>> getAllRate()
    {
        return allRates;
    }



    private static class InsertRateAsyncTask extends AsyncTask<RatesData,Void,Void> {
        private CurrencyDao currencyDao;

        public InsertRateAsyncTask(CurrencyDao currencyDao){
            this.currencyDao = currencyDao;
        }

        @Override
        protected Void doInBackground(RatesData... rates) {
            currencyDao.insert(rates[0]);
            return null;
        }
    }
}
