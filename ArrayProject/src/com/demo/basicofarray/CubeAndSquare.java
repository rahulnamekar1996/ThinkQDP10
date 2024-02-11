package com.demo.basicofarray;
import java.util.Scanner;
import java.util.Arrays;

public class CubeAndSquare {
	public static int[] getSquare(int ar[]) 
	{
		for (int i=1;i<ar.length;i++) 
		{
			ar[i]=ar[i]*ar[i];
		}
		return ar;
		
	}
	public static int[] getcube(int ar[]) 
	{
		for (int i=1;i<ar.length;i++) 
		{
			ar[i]=ar[i]*ar[i]*ar[i];
		}
		return ar;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++) 
		{
			
			arr[i]=sc.nextInt();
			
		}
		System.out.println("1.square\n 2.cube");
		System.out.println("Enter choice");
		switch(sc.nextInt())
		{
		     
		case 1:
		{
			int []res =getSquare(arr);
			System.out.println(Arrays.toString(res));
			break;
		}
			
		case 2:
		{
			int[]res =getcube(arr);
			System.out.println(Arrays.toString(res));
			break;
		}
		default:
		{
			System.out.println("invalid input");
		}
		}

	}

}
