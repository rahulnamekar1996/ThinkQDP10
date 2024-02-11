package com.assingnment.for_whileloop;
import java.util.Scanner;
public class PrintSeries_1_11_111 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the number of terms: ");
		  int n = sc.nextInt();
		  int series = 0, i;                                          // s for terms of series, c for n terms
		  for (i= 1; i <= n; i++)                          // To generate n terms
		  {
		   series = series * 10 + 1;
		   System.out.print(series + " ");
		  }
	}

}
