package com.assignment.array2d;

import java.util.Arrays;

// subtract two matrix
public class Q8
{
	static void printMatrix(int ar[][],int rowsize,int colsize) 
	{
		for(int i=0;i<rowsize;i++) 
		{
			for(int j=0; j<colsize;j++) 
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int [][] subtractArray (int ar[][],int ar1 [][],int size)
	{
		int ar2[][]=new int [size][size];
		for (int i =0;i<size;i++) 
		{
			for(int j=0;j<size;j++) 
			{
				ar2[i][j]= ar[i][j]-ar1[i][j];
			}
			
			
		}
		return ar2;
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int size=3;
		int ar[][]= {{4,5,6},{3,4,1},{1,2,3}};
		printMatrix(ar,size,size);
		
		int ar1[][]= {{2,0,3},{2,3,1},{1,1,1}};
		printMatrix(ar1,size,size);
		int c[][]=subtractArray(ar,ar1,size);
    	System.out.println("-----------------------");
		printMatrix(c,size,size);

	}

}
