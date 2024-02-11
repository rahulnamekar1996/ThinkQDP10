package com.assingnment.containmentinherisuper;
import java.util.Scanner;
public class TaxiInfo {
	Scanner sc = new Scanner(System.in);
	// 1st way
		public void enterDetaiels(Car c) {
			System.out.println("Enter Car No:");
			c.setCarno(sc.nextInt());
			System.out.println("Enter Car Brad:");
			c.setBrand(sc.next());
			System.out.println("Enter Car Model:");
			c.setModel(sc.next());

			c.setDriver(new Driver());
			System.out.println("Eneter Driver Id:");
			c.getDriver().setDid(sc.nextInt());
			System.out.println("Enter Driver Name:");
			c.getDriver().setDname(sc.next());
			System.out.println("Enter Driver Adhar:");
			c.getDriver().setAdhar(sc.nextLong());
			System.out.println("Enter Driver Salary:");
			c.getDriver().setSalary(sc.nextDouble());
			
			
		}
		//2nd way
		public void enterCarDetails(Car c,Driver d) {
			
			
			
			System.out.println("Enter car no");
			c.setCarno(sc.nextInt());
			System.out.println("Enter car brand");
			c.setBrand(sc.next());
			System.out.println("Enter car model");
			c.setModel(sc.next());
			
			enterDriverDetails(d);
			
			c.setDriver(d);
		}
		public void enterDriverDetails(Driver d) {
			System.out.println("Enter driver id");
			d.setDid(sc.nextInt());
			System.out.println("Enter driver name");
			d.setDname(sc.next());
			System.out.println("Enter driver aadhar");
			d.setAdhar(sc.nextLong());
			System.out.println("Enter salary");
			d.setSalary(sc.nextDouble());
		}
		
		//3rd way
		public void enterCarDetails(Car c) {
			System.out.println("Enter car no");
			c.setCarno(sc.nextInt());
			System.out.println("Enter car brand");
			c.setBrand(sc.next());
			System.out.println("Enter car model");
			c.setModel(sc.next());
			
			c.setDriver(new Driver());
			System.out.println("Enter driver id");
			c.getDriver().setDid(sc.nextInt());
			
		}
		
		

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxiInfo t1 = new TaxiInfo();
//		Car c1 = new Car();
//		t1.enterDetaiels(c1);
//		
//		Car c2 = new Car(2, "HONDA", "City", new Driver(2, "sham", 89873246, 20000));
//		
//		Car c3 =new Car();
//		t1.enterDetaiels(c3);
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
//		Driver d1=new Driver();
		Car c1=new Car();
		
		t1.enterDetaiels(c1);
		System.out.println(c1);
		System.out.println(c1.getDriver().hashCode());
		Car c2=new Car();
		t1.enterDetaiels(c2);
		System.out.println(c2.getDriver().hashCode());

	}

}
