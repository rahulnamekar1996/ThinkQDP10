package com.assignment.Stringlogical;

public class findFirstOccurance 
{

	static void q1(String s) 
	{
		// 1.Write a Java program to find first occurrence of a character in a given string
		
		for (int i = 0; i < s.length(); i++)
		{
			if (i == 0)
				System.out.println("First Character is: " + s.charAt(i));
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "Stringsz are Immutable  ";
		q1(str);

		


	}

}
