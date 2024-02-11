package com.arrayassignmentday3;

import java.util.Arrays;

public class ReplaceNegativeWithBackEleSquare {
	public static void replaceNegative(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				i--;
				int sq=arr[i]*arr[i];
				i++;
				arr[i]=sq;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,-3,2,-4,-6};
		System.out.println(Arrays.toString(arr));
		replaceNegative(arr);
		System.out.println(Arrays.toString(arr));
	}
}
