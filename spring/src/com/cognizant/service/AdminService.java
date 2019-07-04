package com.cognizant.service;


import com.cognizant.entity.Admin;
import com.cognizant.exception.NewsAnalystException;


public interface AdminService {
	Admin findUser1(String userId, String password) throws NewsAnalystException;

}
