package com.oops.staticvariable;

public class StaticVariable {
	
	int x;
	static int y;
	
	void instanceMethod() 
	{
		System.out.println(x);
		System.out.println(y);
	}
	static void staticMethod() 
	{
		StaticVariable s= new StaticVariable();
		System.out.println(s.x);
		System.out.println(y);
	}
	void show()
	{
		x++;
		y++;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	void dispaly() 
	{
		int x=100;
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
