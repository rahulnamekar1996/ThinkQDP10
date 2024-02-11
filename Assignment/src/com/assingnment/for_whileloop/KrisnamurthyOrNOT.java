package com.assingnment.for_whileloop;
import java.util.Scanner;
public class KrisnamurthyOrNOT {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         int n;
         System.out.println("Enter any number:");
         n= sc.nextInt();
         int m = n;
         int sum = 0;
         while (n != 0) {
              int d = n%10;
              int fact = 1; 
              for (int i= 1; i<= d; i++) 
                   fact = fact * i;
              sum = sum + fact;
              n = n / 10;
         }
         if ( sum == m)
              System.out.println ("yes");
         else
              System.out.println ("no");
	}

}
