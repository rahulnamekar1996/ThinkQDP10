package com.assingnment.for_whileloop;
import java.util.Scanner;
public class FrequancyOfDidit_InNumber {

	public static void main(String[] args) 
	{
		int num,rem,digit,totaln,count=0;
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number");
		 num=sc.nextInt();
		 System.out.println("Enter digit");
		 digit=sc.nextInt();
		 
		 totaln=num;
		 
		 if(num==0 && digit==0) 
		 {
			 count++;
		 }
         while(num>0) 
         {
        	 rem=num%10;
        	 if(rem==digit) 
        	 {
        		 count++;
        	 }
        	 num=num/10;
         }
         
         System.out.println("Frequancy of  "+digit +"  in "+totaln +"="+count);
	}
	

}
