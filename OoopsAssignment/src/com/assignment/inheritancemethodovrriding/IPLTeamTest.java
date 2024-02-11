package com.assignment.inheritancemethodovrriding;

class IPLTeam
{
	void play() 
	{
		System.out.println("IPLTEAM");
	}
	
}
class CSK extends IPLTeam
{
	void play () 
	{
		super.play();
		System.out.println("csk");
	}
	
}
class RCB extends IPLTeam
{
	void play() 
	{
		super.play();
		System.out.println("RCB");
	}
}

public class IPLTeamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RCB r1=new RCB();
		r1.play();
		CSK c1= new CSK();
		c1.play();

	}

}
