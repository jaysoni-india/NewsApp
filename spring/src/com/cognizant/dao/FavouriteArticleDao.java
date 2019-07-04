package com.cognizant.dao;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.entity.FavouriteArticle;
import com.cognizant.entity.NewsAnalyst;

public interface FavouriteArticleDao extends CrudRepository<FavouriteArticle, Integer> {
	FavouriteArticle findByArticleIdAndUser(int articleId, NewsAnalyst user);
}