package com.cg.cakeorder.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.cakeorder.dto.CakeOrder;
import com.cg.cakeorder.dto.Customer;
import com.cg.cakeorder.exception.CakeException;

public class CakeOrderDAO implements ICakeOrderDAO {
	Map<Integer,Customer> custMap;
	Map<Integer,CakeOrder> orderMap;
	public CakeOrderDAO(){
		custMap=new HashMap<Integer,Customer>();
		orderMap=new HashMap<Integer,CakeOrder>();
	}
	
	@Override
	public int placeOrder(Customer customer, CakeOrder cake) throws CakeException {
		try {
			custMap.put(customer.getCustomerId(),customer);
			cake.setCustomerId(customer.getCustomerId());
			orderMap.put(cake.getOrderId(),cake);
			return cake.getOrderId();
		}
		catch(Exception e) {
			throw new CakeException(e.getMessage());
		}
	}
	@Override
	public CakeOrder getOrderDetails(int orderid) throws CakeException {
		if(orderMap.containsKey(orderid)) {
			CakeOrder co=orderMap.get(orderid);
			return co;
		}
		else
		{
			throw new CakeException("Order Id: "+orderid+" is not valide,Please check once.......");
		}
	}
}
