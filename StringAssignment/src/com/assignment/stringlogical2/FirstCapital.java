package com.assignment.stringlogical2;

public class FirstCapital {
static void firstCap(String s) {
		
		String[] st=s.split(" ");
		for (int i = 0; i < st.length; i++) {
			String str="";

			if(st[i].charAt(0)>='a' && st[i].charAt(0)<='z')
				str=str+(char)(st[i].charAt(0)-32);
			for (int j = 1; j < st[i].length(); j++) {
				str=str+st[i].charAt(j);
			}
			st[i]=str;
		}
		//System.out.println(Arrays.toString(st));
		String st1="";
		for (int i = 0; i < st.length; i++) {
			st1+=st[i]+ " ";
		}
		System.out.println(st1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="yuou are good kabbadi player";
		System.out.println(str);
		firstCap(str);
	}


}
