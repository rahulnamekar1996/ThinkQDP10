package com.arrayassignmentday1;

import java.util.Arrays;
import java.util.Scanner;

public class CubeOfNoInArray {
	
	
	public static int[] findCubeOfNos(int ar[]) 
	{
		for (int i=0;i<ar.length;i++)
		{
			ar[i]=ar[i]*ar[i]*ar[i];
		}
		return ar ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size");
		int size =sc.nextInt();
		int[] arr1 =new int[size];
		System.out.println("Enter elements");
		 for(int i =0; i<arr1.length;i++)
		 {
			 arr1[i]=sc.nextInt();
		 }
		 
		System.out.println(Arrays.toString( findCubeOfNos(arr1)));

	}

}
