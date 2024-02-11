package com.demo.methodpractice;

public class Show_Table {
	
	
	public static void showTable(int num)
	{
		int i;
		
		for(i=1; i<=10; i++) {
		System.out.println(num+"*"+i+"="+ num*i);
		
		}
	}

	public static void main(String[] args) 
	{
		 
	     showTable(5);

	}

}
