package com.assignment.constructor;

public class Course {
	
	private int cid;
	private String cname;
	
	public Course() 
	{
		
	}
	public Course(int cid, String cname) 
	{
		this.cid=cid;
		this.cname=cname;
	}
	public void showDetails() 
	{
		System.out.println("Course Id = "+cid); 
		System.out.println("Course Name = "+ cname);
		
	}

}
