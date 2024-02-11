package com.assignment.constructoroverloading;

public class TestEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee1 e=new Employee1();
		e.setEid(01);
		e.setEname("rahul");
        e.setBasicsal(25000);
        e.setDept("Quality");
       
        e.calculateSal();
        e.displayEmployeeDetails();
        System.out.println("-------");
        Employee1 e1=new Employee1();
		e1.setEid(01);
		e1.setEname("Akash");
        e1.setBasicsal(20000);
        e1.setDept("Maintanance");
        e1.calculateSal();
        e1.displayEmployeeDetails();
        e.compareSal(e1);
        
        
	}
	

}
