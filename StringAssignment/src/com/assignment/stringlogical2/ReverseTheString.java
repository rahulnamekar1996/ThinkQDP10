package com.assignment.stringlogical2;

public class ReverseTheString {
	
	static void findReverse(String st)
	{
		String s[]=st.split(" ");
		String rev =" ";
		rev=s[0];
		for(int i= 1;i<s.length-1;i++)
		{
			for(int j=s[i].length()-1;j>=0;j--) 
			{
				rev=rev+s[i].charAt(j);
			}
			rev= rev +" ";
		}
		System.out.println(rev +" "+s[s.length-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=" I am rahul naam toh suna hi hoga ";
		System.out.println(str);
		findReverse(str);

	}

}
