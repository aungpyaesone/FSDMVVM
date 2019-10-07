package com.example.fsdmvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.fsdmvvm.R;
import com.example.fsdmvvm.adapter.MyAdapter;
import com.example.fsdmvvm.database.RatesData;
import com.example.fsdmvvm.model.Rates;
import com.example.fsdmvvm.model.CurrencyResponse;
import com.example.fsdmvvm.viewmodel.CustomViewModel;
import com.example.fsdmvvm.viewmodel.DbViewModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    private MyAdapter myAdapter;
    private CustomViewModel viewModel;
    private DbViewModel dbViewModel;
    private Rates rateData;

    @BindView(R.id.recycler)
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this,this);
        init();
     //   fetchData();
       showData();
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
                if(currencyResponse != null){

                    rateData = currencyResponse.getRates();
                    RatesData data = new RatesData();
                    data.setCHF(rateData.getCHF().toString());
                    data.setZAR(rateData.getZAR().toString());
                    data.setSAR(rateData.getSAR().toString());
                    data.setINR(rateData.getINR());
                    data.setVND(rateData.getVND());
                    data.setCNY(rateData.getCNY());
                    data.setTHB(rateData.getTHB());
                    data.setAUD(rateData.getAUD());
                    data.setKRW(rateData.getKRW());
                    data.setILS(rateData.getILS());
                    data.setJPY(rateData.getJPY());
                    data.setBDT(rateData.getBDT());
                    data.setGBP(rateData.getGBP());
                    data.setKHR(rateData.getKHR());
                    data.setIDR(rateData.getIDR());
                    data.setPHP(rateData.getPHP());
                    data.setKWD(rateData.getKWD());
                    data.setRUB(rateData.getRUB());
                    data.setHKD(rateData.getHKD());
                    data.setRSD(rateData.getRSD());
                    data.setEUR(rateData.getEUR());
                    data.setDKK(rateData.getDKK());
                    data.setUSD(rateData.getUSD());
                    data.setMYR(rateData.getMYR());
                    data.setCAD(rateData.getCAD());
                    data.setNOK(rateData.getNOK());
                    data.setEGP(rateData.getEGP());
                    data.setSGD(rateData.getSGD());
                    data.setLKR(rateData.getLKR());
                    data.setCZK(rateData.getCZK());
                    data.setPKR(rateData.getPKR());
                    data.setLAK(rateData.getLAK());
                    data.setSEK(rateData.getSEK());
                    data.setKES(rateData.getKES());
                    data.setNZD(rateData.getNZD());
                    data.setBND(rateData.getBND());
                    data.setBRL(rateData.getBRL());
                    Log.i("my name is ice",data.getCHF()+"");
                    Log.i("it is ",data.getSAR());

                    dbViewModel.insert(data);
                }
                else {
                    Toast.makeText(MainActivity.this, "Empty data", Toast.LENGTH_SHORT).show();
                }
// showData();
              // myAdapter.bindData(setData(rateData));
            }
        });
    }


    private void showData(){

        dbViewModel.getRatesDataLiveData().observe(this, new Observer<RatesData>() {
            @Override
            public void onChanged(RatesData mydata) {
                myAdapter.bindData(setData(mydata));
             //   Log.d("Hello Aung Pyae Sone",mydata.getAUD());
            }
        });


    }

    private void init() {

        viewModel = ViewModelProviders.of(this).get(CustomViewModel.class);
        dbViewModel = ViewModelProviders.of(this).get(DbViewModel.class);
        viewModel.init();


    }

    private List<String> setData(RatesData rateData) {
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
