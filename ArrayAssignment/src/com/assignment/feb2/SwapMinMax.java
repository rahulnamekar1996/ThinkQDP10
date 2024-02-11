package com.assignment.feb2;

import java.util.Arrays;

public class SwapMinMax {
	
	public static void swapMaxMin(int[] arr) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int maxpos=0,minpos=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				maxpos=i;
			}
			if(arr[i]<min) {
				min=arr[i];
				minpos=i;
			}
		}

			int temp=arr[maxpos];
			arr[maxpos]=arr[minpos];
			arr[minpos]=temp;
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr= {1,2,-3,4,5,6};
		System.out.println(Arrays.toString(arr));
		swapMaxMin(arr);
	}


}
