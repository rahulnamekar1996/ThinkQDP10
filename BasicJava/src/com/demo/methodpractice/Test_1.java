package com.demo.methodpractice;

public class Test_1 {

 static int sum=0;
 static int i;
	
	 public static void calSum(int num)
	 {
		 
		 for(i=1;i<=num;i++)
		 {
			 sum=sum+i;
		 }
		 System.out .println("sum="+sum);	
		 
	 }
	 public static int calsum1(int num1) 
	 {
		 for(i=1;i<=num1;i++)
		 {
			 sum=sum+i;
		 }
		 return sum;
		 
	 }
	public static void main(String[] args) {
		
		int n=10;
		calSum(n);
		
		int newnum= 10;

		System.out.println(calsum1(newnum));
		
				
		

	}

}
