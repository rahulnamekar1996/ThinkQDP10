package com.assignment.arrayobject;

public class StudentTest {
	
	

		 public static void main(String[] args) {
		  Student[]stud=new Student[5];
		  
		 
		  stud[0]=new Student(1, "onkar ", new double[] {98,95,94});
		  stud[1]=new Student(2, "Pravin ", new double[] {98,95,94});
		  stud[2]=new Student(3, "Rushi ", new double[] {98,95,94});
		  stud[3]=new Student(4, "Piyush ", new double[] {98,95,94});
		  stud[4]=new Student(4, "Shreyash", new double[] {98,95,94});

		  for(Student s:stud) 
		  {
		   System.out.println(s);
		  }
		 }

		

}
