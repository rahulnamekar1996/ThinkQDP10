package com.assignment.inheritancemethodovrriding;


class Student
{
   private int id ;
   private String name;
   
   Student()
   {
	   
   }
   Student(int id ,String name)
   {
	   this.id =id;
	   this.name =name;
   }
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1= new Student ();
		s1.setId(11);
		System.out.println(s1.getId());
		Student s2= new Student();
		s2.setId(21);
		System.out.println(s2.getId());
	}

}
