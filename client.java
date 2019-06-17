package com.cg.tv.ui;

import java.util.Scanner;

import com.cg.tv.dto.Account;
import com.cg.tv.exception.DigitalTvException;
import com.cg.tv.service.DigitalTvServiceImpl;
import com.cg.tv.service.DigitialTvService;

public class client {
	static Scanner sc=new Scanner(System.in);
	static DigitialTvService tvService=new DigitalTvServiceImpl();
	public static void main(String[] args) {
		int response;
		while(true)
		{
			System.out.println("1)Check Balance\n2)Recharge\n3)Exit");
			System.out.println("Please enter your choice");
			response=sc.nextInt();
			switch(response) {
			case 1:
				checkBalance();
				break;
			case 2:
				rechargeBalance();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice, Please enter a valid option");
			}
		}
	}
	private static void checkBalance() {
		System.out.println("Enter CustomerId ");
		sc.nextLine();
		String custId=sc.nextLine();
		try {
			Account acc=tvService.showBalance(custId);
			System.out.println("Hello "+acc.getCustomerName()+", Your Balance is "+acc.getAccountBalance());
		}
		catch(DigitalTvException e) {
			System.err.println(e.getMessage());
		}
	}
	
	private static void rechargeBalance() {
		System.out.println("Enter Customer Id");
		sc.nextLine();
		String custId=sc.nextLine();
		System.out.println("Recharge Amount: ");
		double amt=sc.nextDouble();
		sc.nextLine();
		try {
			Account acc=tvService.rechargeBalance(custId, amt);
			System.out.println("Hi, "+acc.getCustomerName()+" Your recharge successful!! Balance: "+acc.getAccountBalance());
		}
		catch (DigitalTvException e) {
			System.err.println(e.getMessage());
		}
	}

}
