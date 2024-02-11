package com.assignment.constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee();
		e1.setEmpid(1);
		e1.setEname("rahul");
		e1.setEsal(25000);
		System.out.println(e1.getEmpid());
		System.out.println(e1.getEname());
		System.out.println(e1.getEsal());
		System.out.println("-----------------");
		e1.showDetails();
	}

}
