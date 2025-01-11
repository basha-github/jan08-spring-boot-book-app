package com.book.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class BookUser {

	@Id
	private String userName;
	private String password;
	public BookUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public BookUser(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}



	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
