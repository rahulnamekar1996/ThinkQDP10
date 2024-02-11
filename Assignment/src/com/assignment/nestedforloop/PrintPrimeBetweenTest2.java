package com.assignment.nestedforloop;

public class PrintPrimeBetweenTest2 {
	public static boolean checkPrime(int n) {
		int i,count=0;
		
		for(i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==0)
			return true;
		else
			return false;
	}
	
	public static void printPrime(int range) {
		int i;
		
		for(i=2;i<=range;i++) {
			boolean test=checkPrime(i);
			if(test)
				System.out.println(i);
		}
	}
	
		
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(checkPrime(50));
        printPrime(50);
	}

}
