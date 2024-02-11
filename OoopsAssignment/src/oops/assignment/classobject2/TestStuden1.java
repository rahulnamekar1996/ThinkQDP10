package oops.assignment.classobject2;

import java.util.Scanner;

public class TestStuden1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		int s1,s2,s3,s4,s5;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter five Subject Marks");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
		Student1 s=new Student1();
		
		
		System.out.println("Percentage = "+s.calPer(s1, s2, s3,s4, s5));
		s.setDetails(2, "Rahul");
		s.showDetails();	
		
	}

}
