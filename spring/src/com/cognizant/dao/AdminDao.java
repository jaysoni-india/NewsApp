package com.cognizant.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.Admin;
import com.cognizant.entity.NewsAnalyst;
import com.cognizant.exception.NewsAnalystException;


@Repository
public interface AdminDao extends CrudRepository<Admin, Long> {
	  Admin findByUserIdAndPassword(String userId,  String password) throws  NewsAnalystException;



}