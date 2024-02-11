package com.demo.inheritance;

class Student 
{
	protected int id ;
	protected String  name;
	

public Student () 
{
	
}
public Student(int id,String name ) 
{
	this.id=id;
	this.name=name;
	
}
}
class SchoolStudent extends Student
{
	protected String schoolname;
	
	SchoolStudent()
	{
		
	}
	SchoolStudent(int id,String name,String schoolname)
	{
		super(id ,name);
		this.schoolname=schoolname;
	}
	
	public String toString() 
	{
		return "Student details  = "+id+""+name+""+schoolname;
	}
}
class CollageStudent extends Student
{
	protected String universityname;
	
	CollageStudent()
	{
		
	}
	CollageStudent(int id,String name,String universityname)
	{
		super(id,name);
		this.universityname=universityname;
	}
	
	public String toSring() 
	{
		return "Collage student details ="+id +""+name+""+universityname;
	}
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SchoolStudent s1=new SchoolStudent(1,"rahul","kynj schhol");
		System.out.println(s1);
		CollageStudent c2=new CollageStudent(2,"akshay"," msg Collage");
		System.out.println(c2);

	}

}
