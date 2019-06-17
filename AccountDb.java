package com.cg.tv.staticDb;

import java.util.HashMap;
import java.util.Map;

import com.cg.tv.dto.Account;

public class AccountDb {
	static private Map<String,Account> accounts=new HashMap<String,Account>();
	static {
		accounts.put("1001", new Account("1000001", "Pre Paid", "Tom", 900));
		accounts.put("1002", new Account("1000002", "Pre Paid", "Mary", 590));
		accounts.put("1003", new Account("1000003", "Pre Paid", "Haary", 600));
		accounts.put("1004", new Account("1000004", "Pre Paid", "George", 700));
		accounts.put("1005", new Account("1000005", "Pre Paid", "Raju", 230));
	}
	public static Map<String,Account> getAccounts(){
		return accounts;
	}
}
