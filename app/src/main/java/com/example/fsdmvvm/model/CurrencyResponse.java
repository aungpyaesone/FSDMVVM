package com.example.fsdmvvm.model;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class CurrencyResponse implements Serializable {

	@SerializedName("rates")
	private Rates rates;

	@SerializedName("description")
	private String description;

	@SerializedName("info")
	private String info;

	@SerializedName("timestamp")
	private String timestamp;

	public void setRates(Rates rates){
		this.rates = rates;
	}

	public Rates getRates(){
		return rates;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setInfo(String info){
		this.info = info;
	}

	public String getInfo(){
		return info;
	}

	public void setTimestamp(String timestamp){
		this.timestamp = timestamp;
	}

	public String getTimestamp(){
		return timestamp;
	}
}