package com.assignment.Stringlogical;

public class CountOccurance {
	
	static void q2(String s, char ch) {
		// 2.Write a Java program to count occurrences of a character in given string.
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch && s.charAt(i) != ' ')
				count++;
		}
		System.out.println(ch + " Count Of Occurance is= " + count);

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Stringsz are Immutable  ";
		q2(str,'m');

	}

}
