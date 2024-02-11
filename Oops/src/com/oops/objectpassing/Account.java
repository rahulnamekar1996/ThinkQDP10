package com.oops.objectpassing;

public class Account {
	
	private long accno;
	private String name;
	private float amount,withdraw,deposit;
	Account()
	{
		
	}
	Account(int accno,String name,float amount)
	{
		this.accno=accno;
		this.name=name;
		this.amount=amount;
	}
	public void insertDetails(int accno ,String name,float amount) 
	{
		this.name=name;
		this.accno=accno;
		this.amount=amount;
	}
	public long getAccno() 
	{
		return accno;
	}
	public void setAccno(long accno) 
	{
		this.accno = accno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public float getAmount() 
	{
		return amount;
	}
	public void setAmount(float amount) 
	{
		this.amount = amount;
	}
	public void showWithdraw(float withdraw)
	{
		this.withdraw=withdraw;
		
	}

}
