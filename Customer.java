package com.cg.cakeorder.dto;

import java.util.Random;

public class Customer {
	private int customerId;
	private String custName;
	private String address;
	private String phone;
	public Customer(){
		this.customerId=Math.abs(new Random().nextInt());
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/*
	 * public void setCustomerId() {
	 * 
	 * }
	 */
}
