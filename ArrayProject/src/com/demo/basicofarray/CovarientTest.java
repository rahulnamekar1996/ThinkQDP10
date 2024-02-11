package com.demo.basicofarray;
class Name
{
	public Object firstName(String o)
	{
		return o;
	}
   
}
class LastName extends Name



{
	public String firstName (String o) 
	{
		return o;
	}
}

public class CovarientTest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n;
		n=new LastName();
		System.out.println(n.firstName("rahul"));
		

	}

}
