package com.assignment.array2d;
// sum of lower and upper tringle in matric
public class Q11 {

	
	public static void printsumUppertringle(int ar[][],int column,int row) 
	{
		int uppersum=0;
		int lowersum =0;
		
		if(row!=column) 
		{
			System.out.println("matrix should be square");
			return;
		}
		
		for (int i=0;i<row;i++) 
		{
			for(int j=0;j<column;j++) 
			{
				if(i<=j) 
				{
					uppersum=uppersum+ar[i][j];
				}
			}
			
		
		}
		System.out.println("Upper sum is = "+uppersum);
		for (int i=0;i<row;i++) 
		{
			for(int j=0;j<column;j++) 
			{
				if(j<=j) 
				{
					lowersum=uppersum+ar[i][j];
				}
			}
			
		
		}
		System.out.println("Sum of lower = "+lowersum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int r=3;
         int c=3;
		int arr[][]= {{1,1,1},{2,2,2},{3,3,3}};
		printsumUppertringle(arr,r,c);
	}
	

}
