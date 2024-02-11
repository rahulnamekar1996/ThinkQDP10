package com.assignment.printpattern;

public class Pattern2 {

	public static void main(String[] args) 
	{
		int i,j,row=4;
		for(i=row-1; i>=0;i--)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("#"+" ");
			}
			System.out.println();
		}

	}

}
