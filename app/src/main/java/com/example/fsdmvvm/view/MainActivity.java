package com.example.fsdmvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fsdmvvm.R;
import com.example.fsdmvvm.adapter.MyAdapter;
import com.example.fsdmvvm.database.RatesData;
import com.example.fsdmvvm.model.Rates;
import com.example.fsdmvvm.model.CurrencyResponse;
import com.example.fsdmvvm.viewmodel.CustomViewModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    private MyAdapter myAdapter;
    private CurrencyResponse currencyResponse;
    private CustomViewModel viewModel;
    private Rates rateData;

    @BindView(R.id.recycler)
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this,this);
        init();
        fetchData();
       // showData();
        setUpRecycler();
    }

    private void setUpRecycler() {
        myAdapter = new MyAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);

    }

    private void fetchData() {
        viewModel.getCurrency().observe(this, new Observer<CurrencyResponse>() {
            @Override
            public void onChanged(CurrencyResponse currencyResponse) {

                rateData = currencyResponse.getRates();
              //  Log.i("my name is ice",rateData.getCHF()+"");
                RatesData data = new RatesData(rateData.getCHF(),
                        rateData.getZAR(),rateData.getSAR(),
                        rateData.getINR(),rateData.getVND(),
                        rateData.getCNY(),rateData.getTHB(),
                        rateData.getAUD(),rateData.getKRW(),
                        rateData.getILS(),rateData.getJPY(),
                        rateData.getBDT(),rateData.getGBP(),
                        rateData.getKHR(),rateData.getIDR(),
                        rateData.getPHP(),rateData.getKWD(),
                        rateData.getRUB(),rateData.getHKD(),
                        rateData.getRSD(),rateData.getEUR(),
                        rateData.getDKK(),rateData.getUSD(),
                        rateData.getMYR(),rateData.getCAD(),
                        rateData.getNOK(),rateData.getEGP(),
                        rateData.getSGD(),rateData.getLKR(),
                        rateData.getCZK(),rateData.getPKR(),
                        rateData.getLAK(),rateData.getSEK(),
                        rateData.getKES(),rateData.getNZD(),
                        rateData.getBND(),rateData.getBRL()
                        );

                  // viewModel.insert(data);
               // showData();
               myAdapter.bindData(setData(rateData));
            }
        });
    }


    private void showData(){
        viewModel.getAllRate().observe(this, new Observer<List<RatesData>>() {
            @Override
            public void onChanged(List<RatesData> ratesData) {
               // myAdapter.bindData(setData(ratesData));
            }
        });

    }

    private void init() {
        currencyResponse = new CurrencyResponse();
        viewModel = ViewModelProviders.of(this).get(CustomViewModel.class);
        viewModel.init();


    }

    private List<String> setData(Rates rateData) {
      //  Log.d("What is data", rateData.getCHF()+"");
        List<String> list = new ArrayList<>();
        list.add(rateData.getCHF()+" CHF");
        list.add(rateData.getZAR()+" ZAR");
        list.add(rateData.getSAR()+" SAR");
        list.add(rateData.getINR()+" INR");
        list.add(rateData.getVND()+" VND");
        list.add(rateData.getCNY()+" CNY");
        list.add(rateData.getTHB()+" THB");
        list.add(rateData.getAUD()+" AUD");
        list.add(rateData.getKRW()+" KRW");
        list.add(rateData.getILS()+" ILS");
        //list.add(rateData.getMPR()+" MPR");
        list.add(rateData.getJPY()+" JPY");
        list.add(rateData.getBDT()+" BDT");
        list.add(rateData.getGBP()+" GBP");
        list.add(rateData.getKHR()+" KHR");
        list.add( rateData.getIDR()+" IDR");
        list.add(rateData.getPHP()+" PHP");
        list.add(rateData.getKWD()+" KWD");
        list.add(rateData.getRUB()+" RUB");
        list.add(rateData.getHKD()+" HKD");
        list.add(rateData.getRSD()+" RSD");
        list.add(rateData.getEUR()+" EUR");
        list.add(rateData.getDKK()+" DKK");
        list.add(rateData.getUSD()+" USD");
        list.add(rateData.getMYR()+" MYR");
        list.add(rateData.getCAD()+" CAD");
        list.add(rateData.getNOK()+" NOK");
        list.add(rateData.getEGP()+" EGP");
        list.add(rateData.getSGD()+" SGD");
        list.add(rateData.getLKR()+" LKR");
        list.add(rateData.getCZK()+" CZK");
        list.add(rateData.getPKR()+" PKR");
        list.add(rateData.getLAK()+" LAK");
        list.add(rateData.getSEK()+" SEK");
        list.add(rateData.getKES()+" KES");
        list.add(rateData.getNZD()+" NZD");
        list.add(rateData.getBND()+" BND");
        list.add(rateData.getBRL()+" BRL");

        return list;
    }
}
