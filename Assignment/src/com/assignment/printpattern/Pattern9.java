package com.assignment.printpattern;

public class Pattern9 {
	public static void pattern3c(int rows) {
		int i,j,temp=1;
		
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		pattern3c(5);


	}

}
