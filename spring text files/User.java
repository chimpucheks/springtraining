package com.zensar.springbootdemo.entity;

public class User {

	private int userId;
	private String userName;
	private String Email;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userName, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		Email = email;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", Email=" + Email + "]";
	}
	
	
	
	
}
