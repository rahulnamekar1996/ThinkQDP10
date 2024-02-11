package com.assignment.printpattern;

public class Pattern21 {

	public static void pattern7c(int rows) {
		int i,j;
		
		for(i=rows;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(i=2;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      pattern7c(5);
	}

}
