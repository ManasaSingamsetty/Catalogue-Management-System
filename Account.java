package com.cg.tv.dto;

public class Account {
	private String customerId;
	private String AccountType;
	private String customerName;
	private double accountBalance;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Account() 
	{
	}
	public Account(String customerId, String accountType, String customerName, double accountBalance) {
		this.customerId = customerId;
		AccountType = accountType;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
	}
	
}
