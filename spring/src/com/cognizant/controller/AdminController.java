package com.cognizant.controller;

import java.util.Date;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.Admin;
import com.cognizant.exception.NewsAnalystException;
import com.cognizant.service.AdminService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@CrossOrigin(origins = "http://localhost", maxAge = 3600)
@RestController
@RequestMapping("/user1")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST,
			consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)

	public String login( Admin login) throws ServletException, NewsAnalystException {

		String jwtToken = "";

		if (login.getUserId() == null || login.getPassword() == null) {
			throw new ServletException("Please fill in username and password");
		}

		String userId = login.getUserId();
		String password = login.getPassword();

		Admin user1 = adminService.findUser1(userId, password);
		

		if (user1 == null) {
			throw new ServletException("User Id not found.");
		}

		String pwd = user1.getPassword();

		if (!password.equals(pwd)) {
			throw new ServletException("Invalid login. Please check your name and password.");
		}

		jwtToken = Jwts.builder().setSubject((userId)).claim("roles", "user").setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact();

		return jwtToken;
	}

}
