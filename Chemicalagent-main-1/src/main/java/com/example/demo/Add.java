package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class Add {
	
	 
	  @Override
	public String toString() {
		return "Add [chemicalname=" + chemicalname + ", quantity=" + quantity + ", availabilitydate=" + availabilitydate
				+ ", manufacturedate=" + manufacturedate + ", expirydate=" + expirydate + ", price=" + price
				+ ", createdby=" + createdby + ", timestamp=" + timestamp + ", qntyoptions=" + qntyoptions
				+ ", sellername=" + sellername + ", companyname=" + companyname + ", id=" + id + "]";
	}
	private String chemicalname;
	  private String quantity;
	  private String availabilitydate;
	  private String manufacturedate;
	  private String expirydate;
	  private double price;
	  private String createdby;
//	  private String username;
	  private String timestamp;
	  private String qntyoptions;
	  private String sellername;
	  private String companyname;
	  @Id
	  private int id;
	  private int userid;
	  public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	private String status;
	  
	  
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getSellername() {
		return sellername;
	}
	public void setSellername(String sellername) {
		this.sellername = sellername;
	}
	public String getQntyoptions() {
		return qntyoptions;
	}
	public void setQntyoptions(String qntyoptions) {
		this.qntyoptions = qntyoptions;
	}
	public String getChemicalname() {
		return chemicalname;
	}
	public void setChemicalname(String chemicalname) {
		this.chemicalname = chemicalname;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	public String getAvailabilitydate() {
		return availabilitydate;
	}
	public void setAvailabilitydate(String availabilitydate) {
		this.availabilitydate = availabilitydate;
	}
	public String getManufacturedate() {
		return manufacturedate;
	}
	public void setManufacturedate(String manufacturedate) {
		this.manufacturedate = manufacturedate;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public Add() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Add(String chemicalname, String quantity, String availabilitydate, String manufacturedate, String expirydate,
			double price, String createdby, String timestamp,String qntyoptions,int id,String status,int userid) {
		super();
		this.chemicalname = chemicalname;
		this.quantity = quantity;
		this.availabilitydate = availabilitydate;
		this.manufacturedate = manufacturedate;
		this.expirydate = expirydate;
		this.price = price;
		this.createdby = createdby;
//		this.username = username;
		this.timestamp = timestamp;
		this.qntyoptions= qntyoptions;
		this.id = id;
		this.status = status;
		this.userid =userid;
	}
	

}
