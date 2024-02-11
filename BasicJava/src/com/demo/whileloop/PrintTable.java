package com.demo.whileloop;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		int i=1;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		System.out.println("Table of"+" "+num);
		while(i<=10)
		{
	
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}

	}

}
