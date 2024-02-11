package com.assignment.array2d;

import java.util.Arrays;

public class SumOfMainDiagonalsElement {
	
	public static int getDiagSum(int ar[][]) 
	{
		int diagsum=0;
		for(int i=0;i<ar.length;i++) 
		{
			diagsum=diagsum+ar[i][i];
		}
		return diagsum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]={ {1,2,3,4},{4,5,6,9},{7,8,9,10},{1,2,3,4}};
		
		int c=getDiagSum(arr);
		System.out.println(c);
	}

}
