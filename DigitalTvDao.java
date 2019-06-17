package com.cg.tv.dao;

import com.cg.tv.dto.Account;
import com.cg.tv.exception.DigitalTvException;

public interface DigitalTvDao {
Account showBalance(String id) throws DigitalTvException;
Account rechargeBalance(String id,double amt) throws DigitalTvException;
}
