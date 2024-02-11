package com.assignment.abstarctandinterface;

abstract class BankAccount
{
	private String acc_no;
	private double balance=25000;
	
	public BankAccount() 
	{
		
	}
	public BankAccount (String acc_no,double balance) 
	{
	   this.acc_no=acc_no;
	   this.balance=balance;
		
	}
	public String getAcc_no() 
	{
		return acc_no;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	public abstract void deposite(double amount);
	public abstract void withdraw(double amount);
	
}
class SavingAccount extends BankAccount
{
	public SavingAccount() 
	{
		super();
	}
	public SavingAccount(String acc_no,double balance) 
	{
		super(acc_no ,balance);
	}
	@Override
	public void deposite(double amount) 
	{
		setBalance(getBalance()+amount);
		System.out.println("Deposite = "+amount+"Toatal balance ="+getBalance());
		
	}
	@Override
	public void withdraw(double amount)
	{
		if(getBalance()>=amount) 
		{
			setBalance(getBalance()-amount  );
			System.out.println("Withdraw = "+amount+ "Total balance = "+getBalance());
			
		}
		else 
		{
			System.out.println("insufficent fund");
		}
		
		
	}
	
}
class CurrentAccount extends BankAccount
{
	
	public CurrentAccount() 
	{
		super();
	}
	public CurrentAccount(String acc_no,double balance) 
	{
		super(acc_no ,balance);
	}
	@Override
	public void deposite(double amount) 
	{
		setBalance(getBalance()+amount);
		System.out.println("Deposite = "+amount+"Total balance = "+getBalance());
		
	}
	@Override
	public void withdraw(double amount)
	{
		if(getBalance()>=amount) 
		{
			setBalance(getBalance()-amount);
			System.out.println("Withdraw = "+amount+ "Total balance = "+getBalance());
			
		}
		else 
		{
			System.out.println("insufficent fund");
		}
		
		
	}
}

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b;
		b=new SavingAccount();
		b.deposite(5000);
		b.withdraw(7000);
		
		b=new CurrentAccount();
		b.deposite(2000);
		b.withdraw(28000);

	}

}
