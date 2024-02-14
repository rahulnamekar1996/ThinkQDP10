package com.assignment.Stringlogical;

public class ToggleCaseInChracter {
	
	static void q6(String s) {
		// 6.Write a Java program to toggle case of each character of a string.
//		for (int i = 0; i < s.length(); i++) {
//			if(s.charAt(i)>=16 && s.charAt(i)<=122)
//			s=s.toUpperCase();
//			if(s.charAt(i)>=65 && s.charAt(i)<=90)
//				s=s.toLowerCase(s.charAt(i));
//		}
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 97 && ch[i] <= 122) {
				ch[i]=(char)(ch[i]-32);
			}else if(ch[i] >=65  && ch[i] <=90 ){
				ch[i]=(char)(ch[i]+32);

			}
		}
		System.out.println(ch);
	}


	public static void main(String[] args) {
		
				String str = "Stringsz are Immutable  ";
				q6(str);

	}

}
