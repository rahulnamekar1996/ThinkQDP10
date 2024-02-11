package com.arrayassngnmentday2;

public class FindMinAndMaxChar {
	
	public static void maximumNumber(char ch[]) 
	{
		char max=ch[0];
		for(char i ='a';i<ch.length;i++) 
		{
			if (max<ch[i]) 
			{
				max=ch[i];
			}
		}
		System.out.println("minimum character in an array ="+max);
	}
	public static void minimumNumber(char ch[]) 
	{
		char min=ch[0];
		for(char i ='z';i<ch.length;i++) 
		{
			if (min>ch[i]) 
			{
				min=ch[i];
			}
		}
		System.out.println("maximum character in an array ="+min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char []ch = {'a','b','c','d','e'};
		maximumNumber(ch);
		minimumNumber(ch);
	}

}
