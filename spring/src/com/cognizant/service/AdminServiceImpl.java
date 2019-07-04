package com.cognizant.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.AdminDao;
import com.cognizant.entity.Admin;
import com.cognizant.entity.NewsAnalyst;
import com.cognizant.exception.NewsAnalystException;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminDao adminDao;
	@Override
	public Admin findUser1(String userId, String password) throws NewsAnalystException {
		
		return adminDao.findByUserIdAndPassword(userId, password);

		
  
	}

	
}
