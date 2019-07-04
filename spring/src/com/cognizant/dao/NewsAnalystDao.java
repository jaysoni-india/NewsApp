package com.cognizant.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.NewsAnalyst;
import com.cognizant.exception.NewsAnalystException;


@Repository
public interface NewsAnalystDao extends CrudRepository<NewsAnalyst, Long> {
	  NewsAnalyst findByUserIdAndPassword(String userId,  String password) throws  NewsAnalystException;
}