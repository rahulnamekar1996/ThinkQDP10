package com.assignment.printpattern;

public class Pattern20 {
	public static void pattern7b(int rows) {
		int i,j;
		for(i=rows;i>=1;i--) {
			for(j=i;j<=rows;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        pattern7b(6);
	}

}
