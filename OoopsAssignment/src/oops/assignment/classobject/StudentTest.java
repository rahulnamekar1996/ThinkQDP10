package oops.assignment.classobject;

import java.util.Scanner;

class Students
{
	int id;
	String name;
	
 public void show() 
 {
	 System.out.println(" Student id ="+ id);
	 System.out.println(" student name "+ name);
 }
	
}



public class StudentTest {

	public static void main(String[] args) {
		
		Student s1= new Student();
		Student s2= new Student();
//		
//		s1.showDetails();
//		s2.showDetails();
//         
//		Students s3=new Students();
//		Students s4= new Students();
//		s3.show();
//		s4.show();
//	    new Students().show();	
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		s1.sid= 5;
		s1.sname="Arohi";
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		s2.sid= 6;
		s2.sname="Amol";
		System.out.println(s2.sid);
		System.out.println(s2.sname);
//    Scanner sc=new Scanner(System.in);
//    Student obj =new Student();
//	    
//	    for (int i=1;i<=2;i++) 
//	    {
//	    	System.out.println("Enter id");
//	    	obj.sid=sc.nextInt();
//	    	System.out.println("Enter name");
//	    	obj.sname=sc.next();
//	    	
//	    	System.out.println(obj.sid);
//	    	System.out.println(obj.sname);
//	    	System.out.println("-------------");
//	    }
		
		
	}

}
