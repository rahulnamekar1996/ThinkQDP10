package com.assignment.inheritancemethodovrriding;
import com.mob.*;
public class AppTest {

	public static void main(String[] args) {
		Devloper d1=new Devloper("rahul",3,"c#");
		DesktopApplication d=new DesktopApplication(1.2,"Spruing",d1,101);
		System.out.println(d);
		
		WebApplication w=new WebApplication(1.4,"Angular",d1,1234);
		System.out.println(w);
		
		MobileApplication m= new MobileApplication(5.2,"android",d1,1478955466);
		System.out.println(m);

	}

}
