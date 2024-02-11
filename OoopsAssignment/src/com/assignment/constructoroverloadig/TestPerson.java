package com.assignment.constructoroverloadig;

public class TestPerson {

	public static void main(String[] args) {
		Person p1= new Person(1,"rahul");
		Person p2=new Person (2,"abhay");
		p1.showDetails();
		p2.showDetails();
		
		p1.setPid(3);
		System.out.println(p1.getPid());
		p1.setPname("rakesh");
		System.out.println(p1.getPname());
		p2.setPid(4);
		System.out.println(p2.getPid());

		p2.setPname("amol");
		System.out.println(p2.getPname());
		p1.showDetails();
		p2.showDetails();

	}

}
