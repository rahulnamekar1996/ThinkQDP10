package com.oops.getset;

public class Employeetest {

	public static void main(String[] args) {
		Empolyee e1=new Empolyee();
		e1.setDetails(1, "rahul",45000 );
		e1.showDetails();
		e1.eid=1;
		//System.out.println(e1.eid());  // private variable can not access
		//System.out.println(e1.ename());//
		e1.setEname("abhay");
		System.out.println(e1.getEname());
		

	}

}
