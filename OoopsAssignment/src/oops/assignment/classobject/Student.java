package oops.assignment.classobject;

public class Student {
	
	int sid =01;
	String sname= " rohit";
	
	public void showDetails(int sid,String sname) 
	{
		this .sid=sid;
		this.sname=sname;
	}
	
	public void showDetails() 
	{
		System.out.println(" student name ="+ sname);
		System.out.println(" Student Id ="+ sid);
		
	}
	
	
	

}
