package com.oops.objectclass;

public class Student {
	
	int rollno=101;
	String name="RAHUL";
	
	public void show ()
	{
		System.out.println("Hii everyone");
    }
    public void show2()
    {
    	System.out.println("name ="+name);
    	System.out.println("roll no ="+ rollno);
    	
    }

	public static void main(String[] args) {
	
       Student s1=new Student();
       s1.show();
       s1.show2();
       System.out.println(s1.name);
       
		
	}

}
