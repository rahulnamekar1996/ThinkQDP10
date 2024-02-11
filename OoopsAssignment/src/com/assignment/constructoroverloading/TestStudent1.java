package com.assignment.constructoroverloading;

public class TestStudent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s= new Student1();
		s.setSname("Rahul");
		s.setSroll(01);
		s.setSub1(90);
	//	System.out.println(s.getSub1());
		s.setSub2(80);
	//	System.out.println(s.getSub2());
		s.setSub3(60);
	//	System.out.println(s.getSub3());
		s.setSub4(50);
	//	System.out.println(s.getSub4());
		s.setSub5(50);
	//	System.out.println(s.getSub5());
		s.showResult();
		s.showGrade();
		s.showDetails();
		System.out.println("------");
		Student1 s1= new Student1();
		s1.setSname("Abhay");
		s1.setSroll(02);
		s1.setSub1(40);
		//System.out.println(s1.getSub1());
		s1.setSub2(70);
		//System.out.println(s1.getSub2());
		s1.setSub3(65);
		//System.out.println(s1.getSub3());
		s1.setSub4(56);
		//System.out.println(s1.getSub4());
		s1.setSub5(59);
		//System.out.println(s1.getSub5());
		s1.showResult();
		s1.showGrade();
		s1.showDetails();
		
		
	}

}
