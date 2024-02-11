package com.assignment.array2d;
// print outer element of array
public class Q5 {
	
	public static void printOuterElement(int ar[][])
	{
		for(int i =0; i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++) 
			{
				if(i==0||j==0||i==ar.length-1||j==ar.length-1)
				{
					System.out.print(ar[i][j]);
				
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		printOuterElement(arr);
	}

}
