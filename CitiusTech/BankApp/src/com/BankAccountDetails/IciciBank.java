package com.BankAccountDetails;

import com.AppAbstract.BankInterface;

public class IciciBank implements BankInterface {

	private Integer accountNumber;
	
	private Integer userID;
	
	private String accountType;

	private Integer balance;
	
	public IciciBank(Integer accountNumber, Integer userId, String accountType, Integer balance) {
		super();
		this.accountNumber = accountNumber;
		this.userID = userId;
		this.accountType = accountType;
		this.balance = balance;
	}
	
	

	public Integer getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}


	public Integer getUserId() {
		return userID;
	}



	public void setUserId(Integer userId) {
		this.userID = userId;
	}



	public String getAccountType() {
		return accountType;
	}



	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}
	



	@Override
	public String toString() {
		return "IciciBank [accountNumber=" + accountNumber + ", userID=" + userID + ", accountType=" + accountType
				+ ", balance=" + balance + "]";
	}



	@Override
	public Integer withdraw(Integer withdrawalAmount) {
		if(this.balance < withdrawalAmount) {
	        System.out.println("You don't have enough funds.");
	    } else {
	        this.balance -= withdrawalAmount;
	        System.out.println("You have withdrawal " +withdrawalAmount + " from your account." + "\n" +
	                    "Balance is now: " +this.balance);
	    }
	  return this.balance;
	}

	@Override
	public Integer deposit(Integer depositAmount) {
		 this.balance += depositAmount;
		    System.out.println("You have deposit " +depositAmount +" to your account." + "\n" +
		            "Balance is now: " +this.balance);
		    return this.balance;
	}




	@Override
	public void welcomeUser(String bankName,String userName) {
	
		System.out.println("welcome to "+bankName+" ,"+userName);
		
	}



	@Override
	public void welcomeUser(String bankName) {
		System.out.println("welcome to "+bankName+" ,");	
	} 
}
