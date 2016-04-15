package com.movies.angular.login;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Authority")
public class MovieBeanAuthorities {
	
	@Id
	String userName;
	String authority;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	
	

}
