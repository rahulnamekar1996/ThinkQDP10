 package com.assignment.nestedforloop;

public class PrmeNumberBetwen {
	public static void printPrime(int n) {
		int i,j;
		int count;
		
		for(i=2;i<=n;i++) {
			count=0; //i=2  i=3 i=4 i=5
			for(j=2;j<=i/2;j++) {
				if(i%j==0)
					count++;
			}
			if(count==0)
				System.out.println(i);
			
		}
	}
	
	

	public static void main(String[] args) {

        printPrime(300);
	}

}
