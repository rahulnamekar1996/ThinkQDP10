package com.assignment.switchstatement;
import java .util.Scanner;
public class NumbersInWords 
{

	public static void main(String[] args) 
	
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digits");
		num=sc.nextInt();
		
	
		switch (num)
	    {
	 
	  
	    
	    case 1:
	        System.out.print("One ");
	       break; 
	 
	    
	    case 2:
	        System.out.print("Two ");
	        break;
	 
	    
	    case 3:
	        System.out.print("Three ");
	    break;
	 
	    
	    case 4:
	        System.out.print("Four ");
	       break;
	 
	    
	    case 5:
	        System.out.print("Five ");
	        break;
	       default:
	       
	    	   System.out.print("enter no is out of range between(1-5)");
	 
	    }

	}

}
