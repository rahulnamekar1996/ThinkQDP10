package com.demo.intermidiate;

public class MinCharacter {
	
   public static char findMin(char[]ch) 
   {
	   char min=ch[0];
	   for(int i=0;i<ch.length;i++) 
	   {
		   if(ch[i]<min) 
		   {
			   min=ch[i];
		   }
	   }
	   return min;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[]ch= {'b','c','d','a','e','f'};
		System.out.println("Minimum character in array = "+findMin(ch));

	}

}
