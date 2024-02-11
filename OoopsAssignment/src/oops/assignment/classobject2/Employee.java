package oops.assignment.classobject2;

public class Employee {
	
	int empid;
	String empname;
	double empsal;
	
	
	public void setDetails(int empid,String empname,double empsal) 
	{
		this.empid=empid;
		this.empname=empname;
		this .empsal=empsal;

	}
	public double calculateSal() 
	{
		double hra =empsal*0.1;
		double da= empsal*0.2;
		
		double totalsal=empsal-(hra+da);
		
		return totalsal;
	}
	public void displaySallary() 
	
	{
		System.out.println("Empolyee id = "+empid);
		System.out.println("Empolyee name = " +empname);
		System.out.println("Empolyee salary = "+empsal);
	
		System.out.println("Gross salary = "+calculateSal());
	}

}
