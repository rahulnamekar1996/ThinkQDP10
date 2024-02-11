package com.oops.constructor;

public class Movie {

	
	private int mid;
	private String mname;
	{
		System.out.println("IIB_1");
	}
	{
		System.out.println("IIB_2");
	}
	
	public Movie(int mid,String mname) 
	{
		this.mid=mid ;
		this.mname=mname;
		System.out.println("Movie Id = "+mid);
		System.out.println("Movies name = " +mname);
	}
	public static void main(String[] args) {
		// ODO Auto-generated method stub
	      Movie m1=new Movie(1,"abcd");
	      Movie m2 =new Movie(2,null);

	}

}
