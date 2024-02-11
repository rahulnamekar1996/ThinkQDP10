package com.demo.whileloop;

public class While_Test2 {

	public static void main(String[] args) {

		int i=1;
		while(true) {
			System.out.println("hello "+i);
			if(i==6)
				break;
			i++;
		}
	}

}
