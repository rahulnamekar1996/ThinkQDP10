package com.demo.methhodoverloading;

public class TypePromotion {
	
	static void display(int n) 
	{
		System.out.println("in int");
		System.out.println(n);
	}
	static void display(char n)
	{
		System.out.println("in char");
		System.out.println(n);
	}
    static void display(float n)
    {
    	System.out.println("in float");
    	System.out.println(n);
    }
    static void display(long n) 
    {
    	System.out.println("in long");
    	System.out.println(n);
    }
    static void display (int n1,double d1) 
    {
    	System.out.println("in method1");
    	System.out.println("Ans = "+(n1+d1));
    }
    static void display(long n,float d) 
    {
    	System.out.println("in methgod 2");
    	System.out.println("Ans = "+(n+d));
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//display(1,9.8);
		//display(9l,7.4);
		
		System.out.println("---------");
		display('A');
		display(9l,7.4f);
		System.out.println("----------");
	

	}

}
