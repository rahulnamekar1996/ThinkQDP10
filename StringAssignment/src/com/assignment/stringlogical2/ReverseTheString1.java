package com.assignment.stringlogical2;

public class ReverseTheString1 {
	
	static void reverse(String s) {
		String[] str=s.split(" ");
	//	System.out.println(Arrays.toString(str));
		for (int i = 1; i < str.length-1; i++) {
			s="";
			for (int j = str[i].length()-1; j >=0; j--) {
				s=s+str[i].charAt(j);
	
			}
				str[i]=s;
			}
		
		//System.out.println(Arrays.toString(str));
		String s1 = "";
		
		//System.out.println(s1.isEmpty());
		//System.out.println(s1.isBlank());


		for (int i = 0; i < str.length; i++) {
			s1+=str[i]+" ";
		}
		System.out.println(s1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I Love MY India";
		System.out.println(s);
		reverse(s);
	}


}
