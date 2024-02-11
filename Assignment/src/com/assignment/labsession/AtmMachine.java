package com.assignment.labsession;
import java.util.Scanner;
public class AtmMachine {

	public static void main(String[] args) {
		
		double balance= 10000;
		double amt;
		Scanner sc= new Scanner(System.in);
		System.out.println("welcome to ATM machine");
		System.out.println("1.Diposite\n2.Withdraw\n3.Checkbalance");
		System.out.println("Enter option");
		int op=sc.nextInt();
		switch(op)
		{
		case 1: 
			System.out.println("Enter amount to Diposite");
			amt= sc.nextDouble();
			System.out.println("Balance"+(balance+amt));
			break;
		case 2:
			System.out.println("Enter amount to withdrawal");
		    amt=sc.nextDouble();
		    System.out.println("balance"+(balance-amt));
		    break;
		case 3:
			System.out.println("balance is ="+balance);
			break;
			default:
				System.out.println("Invalid option");
			
			
		
		
		}
		
		
				
		
		

	}

}
