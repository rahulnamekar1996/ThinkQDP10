package com.demo.mehod;

public class PrintSeries2 {

	public static void main(String[] args) {
		 int i;
	     int series=0;
	     
	     for(i=1;i<=10;i++) 
	     {
	    	 series =series+series-1;
	    	 System.out.println(series);
	     }

	}

}
