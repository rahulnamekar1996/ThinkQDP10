package com.demo.buuferandbuilder;

public class BuuferAndBuilder {
	
public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer();
		sb.append("Hello");
		System.out.println(sb.capacity());
		
		StringBuilder sb1= new StringBuilder("Hello");
		System.out.println(sb1.capacity());
		
		StringBuffer sb2= new StringBuffer(5);
		sb2.append("Java");
		System.out.println(sb2.capacity());
		
		sb2.append("SQL");
		System.out.println(sb2.capacity());// (oldcap*2)+2
		//(5*2)+2=12
		
	}


}
