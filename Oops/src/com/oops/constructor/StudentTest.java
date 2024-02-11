package com.oops.constructor;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student();
		Student s2=new Student(10,"rahul");
		s1.setSid(01);
		s1.show();
		s2.show();
		System.out.println(s1.getSid());
	}

}
