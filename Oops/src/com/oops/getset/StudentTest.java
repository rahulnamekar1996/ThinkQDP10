package com.oops.getset;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setDetails(1, "Digvijay", 80);
        s1.showDetails();
		s1.setSname("akshay");
		System.out.println(s1.getSname());
	}

}
