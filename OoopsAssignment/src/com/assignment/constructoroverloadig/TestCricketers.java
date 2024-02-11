package com.assignment.constructoroverloadig;
import java.util.Scanner;
public class TestCricketers {

	public static void main(String[] args) {
		
		int id;
		String name;
		boolean isballer;
		float strike;
		int runs;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter player id");
		id=sc.nextInt();
		System.out.println("Enter player name");
		name=sc.next();
		System.out.println("player is boller");
		isballer=sc.nextBoolean();
		System.out.println("Enter player strikerate");
		strike=sc.nextFloat();
		System.out.println("Enter player id");
		runs=sc.nextInt();
		
	   
		Cricketers c1=new Cricketers(id,name,isballer,strike,runs);
		Cricketers c2=new Cricketers(strike,isballer);
		Cricketers c3=new Cricketers();
		
	//	c1.setPlayerid(1);
		System.out.println(c1.getPlayerid());
//		c1.setName("pravin");
	System.out.println(c1.getName());
//		c1.setIsballer(true);
	System.out.println(c1.getIdballer());
//		c1.setStrikerate(121);
	System.out.println(c1.getStrikerate());
//		c1.setPlayerid(1);
	System.out.println(c1.getRuns());
	
	System.out.println("----------");
//		
	System.out.println(c2.getPlayerid());
//	c1.setName("pravin");
System.out.println(c2.getName());
//	c1.setIsballer(true);
System.out.println(c2.getIdballer());
//	c1.setStrikerate(121);
System.out.println(c2.getStrikerate());
//	c1.setPlayerid(1);
System.out.println(c2.getRuns());

System.out.println("---------");
  c2.showDetails();
	}

}
