package com.assignment.printpattern;

public class Pattern6 
{

	public static void pattern2c(int rows)
	{

	int i,j,temp=1;
	
	for(i=1;i<=rows;i++) {
		for(j=1;j<=rows;j++) {
			System.out.print(temp);
			if(temp==1)
				temp=0;
			else
				temp=1;
		}
		System.out.println();
	}
}

		
	public static void main(String[] args) {
		
		pattern2c(5);

	}

}
