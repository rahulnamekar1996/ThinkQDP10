package com.assignment.constructoroverloadig;

public class Person {
	private int pid ;
	private String pname;
	
	public Person(int pid ,String pname) 
	{
		this.pid=pid;
		this.pname=pname;
	}
	
	public void setPid(int pid) 
	{
	this.pid=pid;
	}
	public int getPid()
	{
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public void showDetails() 
	{
		System.out.println("Person Id = "+pid);
		System.out.println("person name "+pname);

		
	}
}
