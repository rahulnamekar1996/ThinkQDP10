package com.assingnment.containmentinherisuper;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessDemo obj= new AccessDemo();
		//obj.a=100; // Private is not accessible
		obj.b=100;
		obj.c=100;
		obj.d=100;
		
		//obj.show();
		obj.display();
		obj.printMe();
		obj.test();

	}

}
