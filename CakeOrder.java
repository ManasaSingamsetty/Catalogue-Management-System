package com.cg.cakeorder.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class CakeOrder {
	private int orderId;
	private int customerId;
	String typeOfCake;
	LocalDate ld;
	final double basePrice=500;
	private double totalPrice;
	public CakeOrder() {
		this.orderId=Math.abs(new Random().nextInt());
	}

	/*
	 * public void setOrderId() { this.orderId=Math.abs(new Random().nextInt()); }
	 */
	public String getTypeOfCake() {
		return typeOfCake;
	}
	public void setTypeOfCake(String typeOfCake) {
		this.typeOfCake = typeOfCake;
	}
	public int getOrderId() {
		return orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId)
	{
		this.customerId=customerId;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice() {
		int cakePrice=0;
		if(typeOfCake.compareToIgnoreCase("Vanila")==0) {
			cakePrice=120;
		}
		else if(typeOfCake.compareToIgnoreCase("RedVelvet")==0) {
			cakePrice=180;	
		}
		else if(typeOfCake.compareToIgnoreCase("BlackForest")==0)
			cakePrice=140;
		else if(typeOfCake.compareToIgnoreCase("Strawberry")==0)
			cakePrice=105;
		this.totalPrice = basePrice+cakePrice;
	}
	public LocalDate getDate() {
		return ld;
	}
	public void setDate(String str) {
		if(str.compareToIgnoreCase("Current date")==0) {
			ld=LocalDate.now();
			
			}
		else {
			ld=LocalDate.parse(str,DateTimeFormatter.ofPattern("dd/MM/yyyy"));		
			}
	}
}