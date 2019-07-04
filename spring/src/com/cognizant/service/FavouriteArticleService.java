package com.cognizant.service;


import com.cognizant.entity.FavouriteArticle;
import com.cognizant.entity.NewsAnalyst;

public interface FavouriteArticleService {
	
	FavouriteArticle save(FavouriteArticle favouriteArticle);
	void delete(FavouriteArticle favouriteArticle);
	void removeByArticleId(int articleId, NewsAnalyst user);

}


