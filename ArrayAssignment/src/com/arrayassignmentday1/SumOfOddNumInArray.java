package com.arrayassignmentday1;
import java .util.Scanner;
public class SumOfOddNumInArray {
	
	public static void addOfOddNo(int ar[]) 
	{
		int sum=0;
	
		for(int i=0; i<ar.length;i++) 
		
		{
			
			if(ar[i]%2!=0) 
			{
				sum=sum+ar[i];
			}
		}
		System.out.println("Sum of odd numbers in array = "+sum);
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
		
		int arr[]=new int[] {8,7,9,1};
		addOfOddNo(arr);
		addOfOddNo(arr1);
		

		
	}

}
