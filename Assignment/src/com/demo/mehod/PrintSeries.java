package com.demo.mehod;
public class PrintSeries {

	public static void main(String[] args) {
		int j;
     int i;
     int n1=0, n2=2;
     
     for(i=1;i<=7;i++) 
     {
    	 n1 =n1+n1+1;
    	 System.out.println(n1);
    	 System.out.println(n2);
    	 n2 =n2+n2-1;
     }
	}

}
