package com.UserDetails;

import com.AppAbstract.AbstractUser;

public class Users extends AbstractUser {
	
    private String fullName;
    
    private String bankName;
	
	private static Integer runningNo=10000;
	
	private Integer userId;

	private String password;

	private String phoneNumber;

	private String email;
	
	public Users(String fullName,String bankName, String password, String phoneNumber, String email) {
		super();
		this.fullName = fullName;
		this.bankName= bankName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.userId=this.createUserId();
	}

	public String getName() {
		return fullName;
	}

	public void setName(String fullName) {
		
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public Integer createUserId() {
		Users.runningNo++;
		return runningNo;
		
	}
	
	@Override
	public Boolean login(Integer userId, String password) {
		if(this.userId.equals(userId) && this.password.equals(password))
		{
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Users [fullName=" + fullName + ", bankName=" + bankName + ", userId=" + userId + ", password="
				+ password + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	


}
