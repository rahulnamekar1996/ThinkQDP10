package oops.assignment.classobject2;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		String name;
		double sal;
		String designation;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emplooye id");
		id= sc.nextInt();
		System.out.println("Enter Emplooye name");
		name= sc.next();
		System.out.println("Enter Emplooye Sallary");
		sal= sc.nextDouble();
		
         Employee e1=new Employee();
         e1.setDetails(id, name, sal);
         e1.displaySallary();
	}
	

}
