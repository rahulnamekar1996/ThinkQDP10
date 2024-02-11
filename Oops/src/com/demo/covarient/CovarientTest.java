package com.demo.covarient;

class Display
{
	public Object getMsg(String o) 
	{
		return o;
	}
	
}
class Show extends Display 
{
	public String getMsg(String o) 
	{
		return o;
	}
}

public class CovarientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Show s=new Show();
		String n=s.getMsg("rahul");
		System.out.println("Name = "+n);

	}

}
