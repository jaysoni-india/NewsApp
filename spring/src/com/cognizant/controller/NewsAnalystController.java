package com.cognizant.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.FavouriteArticle;
import com.cognizant.entity.NewsAnalyst;
import com.cognizant.exception.NewsAnalystException;
import com.cognizant.service.FavouriteArticleService;
import com.cognizant.service.NewsAnalystService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@CrossOrigin(origins = "http://localhost", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class NewsAnalystController {

	@Autowired
	private NewsAnalystService userService;
	
	@Autowired
	FavouriteArticleService favArticleService;

	@RequestMapping(value = "/register", method = RequestMethod.POST,
			consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public NewsAnalyst registerUser( NewsAnalyst user) {
		return userService.save(user);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST,
			consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)

	public String login( NewsAnalyst login) throws ServletException, NewsAnalystException {

		String jwtToken = "";

		if (login.getUserId() == null || login.getPassword() == null) {
			throw new ServletException("Please fill in username and password");
		}

		String userId = login.getUserId();
		String password = login.getPassword();

		NewsAnalyst user = userService.findUser(userId, password);
		

		if (user == null) {
			throw new ServletException("User Id not found.");
		}

		String pwd = user.getPassword();

		if (!password.equals(pwd)) {
			throw new ServletException("Invalid login. Please check your name and password.");
		}

		jwtToken = Jwts.builder().setSubject((userId)).claim("roles", "user").setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact();

		return jwtToken;
	}

	@RequestMapping(value = "/Fav", method = RequestMethod.POST,consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String addToFavorites(FavouriteArticle article, NewsAnalyst user) throws ServletException {

		article.setUser(user);
		Set<FavouriteArticle>favArticles = new HashSet<>();
		favArticles.add(article);
		user.setFavArticles(favArticles);
		//System.out.println("Article: " + article);
		user=userService.save(user);
		//System.out.println("Article after: " + article);
		return "Record inserted";
}
	
	@RequestMapping(value = "/Fav/delete", method = RequestMethod.POST,consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String removeFavorites(FavouriteArticle article, NewsAnalyst user) throws ServletException {
		article.setUser(user);
		Set<FavouriteArticle>favArticles = new HashSet<>();
		favArticles.add(article);
		user.setFavArticles(favArticles);
		favArticleService.removeByArticleId(article.getArticleId(), user);
		//System.out.println("Article after: " + article);
		return "Record deleted";
}
}
