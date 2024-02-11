package com.assingnment.for_whileloop;
import java .util.Scanner;
public class Print_Series2468 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int c, i = 2, n;                                          // c for counter, i for even nos.
		  System.out.print("Enter the number of terms: ");
		  n = sc.nextInt();
		  System.out.print("\n");
		  for (c = 1; c <= n; c++, i += 2)               //to generate n terms of the series
		  {
		   if (i % 4 == 0) {
		    System.out.print(-i + " ");
		   } else {
		    System.out.print(i + " ");
		   }
		  }
	}

}
