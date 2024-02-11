package com.assignment.constructoroverloading;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(1,"rahul",25000);
		e1.calculateSal();
		e1.displayEmployeeDetails();
       System.out.println("------------------");
       Employee e2=new Employee(2,"akash",30000);
       e2.calculateSal();
       e2.displayEmployeeDetails();
		
	}

}
