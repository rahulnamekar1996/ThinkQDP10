package com.demo.whileloop;

public class PrintNumberWhileLoop {

	public static void main(String[] args) {

		int i=1;
		while(i<=50)
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
		  i++;
		}

	}

}
