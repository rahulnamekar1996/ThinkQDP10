package com.assignment.inheritancemethodovrriding;

 class Kid
{
	
	public void readbook() 
	{
		System.out.println("Empty");
	}
	public void readbook(int id ,String name) 
	{
		System.out.println("Book id = "+id);
		System.out.println("Book name = "+name);
	}
	
}
 
 class BigKid extends Kid
 {
	 public void readbook(int id ,String name) 
	 {
		 System.out.println("bid ="+id);
		 System.out.println("bname = "+name);
	 }
 }

public class TestKid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kid k=new Kid();
		k.readbook();
		k.readbook(1, "roman words");
		BigKid b1=new BigKid();
		b1.readbook(2, "amity");

	}

}
