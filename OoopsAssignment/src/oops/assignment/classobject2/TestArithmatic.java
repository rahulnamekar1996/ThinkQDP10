package oops.assignment.classobject2;

import java.util.Scanner;

public class TestArithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		
        ArithmaticOperation a1=new ArithmaticOperation();
        System.out.println("Set values");
        a1.setValues(a,b);	
        a1.showResult();
        System.out.println("-------no return type------");
        a1.showaddition1();
        a1.showMul1();
        a1.showSubtraction1();
        a1.showdiv1();
        System.out.println("-------parametre pass-------");
        a1.showaddition2(12,125);
        a1.showSubtraction2(12,10);
        a1.showMul2(3, 3);
        a1.showdiv2(12, 4);
        
	}

}
