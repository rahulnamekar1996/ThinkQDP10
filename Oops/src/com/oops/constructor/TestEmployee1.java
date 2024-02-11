package com.oops.constructor;

public class TestEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee1 e=new Employee1 ();
		Employee1 e1=new Employee1 (121,"Rahul",2500);
		System.out.println(e1);
		Employee1 e2=new Employee1(122,"amit");
		System.out.println(e2);
		e2.setEsal(25000);
		System.out.println(e2);
	
		
	}

}
