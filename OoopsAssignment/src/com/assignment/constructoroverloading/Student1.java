package com.assignment.constructoroverloading;

public class Student1 {

	private int sroll;
    private String sname;
	private float sub1,sub2,sub3,sub4,sub5,total;
	private float per;
	char grade;
	
	public Student1()
	{
		this.sroll=sroll;
		this.sname=sname;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
		this.sub5=sub5;
		
		
	}
	
	
	public int getSroll() {
		return sroll;
	}
	public void setSroll(int sroll) {
		this.sroll = sroll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getSub1() {
		return sub1;
	}
	public void setSub1(float sub1) {
		this.sub1 = sub1;
	}
	public float getSub2() {
		return sub2;
	}
	public void setSub2(float sub2) {
		this.sub2 = sub2;
	}
	public float getSub3() {
		return sub3;
	}
	public void setSub3(float sub3) {
		this.sub3 = sub3;
	}
	public float getSub4() {
		return sub4;
	}
	public void setSub4(float sub4) {
		this.sub4 = sub4;
	}
	public float getSub5() {
		return sub5;
	}
	public void setSub5(float sub5) {
		this.sub5 = sub5;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public void showResult() 
	{
		
		total=this.sub1+this.sub2+this.sub3+this.sub4+this.sub5;
		per= (total/500)*100;
		
		
	}
	public void showGrade() 
	{
		if(per >70) 
		{
			grade ='A';
		}
		else if(per >=50&& per<70) 
		{
		    grade ='B';
		}
		else if(per >= 40 && per <50) 
		{
		     grade ='C';
		}
		else 
		{
		     grade='F';
		}
	}
	public void showDetails() 
	{
		System.out.println("Student RollNo = "+sroll);
		System.out.println("Student Name = "+sname);
		System.out.println("Percentage = "+per);
		System.out.println("Grade = "+grade);
	}

}