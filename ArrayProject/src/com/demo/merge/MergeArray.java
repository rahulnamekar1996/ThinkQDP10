package com.demo.merge;

import java.util.Arrays;

public class MergeArray {
	
	public static int [] mergeArray(int[] a1,int []a2) 
	{
		
		int len1=a1.length;
		int len2=a2.length;
		int []mar= new int[ len1+len2];
		int index =0;
		
		for(int i=0; i<a1.length;i++) 
		{
			mar[index++]=a1[i];
		}
		for(int i=0; i<a1.length;i++) 
		{
			mar[index++]=a2[i];
		}
		return mar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []arr1= {12,13,14,15,16};
		int arr[]= {14,17,10,9};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr));
		
		System.out.println(mergeArray(arr,arr1));
	}

}
