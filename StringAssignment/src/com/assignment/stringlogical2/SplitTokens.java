package com.assignment.stringlogical2;

import java.util.Arrays;

public class SplitTokens {
	
	static void splitString(String s) 
	{
		String []st=s.split("\\$");
		System.out.println(Arrays.toString(st));
		String str= " ";
		for(int i=0; i<st.length;i++)
		{
			str=str+st[i]+" ";
			
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HELLO$WORLD";
		splitString(s);

	}

}
