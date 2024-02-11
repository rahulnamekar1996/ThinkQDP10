package oops.assignment.classobject2;

public class Cube {
	
	int num;
	
	public void findCube1() 
	{
		int cube =num*num*num;
		System.out.println("cube"+cube);
	}
	public int findcube2() 
	{
		return num*num*num;
	}
	public void findcube3(int num)
	
	{
		this.num=num;
		int cube =num*num*num;
		System.out.println("Cube ="+cube);
	}
public int findcube4(int num)
	
	{
		this.num=num;
		int cube =num*num*num;
		return cube;
		
	}
	

}
