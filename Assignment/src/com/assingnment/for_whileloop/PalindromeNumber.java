package com.assingnment.for_whileloop;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		int rem,sum=0,temp;    
		  int num;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter number");
		  num=sc.nextInt();
				   
		  
		  temp=num;    
		  while(num>0){    
		   rem=num %10;  //getting remainder  
		   sum=(sum*10)+rem;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");   

	}

}
