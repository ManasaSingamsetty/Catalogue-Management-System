package com.cg.cakeorder.service;

import com.cg.cakeorder.dto.CakeOrder;
import com.cg.cakeorder.dto.Customer;
import com.cg.cakeorder.exception.CakeException;

public interface ICakeOrderService {
	public int placeOrder(Customer customer, CakeOrder cake) throws CakeException;
	public CakeOrder getOrderDetails(int orderid)  throws CakeException;
	public boolean validateMobileNumber(Customer cust) throws CakeException;
}
