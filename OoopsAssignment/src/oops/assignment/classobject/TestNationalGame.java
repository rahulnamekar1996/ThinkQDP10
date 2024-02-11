package oops.assignment.classobject;
import java .util.Scanner;
public class TestNationalGame {

	public static void main(String[] args) 
	
	{
		String name;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Country Name");
		name=sc.next();
		
		
		
		NationalGame n1=new NationalGame();
		System.out.print("National game is : ");
		n1.showResult(name);
		
		
		

	}

}
