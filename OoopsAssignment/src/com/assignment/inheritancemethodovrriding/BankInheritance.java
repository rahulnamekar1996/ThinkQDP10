package com.assignment.inheritancemethodovrriding;

class Bank
{

	private double pAmount;
	
	protected double roi;
	
	public Bank() 
	{
		
	}
	public Bank( double pAmount,double roi)
	{
		
		this.pAmount=pAmount;
		this.roi=roi;
	}
	public double getpAmount() {
		return pAmount;
	}
	public void setpAmount(double pAmount) {
		this.pAmount = pAmount;
	}
	void getInterestRate() 
	{
		System.out.println("The rate of interest =" +roi);
	}
	public String toString() 
	{
		return "Bank "+pAmount+" "+roi;
	}
	
}
class SavingAc extends Bank
{
	private String acc_no;
	protected String ifsc;
	
		public SavingAc()
	{
		
	}
	public SavingAc(double pAmount,double roi,String acc_no,String ifsc) 
	{
		super(pAmount ,roi);
		this.acc_no=acc_no;
		this.ifsc=ifsc;
		
		
	}
	public String getAcc_no() 
	{
		return acc_no;
	}
	public void setAcc_no(String acc_no)
	{
		this.acc_no = acc_no;
	}
	public String getIfsc()
	{
		return ifsc;
	}
	public void setIfsc(String ifsc) 
	{
		this.ifsc = ifsc;
	}
	public void getInterestRate() 
	{
		System.out.println("The rate of Interest = "+roi);
	}
	
	
}
class Current extends Bank
{
	private String acc_no;
	protected String ifsc;
	
		public Current()
	{
		
	}
	public Current(double pAmount,double roi,String acc_no,String ifsc) 
	{
		super(pAmount ,roi);
		this.acc_no=acc_no;
		this.ifsc=ifsc;
		
		
	}
	public String getAcc_no() 
	{
		return acc_no;
	}
	public void setAcc_no(String acc_no)
	{
		this.acc_no = acc_no;
	}
	public String getIfsc()
	{
		return ifsc;
	}
	public void setIfsc(String ifsc) 
	{
		this.ifsc = ifsc;
	}
	public void getInterestRate() 
	{
		System.out.println("the rate of interest = "+roi);
	}
	
	
}
public class BankInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b=new Bank (7000,0.02);
		b.getInterestRate();

		SavingAc s=new SavingAc(10000,0.03,"123456","sbi123");
		s.getInterestRate();
		
		Current c=new Current (12000,0.08,"121314","idfc123");
		c.getInterestRate();
	}

}
