package com.oops.objectclass;

class Employee
{
	int eid;
	String ename;
	double esal;
	
	public void show() 
	
	{
		System.out.println(" Employee Id = "+ eid);
		System.out.println(" Employee Name = "+ ename);
		System.out.println(" Employee Sallary = "+ esal);
	}
	
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 =new Employee();
		e1.eid= 01;
		e1.ename = "Rahul";
		e1.esal= 30000;
		
		Employee e2=new Employee();
		e2.eid =02;
		e2.ename =" Tanmay";
		e2.esal= 35000;
		
		e1.show();
		 System.out.println("----------------------------------");
		e2.show();

		
	}

}
