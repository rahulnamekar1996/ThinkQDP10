package com.inherit;
import com.demo.inheritance.*;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessDemo obj= new AccessDemo();
//		obj.a=100; // Private is not accessible
//		obj.b=100;// Default
//		obj.c=100; // Protected
		obj.d=100;
		
		//obj.show();
		//obj.display();
		//obj.printMe();
		obj.test();

	}

}
