package com.assignment.array2d;

import java.util.Arrays;

public class TransposeOfMatrix {

	public static int[] []transposeOfMtrix(int ar [][],int rows,int columns) 
	{
		int transpose[][]=new int[columns][rows];
		for(int i=0;i<ar.length;i++) 
		{
			for(int j=0;j<ar[i].length;j++) 
			{
			transpose[j][i]=ar[i][j];
			}

		}
		return transpose;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [][]= new int [][]{{1,2,3},{4,5,6},{7,8,9}};
		int res[][]=transposeOfMtrix(arr,3,3);
		System.out.println(res);
		
	}

}
