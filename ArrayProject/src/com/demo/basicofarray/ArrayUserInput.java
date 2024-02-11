package com.demo.basicofarray;
import java.util.Scanner;
public class ArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size ");
		int size =sc.nextInt();
		int[] arr =new int [size];
		System.out.println("Enter elements");
		
		for(int i=0; i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("------------------------------");
		for(int i=0;i<arr.length;i++)
			
		{
			
			System.out.println(arr[i]);
		}
		System.out.println("-----------------");
		System.out.println("All evenn numbers in array elements ");
         for(int i=0;i<arr.length;i++)
		{
			if (arr[i]%2==0) {
				System.out.println(arr[i]);
			
			}
			
		}
         

	}

}
