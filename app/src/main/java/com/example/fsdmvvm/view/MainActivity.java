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

                   viewModel.insert(data);
               // showData();
            //    myAdapter.bindData(setData(rateData));
            }
        });
    }


    private void showData(){
        viewModel.getAllRate().observe(this, new Observer<List<RatesData>>() {
            @Override
            public void onChanged(List<RatesData> ratesData) {
                myAdapter.bindData(setData(ratesData));
            }
        });

    }

    private void init() {
        currencyResponse = new CurrencyResponse();
        viewModel = ViewModelProviders.of(this).get(CustomViewModel.class);
        viewModel.init();


    }

    private List<String> setData(List<RatesData> rateData) {
      //  Log.d("What is data", rateData.getCHF()+"");
        List<String> list = new ArrayList<>();
        list.add(rateData.get(0).getCHF()+" CHF");
        list.add(rateData.get(0).getZAR()+" ZAR");
        list.add(rateData.get(0).getSAR()+" SAR");
        list.add(rateData.get(0).getINR()+" INR");
        list.add(rateData.get(0).getVND()+" VND");
        list.add(rateData.get(0).getCNY()+" CNY");
        list.add(rateData.get(0).getTHB()+" THB");
        list.add(rateData.get(0).getAUD()+" AUD");
        list.add(rateData.get(0).getKRW()+" KRW");
        list.add(rateData.get(0).getILS()+" ILS");
        //list.add(rateData.getMPR()+" MPR");
        list.add(rateData.get(0).getJPY()+" JPY");
        list.add(rateData.get(0).getBDT()+" BDT");
        list.add(rateData.get(0).getGBP()+" GBP");
        list.add(rateData.get(0).getKHR()+" KHR");
        list.add( rateData.get(0).getIDR()+" IDR");
        list.add(rateData.get(0).getPHP()+" PHP");
        list.add(rateData.get(0).getKWD()+" KWD");
        list.add(rateData.get(0).getRUB()+" RUB");
        list.add(rateData.get(0).getHKD()+" HKD");
        list.add(rateData.get(0).getRSD()+" RSD");
        list.add(rateData.get(0).getEUR()+" EUR");
        list.add(rateData.get(0).getDKK()+" DKK");
        list.add(rateData.get(0).getUSD()+" USD");
        list.add(rateData.get(0).getMYR()+" MYR");
        list.add(rateData.get(0).getCAD()+" CAD");
        list.add(rateData.get(0).getNOK()+" NOK");
        list.add(rateData.get(0).getEGP()+" EGP");
        list.add(rateData.get(0).getSGD()+" SGD");
        list.add(rateData.get(0).getLKR()+" LKR");
        list.add(rateData.get(0).getCZK()+" CZK");
        list.add(rateData.get(0).getPKR()+" PKR");
        list.add(rateData.get(0).getLAK()+" LAK");
        list.add(rateData.get(0).getSEK()+" SEK");
        list.add(rateData.get(0).getKES()+" KES");
        list.add(rateData.get(0).getNZD()+" NZD");
        list.add(rateData.get(0).getBND()+" BND");
        list.add(rateData.get(0).getBRL()+" BRL");

        return list;
    }
}
