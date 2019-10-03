package com.example.fsdmvvm.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Rates implements Serializable {

	@SerializedName("CHF")
	private String cHF;

	@SerializedName("SAR")
	private String sAR;

	@SerializedName("ZAR")
	private String zAR;

	@SerializedName("INR")
	private String iNR;

	@SerializedName("VND")
	private String vND;

	@SerializedName("CNY")
	private String cNY;

	@SerializedName("THB")
	private String tHB;

	@SerializedName("AUD")
	private String aUD;

	@SerializedName("NPR")
	private String nPR;

	@SerializedName("KRW")
	private String kRW;

	@SerializedName("ILS")
	private String iLS;

	@SerializedName("JPY")
	private String jPY;

	@SerializedName("BDT")
	private String bDT;

	@SerializedName("KHR")
	private String kHR;

	@SerializedName("GBP")
	private String gBP;

	@SerializedName("IDR")
	private String iDR;

	@SerializedName("PHP")
	private String pHP;

	@SerializedName("KWD")
	private String kWD;

	@SerializedName("RUB")
	private String rUB;

	@SerializedName("HKD")
	private String hKD;

	@SerializedName("RSD")
	private String rSD;

	@SerializedName("EUR")
	private String eUR;

	@SerializedName("DKK")
	private String dKK;

	@SerializedName("USD")
	private String uSD;

	@SerializedName("CAD")
	private String cAD;

	@SerializedName("MYR")
	private String mYR;

	@SerializedName("NOK")
	private String nOK;

	@SerializedName("EGP")
	private String eGP;

	@SerializedName("SGD")
	private String sGD;

	@SerializedName("LKR")
	private String lKR;

	@SerializedName("CZK")
	private String cZK;

	@SerializedName("PKR")
	private String pKR;

	@SerializedName("LAK")
	private String lAK;

	@SerializedName("KES")
	private String kES;

	@SerializedName("SEK")
	private String sEK;

	@SerializedName("NZD")
	private String nZD;

	@SerializedName("BND")
	private String bND;

	@SerializedName("BRL")
	private String bRL;

/*	public RatesData(String cHF, String sAR, String zAR, String iNR, String vND, String cNY, String tHB, String aUD, String nPR, String kRW, String iLS, String jPY, String bDT, String kHR, String gBP, String iDR, String pHP, String kWD, String rUB, String hKD, String rSD, String eUR, String dKK, String uSD, String cAD, String mYR, String nOK, String eGP, String sGD, String lKR, String cZK, String pKR, String lAK, String kES, String sEK, String nZD, String bND, String bRL) {
		this.cHF = cHF;
		this.sAR = sAR;
		this.zAR = zAR;
		this.iNR = iNR;
		this.vND = vND;
		this.cNY = cNY;
		this.tHB = tHB;
		this.aUD = aUD;
		this.nPR = nPR;
		this.kRW = kRW;
		this.iLS = iLS;
		this.jPY = jPY;
		this.bDT = bDT;
		this.kHR = kHR;
		this.gBP = gBP;
		this.iDR = iDR;
		this.pHP = pHP;
		this.kWD = kWD;
		this.rUB = rUB;
		this.hKD = hKD;
		this.rSD = rSD;
		this.eUR = eUR;
		this.dKK = dKK;
		this.uSD = uSD;
		this.cAD = cAD;
		this.mYR = mYR;
		this.nOK = nOK;
		this.eGP = eGP;
		this.sGD = sGD;
		this.lKR = lKR;
		this.cZK = cZK;
		this.pKR = pKR;
		this.lAK = lAK;
		this.kES = kES;
		this.sEK = sEK;
		this.nZD = nZD;
		this.bND = bND;
		this.bRL = bRL;
	}*/

	public void setCHF(String cHF){
		this.cHF = cHF;
	}

	public String getCHF(){
		return cHF;
	}

	public void setSAR(String sAR){
		this.sAR = sAR;
	}

	public String getSAR(){
		return sAR;
	}

	public void setZAR(String zAR){
		this.zAR = zAR;
	}

	public String getZAR(){
		return zAR;
	}

	public void setINR(String iNR){
		this.iNR = iNR;
	}

	public String getINR(){
		return iNR;
	}

	public void setVND(String vND){
		this.vND = vND;
	}

	public String getVND(){
		return vND;
	}

	public void setCNY(String cNY){
		this.cNY = cNY;
	}

	public String getCNY(){
		return cNY;
	}

	public void setTHB(String tHB){
		this.tHB = tHB;
	}

	public String getTHB(){
		return tHB;
	}

	public void setAUD(String aUD){
		this.aUD = aUD;
	}

	public String getAUD(){
		return aUD;
	}

	public void setNPR(String nPR){
		this.nPR = nPR;
	}

	public String getNPR(){
		return nPR;
	}

	public void setKRW(String kRW){
		this.kRW = kRW;
	}

	public String getKRW(){
		return kRW;
	}

	public void setILS(String iLS){
		this.iLS = iLS;
	}

	public String getILS(){
		return iLS;
	}

	public void setJPY(String jPY){
		this.jPY = jPY;
	}

	public String getJPY(){
		return jPY;
	}

	public void setBDT(String bDT){
		this.bDT = bDT;
	}

	public String getBDT(){
		return bDT;
	}

	public void setKHR(String kHR){
		this.kHR = kHR;
	}

	public String getKHR(){
		return kHR;
	}

	public void setGBP(String gBP){
		this.gBP = gBP;
	}

	public String getGBP(){
		return gBP;
	}

	public void setIDR(String iDR){
		this.iDR = iDR;
	}

	public String getIDR(){
		return iDR;
	}

	public void setPHP(String pHP){
		this.pHP = pHP;
	}

	public String getPHP(){
		return pHP;
	}

	public void setKWD(String kWD){
		this.kWD = kWD;
	}

	public String getKWD(){
		return kWD;
	}

	public void setRUB(String rUB){
		this.rUB = rUB;
	}

	public String getRUB(){
		return rUB;
	}

	public void setHKD(String hKD){
		this.hKD = hKD;
	}

	public String getHKD(){
		return hKD;
	}

	public void setRSD(String rSD){
		this.rSD = rSD;
	}

	public String getRSD(){
		return rSD;
	}

	public void setEUR(String eUR){
		this.eUR = eUR;
	}

	public String getEUR(){
		return eUR;
	}

	public void setDKK(String dKK){
		this.dKK = dKK;
	}

	public String getDKK(){
		return dKK;
	}

	public void setUSD(String uSD){
		this.uSD = uSD;
	}

	public String getUSD(){
		return uSD;
	}

	public void setCAD(String cAD){
		this.cAD = cAD;
	}

	public String getCAD(){
		return cAD;
	}

	public void setMYR(String mYR){
		this.mYR = mYR;
	}

	public String getMYR(){
		return mYR;
	}

	public void setNOK(String nOK){
		this.nOK = nOK;
	}

	public String getNOK(){
		return nOK;
	}

	public void setEGP(String eGP){
		this.eGP = eGP;
	}

	public String getEGP(){
		return eGP;
	}

	public void setSGD(String sGD){
		this.sGD = sGD;
	}

	public String getSGD(){
		return sGD;
	}

	public void setLKR(String lKR){
		this.lKR = lKR;
	}

	public String getLKR(){
		return lKR;
	}

	public void setCZK(String cZK){
		this.cZK = cZK;
	}

	public String getCZK(){
		return cZK;
	}

	public void setPKR(String pKR){
		this.pKR = pKR;
	}

	public String getPKR(){
		return pKR;
	}

	public void setLAK(String lAK){
		this.lAK = lAK;
	}

	public String getLAK(){
		return lAK;
	}

	public void setKES(String kES){
		this.kES = kES;
	}

	public String getKES(){
		return kES;
	}

	public void setSEK(String sEK){
		this.sEK = sEK;
	}

	public String getSEK(){
		return sEK;
	}

	public void setNZD(String nZD){
		this.nZD = nZD;
	}

	public String getNZD(){
		return nZD;
	}

	public void setBND(String bND){
		this.bND = bND;
	}

	public String getBND(){
		return bND;
	}

	public void setBRL(String bRL){
		this.bRL = bRL;
	}

	public String getBRL(){
		return bRL;
	}
}