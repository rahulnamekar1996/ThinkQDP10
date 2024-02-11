package com.assignment.array2d;

public class CheckMatriceSparceOrNot {
	
	public static boolean checkSparceOrNot(int[][]ar)
	{
		int rows ,columns,size,count =0;
		
		rows=ar.length;
		columns=ar[0].length;
		 size=rows*columns;
		 for(int i=0;i<rows;i++) 
		 {
			 for(int j=0; j<columns;j++)
			 {
				 if(ar[i][j]==0) 
				 {
					 count++;
				 }
			 }
			 
		 }
		
		if(count>(size/2)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
		 
		 
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{4,2,3},{0,5,0},{0,0,6}};
		boolean
		
		
		
		res= checkSparceOrNot(arr);
		if(res) 
		{
			System.out.println("Materix is sparce");
		}
		else 
		{
			System.out.println("Matrix is not sparce");
		}

		
	}

}
