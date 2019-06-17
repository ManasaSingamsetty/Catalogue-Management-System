package com.cg.tv.service;

import com.cg.tv.dao.DigitalTvDao;
import com.cg.tv.dao.DigitalTvDaoImpl;
import com.cg.tv.dto.Account;
import com.cg.tv.exception.DigitalTvException;

public class DigitalTvServiceImpl implements DigitialTvService{
	DigitalTvDao tvDao;
	
	public DigitalTvServiceImpl() {
		tvDao=new DigitalTvDaoImpl();
	}

	@Override
	public Account showBalance(String id) throws DigitalTvException {
		return tvDao.showBalance(id);
	}

	@Override
	public Account rechargeBalance(String id,double amt) throws DigitalTvException {
		return tvDao.rechargeBalance(id, amt);
	}

}
