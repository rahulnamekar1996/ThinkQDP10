package com.demo.basicofarray;

import java.util.Arrays;

public class PassingArray {
	
	static void squareElements(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=ar[i]*ar[i];
					
		}
		
		System.out.println("Inside method");
		System.out.println(Arrays.toString(ar));
		
	}
	
	int  sumOfElements(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
					
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {5,6,0,2,2};
		
		int a[]= {4,3,8,9};
		
		System.out.println(arr); // Object inherit
		
		System.out.println(Arrays.toString(arr));
		
		// Display: using loop
		
//		Student s = new Student();
//		System.out.println(s.toString());
		
		squareElements(arr);
		System.out.println("-----------------------------");
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(a));
		
		squareElements(a);
		System.out.println("-----------------------------");
		System.out.println(Arrays.toString(a));
		
		
		System.out.println("===========================================");
		PassingArray obj= new PassingArray();
		
		//obj.sumOfElements({6,7,8,9});
		// Anonymous array
		System.out.println("Sum is:"+ obj.sumOfElements(new int[]{6,7,8,9}));
		
		int a1[]= {1,2,48,9};
		
		System.out.println("sum is :"+obj.sumOfElements(a1));
		
		
	}

	
}
