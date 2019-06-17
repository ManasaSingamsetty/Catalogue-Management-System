package com.cg.tv.service;

import com.cg.tv.dto.Account;
import com.cg.tv.exception.DigitalTvException;

public interface DigitialTvService {
	Account showBalance(String id) throws DigitalTvException;
	Account rechargeBalance(String id,double amt) throws DigitalTvException;
}
