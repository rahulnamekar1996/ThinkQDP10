package com.assignment.printpattern;

public class Pattern12 {
	
	public static void pattern4c(int rows) {
		int i,j;
		for(i=rows;i>=1;i--) {
			for(j=rows;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern4c(4);
	}
}