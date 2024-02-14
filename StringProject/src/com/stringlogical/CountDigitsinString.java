package com.stringlogical;

public class CountDigitsinString {
	static int findCount(String s)
	{
		int count=0;
		char ch[]= s.toCharArray();
		
		for(char c:ch)
		{
			if(c>=48 && c<=57)
			{
				count++;
			}
		}
		
		return count;
	}
	
	static int findCount2(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		String str="Java123Progr89am05";
		
		System.out.println(str);
		System.out.println("Digits:"+findCount2(str));
		
	}


}
