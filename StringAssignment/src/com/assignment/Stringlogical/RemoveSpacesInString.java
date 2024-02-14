package com.assignment.Stringlogical;

public class RemoveSpacesInString {
	static void q5(String s) {
		// 5.Write a Java program to remove all extra blank spaces from a given string.
		s = s.trim();
		System.out.println(s);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "  Stringsz are Immutable  ";
		q5(str);

	}

}
