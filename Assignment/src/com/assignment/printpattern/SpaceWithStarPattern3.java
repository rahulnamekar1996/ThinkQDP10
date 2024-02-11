package com.assignment.printpattern;

public class SpaceWithStarPattern3 {

	public static void spacePattern(int rows) 
	{
		int i,j,k;
		
		for(i=1;i<=rows;i++)
		{
			for(k=rows-1;k>=i;k--)
			{
				System.out.print(" ");		
				
			
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
			
		}
		for(i=1;i<=5;i++) {
			for(k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(j=4;j>=i;j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       spacePattern(5);
	}

}
