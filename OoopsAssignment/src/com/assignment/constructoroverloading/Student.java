package com.assignment.constructoroverloading;

public class Student 
{
	
	private int sroll;
    private String sname;
	private float sub1,sub2,sub3,sub4,sub5,total;
	private float per;
	char grade;
	
	public Student()
	{
		
	}
	public Student(int sroll,String sname,int sub1,int sub2,int sub3,int sub4,int sub5) 
	{
		this.sroll=sroll;
		this.sname=sname;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
		this.sub5=sub5;
		
	}
	public void showResult() 
	{
		
		total=this.sub1+this.sub2+this.sub3+this.sub4+this.sub5;
		per= (total/500)*100;
		
		
	}
	public void showGrade() 
	{
		if(per >70) 
		{
			grade ='A';
		}
		else if(per >=50&& per<70) 
		{
		    grade ='B';
		}
		else if(per >= 40 && per <50) 
		{
		     grade ='C';
		}
		else 
		{
		     grade='F';
		}
	}
	public void showDetails() 
	{
		System.out.println("Student RollNo = "+sroll);
		System.out.println("Student Name = "+sname);
		System.out.println("Percentage = "+per);
		System.out.println("Grade = "+grade);
	}
	public void compareGrade(Student obj) 
	{
		if(this.per>obj.per) 
		{
			System.out.println(this.sname +" is greater marks than "+ obj.sname );
		}
		else
		{
			System.out.println(obj.sname +" is greater marks than "+ this.sname );
		}
	}
	
	
	
	

}
