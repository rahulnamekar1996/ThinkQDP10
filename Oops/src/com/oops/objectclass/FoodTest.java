package com.oops.objectclass;

public class FoodTest {

	public static void main(String[] args) {
	
		Food f1=new Food();
		Food f2=new Food();
		Food f3=new Food();
		
		f1.setDetaials(1, "Ragda", 35);
		f2.setDetaials(2, "pavbhaji", 102);
		f3.setDetaials(3, "khaman", 45);
		
		f1.showDetails();
		f2.showDetails();
		f3.showDetails();
	}

}
