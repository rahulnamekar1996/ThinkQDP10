package com.assignment.array2d;

public class Q10 {
	
	public static void printMatrix(int ar[][]) 
	{
		for(int i=0;i<ar.length;i++) 
		{
			for(int j=0;j<ar[0].length;j++) 
			{
				System.out.print(ar[i] [j]);
			}
			System.out.println();
		}
	}
	
	public static void printUppertringle(int ar[][]) 
	{
		int row= ar.length;
		int column =ar[0].length;
		
		if(row!=column) 
		{
			System.out.println("matrix should be square");
			return;
		}
		
		for (int i=0;i<row;i++) 
		{
			for(int j=0;j<column;j++) 
			{
				if(i<j) 
				{
					ar[i][j]=0;
				}
			}
			
		
		}
		printMatrix(ar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]= {{1,2,3,4},{4,5,6,9},{7,8,9,5},{1,4,7,9}};
		printUppertringle(arr);
	}

	

}
