package com.cognizant.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="FavouriteArticle")

public class FavouriteArticle implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 253249278408137460L;
	@Id

	private int articleId;
	private String url;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private NewsAnalyst user;
	
	public FavouriteArticle() {
		
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public NewsAnalyst getUser() {
		return user;
	}

	public void setUser(NewsAnalyst user) {
		this.user = user;
	}

}


