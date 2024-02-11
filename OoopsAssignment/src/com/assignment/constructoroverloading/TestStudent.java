package com.assignment.constructoroverloading;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student s =new Student(1,"RAHUL",80,80,80,80,80);
        s.showResult();
        s.showGrade();
        s.showDetails();
        System.out.println("--------");
        Student s1 =new Student(1," Amar",50,60,55,45,65);
        s1.showResult();
        s1.showGrade();
        s1.showDetails();
        System.out.println("---Result-----");
        s.compareGrade(s1);
	}

}
