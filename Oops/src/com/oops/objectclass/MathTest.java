package com.oops.objectclass;

class MathCalulation
{
	public int findSquare(int n)
	{
		return n*n;
	}
	public int findCube(int n) 
	{
		return n*n*n;
	}
}



public class MathTest {

	public static void main(String[] args) {
		
		MathCalulation m1=new MathCalulation();
		int sqaure= m1.findSquare(3);
		System.out.println("sqaure ="+ sqaure);
		int cube=m1.findCube(4);
		System.out.println("cube ="+ cube);
		
		System.out.println("Square ="+ m1.findSquare(3));
		System.out.println ( "Cube ="+ m1.findCube(3));
		
		

	}

}
