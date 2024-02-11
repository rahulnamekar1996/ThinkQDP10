package com.assignment.array2d;

public class Q4 {
	
	//4.4.	WAP to print minimum in columns.
	//Means e.g. arr[][]={{22, 31, 9}, {12, 5,16}, {34, 42, 2}} output is: 12, 5, 2.
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[][] arr = { { 22, 31, 9 }, { 12, 25, 16 }, { 34, 42, 2 } };
			int max = arr[0][0];
			int i,j;
			for ( i = 0; i < arr.length; i++) {

				for ( j = 1; j < arr[i].length;	j++ ) {
					if (arr[i][j] < max)
						System.out.print("Max Element In Row " + (i + 1) + " is :" + arr[i][j]);
				}
				System.out.println();
			}
			//System.out.println(arr.length);
		}

	

}
