package com.demo.methodpractice;

public class CheckPrime_Twinprime {
	
	
public static boolean checkPrime(int n) {
		
		int count=0;
		int i;
		for(i=2;i<=n/2;i++) {
			if(n%i==0)
				count++;
		}
		if(count==0)
			return true;
		else
			return false;
	}
	
	public static int checkTwinPrime(int n1,int n2) {
		if(checkPrime(n1) && checkPrime(n2))
			return n2-n1;
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=13;
		boolean status=checkPrime(num);
		if(status)
			System.out.println(num+" is prime");
		else
			System.out.println(num+" is not prime");
		
		
		//twin prime 
		int a=5;
		int b=7;
		System.out.println(checkTwinPrime(a, b));
		if(checkTwinPrime(a, b)==2) {
			System.out.println("twin prime");
		}
		else {
			System.out.println("not twin prime");
		}
	}

}
