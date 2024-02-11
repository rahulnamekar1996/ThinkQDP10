package com.assignment.arrayobject;
import java.util.Scanner;
public class EmployeeConstructor {
	static Scanner sc=new Scanner(System.in);
	static void enterEmployeeDetails(Employee e) 
	{
		
		System.out.println("Enter Employee id");
		e.setEmpid(sc.nextInt());
		System.out.println("Enter Employee name");
		e.setEmpname(sc.next());
		System.out.println("Enter Employee salary");
		e.setEsal(sc.nextDouble());
		Department d=new Department();
		System.out.println("Enter department id");
		d.setId(sc.nextInt());
		System.out.println("Enter department name");
		d.setName(sc.next());
		System.out.println("Enter location");
		d.setLocation(sc.next());
	}
	static void displayDetails(Employee e[]) 
	{
		for( Employee emp:e)
		{
			System.out.println(emp);
		}
	}
	public static void sortSal(Employee e[])
	{
		Employee etemp=new Employee();
	
		for(int i= 0;i<e.length;i++) 
		{
			for(int j=i+1;j<e.length;j++)
			{
				if (e[i].getEsal()>e[j].getEsal())
				{
					etemp=e[i];
					e[i]=e[j];
					e[j]=etemp;
				}
			}
		}
		
		System.out.println(etemp);
	}
	public static void maxSalary(Employee e[]) 
	{
		double max=e[0].getEsal();
		Employee etemp=new Employee();
		String name= e[0].getEmpname();
		
		for(int i=1;i<e.length;i++) 
		{
		
			
				if(e[i].getEsal()>max) 
				{
					max=e[i].getEsal();
					name=e[i].getEmpname();
;				}
			
		}
		System.out.println("max:"+max+"name = "+name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp[]=new Employee[3];
		
		emp[0]=new Employee(101,"rahul",67000,new Department(01,"Quality","pune"));
		emp[1]=new Employee(102,"Jayesh",35000,new Department(02,"production","nashik"));
		emp [2]=new Employee();
		System.out.println("----------------------");
		emp[2].setEmpid(105);
		emp[2].setEmpname("pankaj");
		emp[2].setEsal(50000);
		emp[2].setDepartment(new Department(12,"Maintanace","Mumbai"));
//		
		
//		Employee emp1 []=new Employee[2];
//		for(int i=0;i<emp1.length;i++) 
//		{
//			emp1[i]=new Employee();
//			enterEmployeeDetails(emp1[i]);
//		}
//		displayDetails(emp1);
		
		sortSal(emp);
		
		for(Employee e:emp) 
		{
			
			System.out.println(e);
		}
		maxSalary(emp);
	}

}
