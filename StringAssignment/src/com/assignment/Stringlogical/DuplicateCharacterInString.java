package com.assignment.Stringlogical;

public class DuplicateCharacterInString {
	
	static void q4(String s) 
	{
		// 4.Write a Java program to find duplicate character in given string.
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i + 1; j < s.length(); j++) 
			{
				if (s.charAt(i) != ' ')
					if (s.charAt(i) == s.charAt(j))
						System.out.println(s.charAt(i) + " : is Duplicate");
			}

		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Stringsz are Immutable  ";
		q4(str);


	}

}
