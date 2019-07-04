package com.cognizant.service;


import com.cognizant.entity.NewsAnalyst;
import com.cognizant.exception.NewsAnalystException;


public interface NewsAnalystService {
	NewsAnalyst save(NewsAnalyst user);
	NewsAnalyst findUser(String userId, String password) throws NewsAnalystException;

}
