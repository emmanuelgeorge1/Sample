package com.AppAbstract;

public interface BankInterface {

	public Integer withdraw(Integer withdrawalAmount);
	
	public Integer deposit(Integer depositAmount);
	
	public Integer getUserId();
	
	public void setAccountNumber(Integer accountNumber);
	
	public void welcomeUser(String bankName,String userName);
	
	public void welcomeUser(String bankName);

}
