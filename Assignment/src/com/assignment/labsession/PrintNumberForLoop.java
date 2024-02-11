package com.assignment.labsession;

public class PrintNumberForLoop {

	public static void main(String[] args) 
	{
		int i;
		for(i=1;i<=50;i++)
		{
		  if(i%3==0&&i%5==0) 
		  {
			  System.out.println("Welcome");
		  }
		  else if(i%3==0)
		  {
			  System.out.println("Hello");
		  }
		  else if(i%5==0) 
			  
		  {
			  System.out.println("bie");
		  }
		  else 
		  {
			  System.out.println(i);
		  }
		}
		
		

	}

}
