

package com.cognizant.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="NewsAnalyst")
public class NewsAnalyst implements Serializable
{

	private static final long serialVersionUID = -3925713750005158403L;
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

@Column(name = "blacklist")
private boolean blacklist;

@Column(name = "preferredLanguage")

private String preferredLanguage;



@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
private Set<FavouriteArticle>favArticles = new HashSet<>();

public Set<FavouriteArticle> getFavArticles() {
	return favArticles;
}

public void setFavArticles(Set<FavouriteArticle> favArticles) {
	this.favArticles = favArticles;
}





public NewsAnalyst() {

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

public boolean getBlacklist() {
	return blacklist;
}

public void setBlacklist(boolean blacklist) {
	this.blacklist = blacklist;
}

public String getPreferredLanguage() {
	return preferredLanguage;
}

public void setPreferredLanguage(String preferredLanguage) {
	this.preferredLanguage = preferredLanguage;
}

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

}


