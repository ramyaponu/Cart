package com.example.demo.dto;

public class Userdto {
	int userId;
	String userName;
	
	public Userdto() {
		// TODO Auto-generated constructor stub
	}
	
	public Userdto(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
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
	
}
