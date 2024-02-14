package com.assignment.Stringlogical;

public class ReverseString 
{
	static void q7(String s) 
	{
		String rev = "";
		for (int i = s.length() - 1; i > 0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Stringsz are Immutable  ";
		q7(str);

	}

}
