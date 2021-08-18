package com.AppAbstract;

public abstract class AbstractUser {
	
	public abstract Boolean login(Integer userId,String password);
	
	public abstract Integer createUserId();

	public abstract Integer getUserId();
	
	public abstract String getBankName();

	public abstract void setBankName(String bankName);
	
	public abstract String getName();
	
}
