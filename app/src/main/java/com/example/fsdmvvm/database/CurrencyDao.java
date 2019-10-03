package com.example.fsdmvvm.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CurrencyDao {
    @Insert
    void insert(RatesData ratesData);

    @Query("select * from rate_table")
    LiveData<List<RatesData>> getAllRates();
}