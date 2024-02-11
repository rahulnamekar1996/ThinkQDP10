package com.demo.conatiment;

public class MyCollage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(101,"Rahul",75,new Course(1,"c#",45000));
		System.out.println(s1);
		System.out.println(s1.getCourse().hashCode());
		
		Student s2 =new Student();
		s2.setSid(103);
		s2.setSname("Pnakaj");
		s2.setMarks(90);
		s2.setCourse(new Course(1,"c#",45000));
		System.out.println(s2);
		System.out.println(s2.getCourse().hashCode());
		System.out.println("-------------");
		Course c1=new Course(101,"c#",45000);
		Course c2=new Course(102 ,".net",50000);
		Course c3= new Course(103,"python",47000);
		
		System.out.println("-----------------");
		Student s3=new Student (1,"rahul",95,c1);
		Student s4=new Student (2,"pravin",95,c1);
		Student s5=new Student (3,"Tanmay",95,c1);
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		System.out.println("---------");
		System.out.println(s3.getCourse().hashCode());
		System.out.println(s5.getCourse().hashCode());
		
		System.out.println("-------------");
		System.out.println(s3.getCourse().getFees());
		System.out.println(s5.getCourse().getFees());
		s3.getCourse().setFees(55000);
		System.out.println(s3.getCourse().getFees());
		System.out.println(s5.getCourse().getFees());

		}

}
