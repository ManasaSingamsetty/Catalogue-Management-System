package com.cg.cakeorder.dao;

import com.cg.cakeorder.dto.CakeOrder;
import com.cg.cakeorder.dto.Customer;
import com.cg.cakeorder.exception.CakeException;

public interface ICakeOrderDAO {
	public int placeOrder(Customer customer,CakeOrder cake) throws CakeException;
	public CakeOrder getOrderDetails(int orderid) throws CakeException;
}