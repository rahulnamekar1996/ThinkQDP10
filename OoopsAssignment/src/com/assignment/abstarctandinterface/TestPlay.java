package com.assignment.abstarctandinterface;

class FootBall implements Playable
{

	@Override
	public void play() {
		System.out.println("Football");
		System.out.println("type of outdoor game");
		
	}
	
}
class VolleyBall implements Playable
{

	@Override
	public void play() {
		
		System.out.println("VollyBall");
		System.out.println("7 no of players in VOLLYBALL");
		
	}
	
}
class BasketBall implements Playable
{

	@Override
	public void play() {
		System.out.println("BasketBall");
		System.out.println("its outdoor game");
		
	}
	
}

public class TestPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playable p;
		p=new BasketBall();
		p.play();
		p=new VolleyBall();
		p.play();
		p=new FootBall();
		p.play();
		

	}

}
