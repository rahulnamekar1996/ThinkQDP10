package com.assignment.labsession;
import java .util.Scanner;
public class SizeUsingIfelse {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter size");
		size=sc.nextInt();
		
		if(size>=30&&size<=34) 
		{
			System.out.println("Small size");
		}
		else if(size>=35&& size<=38) 
		{
			System.out.println("Medium size");
		}
		else if(size>=39&&size<=41) 
		{
			System.out.println("large size");
		}
		else if(size>=42&&size<=45) 
		{
			System.out.println("extra  size");
		}
		else 
		{
			System.out.println("inavlid Input");
		}
		
	}

}
