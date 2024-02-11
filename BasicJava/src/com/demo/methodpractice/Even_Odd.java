package com.demo.methodpractice;

public class Even_Odd {
	public static void printEvn(int num) {
		int i;
		
		for(i=1;i<=num;i++) {
			boolean status=isEven(i);
			if(status) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	public static boolean isEven(int n) {
		
		if(n%2==0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int n) {
		if(n%2!=0)
			return true;
		else
			return false;
		}
	public static void main(String[] args) {

		int range=50;
		printEvn(range);
		
		int a=53
				;
		System.out.println(isEven(a));
		

	}

}
