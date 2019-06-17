package com.cg.tv.dao;

import java.util.Map;

import com.cg.tv.dto.Account;
import com.cg.tv.exception.DigitalTvException;
import com.cg.tv.staticDb.AccountDb;

public class DigitalTvDaoImpl implements DigitalTvDao{
	private Map<String,Account> accDb;
	public DigitalTvDaoImpl() {
		accDb=AccountDb.getAccounts();
	}
	@Override
	public Account showBalance(String id) throws DigitalTvException {
		if(accDb.containsKey(id)) {
			return accDb.get(id);
		}
		else
		{
			throw new DigitalTvException("Customer Id: "+id+", does not exist");
		}
	}
	@Override
	public Account rechargeBalance(String id,double amt) throws DigitalTvException {
		if(accDb.containsKey(id)) {
			Account acc=accDb.get(id);
			acc.setAccountBalance(acc.getAccountBalance()+amt);
			accDb.put(id,acc);
			return accDb.get(id);
		}
		else
		{
			throw new DigitalTvException("Customer Id: "+id+", does not exist");
		}
	}

}
