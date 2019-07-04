package com.cognizant.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1849283556908223123L;

	@Id
	@Column(name = "userId")
	private String userId;

	@Column(name = "emailId")
	private String emailId;

	@Column(name ="name")
	private String name;
	@Column(name = "lastName")
	private String lastName;

	@Column(name = "password")
	private String password;

	 public Admin() {

	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	 

}
