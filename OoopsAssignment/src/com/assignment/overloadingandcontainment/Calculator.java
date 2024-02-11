package com.assignment.overloadingandcontainment;

public class Calculator {
	
	private double principleAmount,loanAmount;
	
	public Calculator() 
	{
		
	}
	public Calculator(double principleAmount) 
	{
		this.principleAmount=principleAmount;
	}
	

	public double getPrincipleAmount() {
		return principleAmount;
	}
	public void setPrincipleAmount(double principleAmount) {
		this.principleAmount = principleAmount;
	}
	
	public String loanAmount(double rate) 
	{
		loanAmount =principleAmount*(100+rate);
		return "Housing loan = "+loanAmount;
	}
	public String loanAmount(double rate1,double rate2) 
	{
		loanAmount =principleAmount*(100+rate1+rate2);
		return "Commercial Loan = "+loanAmount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculator c1=new Calculator(20000);
        
        System.out.println(c1.loanAmount(0.09));
        System.out.println(c1.loanAmount(0.09, 0.05));
	}

}
