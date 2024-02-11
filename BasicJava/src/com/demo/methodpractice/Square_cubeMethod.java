package com.demo.methodpractice;
import java .util.*;
public class Square_cubeMethod {
	
	
	
	public static int square(int n) 
	{
	  return n*n;
	}
	public static int cube(int n) 
	{
	  return n*n*n;
	}
	public static void showCube(int range)
	{
		int i;
		for (i=1;i<=range;i++) 
		{
			System.out.println(i+"=" +cube(i));
		}
	}

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int num= sc.nextInt();
		
		System.out.println("square = "+square(num));
		System.out.println("cube = "+cube(num));
		
		showCube(10);

	}

}
