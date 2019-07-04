package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.FavouriteArticleDao;
import com.cognizant.entity.FavouriteArticle;
import com.cognizant.entity.NewsAnalyst;
@Service
public class FavouriteArticleServiceImpl implements FavouriteArticleService {
	
	@Autowired
	private FavouriteArticleDao favoriteArticleDao;
	
	@Override
	public FavouriteArticle save(FavouriteArticle favoriteArticle) {
		return favoriteArticleDao.save(favoriteArticle);
	}

	@Override
	public void delete(FavouriteArticle favoriteArticle) {
		favoriteArticleDao.delete(favoriteArticle);
	}

	
	@Override
	public void removeByArticleId(int articleId, NewsAnalyst user) {
		FavouriteArticle favoriteArticle = favoriteArticleDao.findByArticleIdAndUser(articleId, user);
		
		delete(favoriteArticle);
		
	}
}