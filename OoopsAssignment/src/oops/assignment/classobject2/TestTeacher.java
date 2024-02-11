package oops.assignment.classobject2;

public class TestTeacher {

	public static void main(String[] args) {
		Teacher t1= new Teacher();
		t1.tid=1;
		t1.tname="Sachin ghotoskar";
		t1.tsal= 25000;
		
		System.out.println("Sallry ="+ t1.tsal);
		System.out.println("teacher name ="+ t1.tname);
		System.out.println(" Id is ="+ t1.tid);
	}
	

}
