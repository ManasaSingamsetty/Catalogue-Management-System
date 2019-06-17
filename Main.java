package com.cg.cakeorder.ui;

import java.util.Scanner;

import com.cg.cakeorder.dto.CakeOrder;
import com.cg.cakeorder.dto.Customer;
import com.cg.cakeorder.exception.CakeException;
import com.cg.cakeorder.service.CakeOrderService;
import com.cg.cakeorder.service.ICakeOrderService;

public class Main {
	static ICakeOrderService cos =new CakeOrderService();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	int response;
	while(true) {
		System.out.println("1)Place Order");
		System.out.println("2)Display Order");
		System.out.println("3)Exit");
		System.out.println("Enter choice: ");
		response=sc.nextInt();
		switch(response) {
		case 1:
			placeOrder();
			break;
		case 2:
			displayOrder();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice, Please select between 1 to 3");
		}
	}
	}
	private static void placeOrder() {
		sc.nextLine();
		CakeOrder co=new CakeOrder();
		Customer cust=new Customer();
		int orderId;
		try {
			System.out.println("Enter the name of the customer: ");
			String custName=sc.nextLine();
			cust.setCustName(custName);
			System.out.println("Enter customer address: ");
			String custAddress=sc.nextLine();
			cust.setAddress(custAddress);
			System.out.println("Enter type of Cake");
			String toc=sc.nextLine();
			co.setTypeOfCake(toc);
			co.setTotalPrice();
			System.out.println("Price: "+co.getTotalPrice());
			System.out.println("Enter Order date((dd/mm/yyyy)orCurrent Date):");
			String str=sc.nextLine();
			co.setDate(str);
			orderId=cos.placeOrder(cust,co);
			System.out.println("Cake Order successfully placed with Order Id: "+orderId);
		}
		catch(CakeException e) {
			System.out.println(e.getMessage());
		}

	}
	private static void displayOrder() {
		try {
			System.out.println("Enter order id:");
			int orderid=sc.nextInt();
			CakeOrder co=cos.getOrderDetails(orderid);
			System.out.println("Ordered by "+co.getCustomerId()+"\nCake Ordered: "+co.getTypeOfCake()
						+"\nOrder Total Price: "+co.getTotalPrice()+"\nOrder is placed on "+co.getDate().getDayOfMonth()+" "+co.getDate().getMonth()+" "+co.getDate().getYear());
		}
		catch(CakeException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
