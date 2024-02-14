package com.demo.buuferandbuilder;

public class MutableOrNotBufferAndBuilder {
public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer("Hello");
		sb.append("World");
		System.out.println(sb);
		
		String s= new String("Hello");
		s.concat("World");
		System.out.println(s);
		
	}

}
