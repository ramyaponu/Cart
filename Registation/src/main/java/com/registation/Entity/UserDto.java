package com.registation.Entity;

public class UserDto {

	Integer userId;
	String userName;
	Long mobileNumber;
	String email;
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", mobileNumber=" + mobileNumber + ", email="
				+ email + "]";
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
}
