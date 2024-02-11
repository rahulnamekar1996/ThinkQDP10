package com.assignment.array2d;

public class SumOfColumnAndRows {
	
	
	
	static void rowsum(int ar[][])
	{
		int sum=0;
		for(int i =0;i<ar.length;i++) 
		{
			for(int j=0;j<ar.length;j++) 
			{
				sum=sum+ar[i][j];
			}
			System.out.println("Sum of the rows "+ i +" = "+ sum);
			sum=0;
		}
		
	}
	static void columnsum(int ar[][])
	{
		int sum=0;
		for(int i=0; i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++) 
			{
				sum=sum+ar[j][i];
			}
			System.out.println("Sum of the column "+ i +" ="+sum);
			sum=0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][]= {{1,2,3,4},{2,3,4,5},{5,6,7,8},{8,9,10,11}};
		rowsum(arr);
		columnsum(arr);

	}

}
