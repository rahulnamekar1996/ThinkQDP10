package com.arrayassignmentday3;

import java.util.Arrays;

public class PrintAlternate {
	
	public static void printAlternate(int []ar1,int[]ar2) 
	{
		int res []=new int [ar1.length+ar2.length];
		int index=0;
		int big =ar1.length>ar2.length?ar1.length:ar2.length;
		
		for(int i=0;i<big;i++) 
		{
			if(i<ar1.length) 
			{
				res[index++]=ar1[i];
			}
			if(i<ar2.length) 
			{
				res [index++]=ar2[i];
			}
		}
		System.out.println(Arrays.toString(res));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []ar1= {1,2,3,4};
		int []ar2= {11,22,33};
		printAlternate(ar1,ar2);

	}

}
