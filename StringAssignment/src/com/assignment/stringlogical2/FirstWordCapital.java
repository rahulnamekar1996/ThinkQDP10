package com.assignment.stringlogical2;

import java.util.Arrays;

public class FirstWordCapital {
	public static void firstCapital(String s) 
	{
		String [] st=s.split(" ");
		System.out.println(Arrays.toString(st));
		
		for(int i=0; i<st.length;i++) 
		{
			String str=" ";
			if(st[i].charAt(0)>='a'&& st[i].charAt(0)<='z') 
			{
				str =str+(char)(st[i].charAt(0)-32);
			}
			for(int j=1;j<st[i].length();j++) 
			{
				str=str+st[i].charAt(j);
			}
			st[i]=str;
		}
		System.out.println(Arrays.toString(st));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "i am rahul";
		firstCapital(s);

	}

}
