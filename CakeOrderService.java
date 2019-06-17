package com.cg.cakeorder.service;

import com.cg.cakeorder.dao.CakeOrderDAO;
import com.cg.cakeorder.dao.ICakeOrderDAO;
import com.cg.cakeorder.dto.CakeOrder;
import com.cg.cakeorder.dto.Customer;
import com.cg.cakeorder.exception.CakeException;

public class CakeOrderService implements ICakeOrderService {
	ICakeOrderDAO cod;
	public CakeOrderService(){
		cod=new CakeOrderDAO();
	}
	@Override
	public int placeOrder(Customer customer, CakeOrder cake) throws CakeException {
		return cod.placeOrder(customer, cake);
	}

	@Override
	public CakeOrder getOrderDetails(int orderid) throws CakeException {
		return cod.getOrderDetails(orderid);
	}
	@Override
	public boolean validateMobileNumber(Customer cust) throws CakeException {
		boolean flag=true;
		if(!validateMobile(cust.getPhone()))
		{
			flag=false;
		}
		if(flag) 
		{
			return flag;			
		}
		else {
			throw new CakeException("Invalid Phone Number, Phone number should contain only 10 digits");
		}

	}
	private boolean validateMobile(String phone) {
		return phone.matches("\\d{10}");
	}

}
