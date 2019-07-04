package com.cognizant.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.NewsAnalystDao;
import com.cognizant.entity.NewsAnalyst;
import com.cognizant.exception.NewsAnalystException;
import com.cognizant.service.NewsAnalystService;

@Service
public class NewsAnalystServiceImpl implements NewsAnalystService{
	@Autowired
      private NewsAnalystDao newsAnalystDao;
	
	public NewsAnalyst save(com.cognizant.entity.NewsAnalyst user){
		return newsAnalystDao.save(user);
	}

	@Override
	public NewsAnalyst findUser(String userId, String password) throws NewsAnalystException {
		
		return newsAnalystDao.findByUserIdAndPassword(userId, password);

		
  
	}
	
	
}
