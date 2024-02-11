package oops.assignment.classobject2;

public class Student1 {
	int sid = 1;
	String sname="Abhay";
	float percentage;
	
	int sub1,sub2,sub3,sub4,sub5;
	
    public void setDetails(int sid,String sname) 
    {
    	this .sid =sid;
    	this.sname=sname;
    	
    }
    public void showDetails() 
    {
    	System.out.println("Student id = "+sid);
    	System.out.println("Student name = "+sname);
    
    }
    public float calPer(int sub1,int sub2,int sub3,int sub4,int sub5) 
    {
    	this.sub1=sub1;
    	this.sub2=sub2;
    	this.sub3=sub3;
    	this.sub4=sub4;
    	this.sub5=sub5;
    	
    	float total=sub1+sub2+sub3+sub4+sub5;
    	float avg= total/5;
    	float per =(total/500)*100;
    	return per; 
    	
    }
    

}
