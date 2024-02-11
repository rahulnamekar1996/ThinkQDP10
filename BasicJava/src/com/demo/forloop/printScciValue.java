package com.demo.forloop;
import java .util.Scanner;
public class printScciValue {

	public static void main(String[] args)
	{
		// conversion of charater to its acci value
		/*char ch;
		Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter any character");
        ch=sc.next().charAt(0);
        
        System.out.println(ch+"="+(int)ch);*/
       
		
		
//-------conversion of acci value to its character	-------------
          
		   int value;
           Scanner sc=new Scanner(System.in);

           System.out.println("Enter any number");
                
           
          value=sc.nextInt();

           System.out.println(value+"="+(char)value);
        			
	}

}
