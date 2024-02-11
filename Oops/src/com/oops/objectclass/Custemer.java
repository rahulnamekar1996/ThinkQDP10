package com.oops.objectclass;


class TestCustomer
{
	int custid;
	String custname;
	
	public void showDetails()
	{
		int a= 10; 
		System.out.println(" Customer name = "+ custname);
		System.out.println(" Custemor id ="+ custid);
		System.out.println(a);
		
	}
	public void test() 
	{
		System.out.println(" customer id = "+ custid);
		//System.out.println(a);
	}
	

}

public class Custemer {

	public static void main(String[] args) {
	   
		TestCustomer c1= new TestCustomer();
		c1.showDetails();
        c1.test();
	}

}
