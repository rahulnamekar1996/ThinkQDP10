package oops.assignment.classobject2;

public class StudentData {
	
	
	int sid=101;
	String sname="Rahul";
	 public void showData()
	 { 
		 sid =102;
		 sname="akash";
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 StudentData s1=new StudentData();
	     System.out.println(s1.sid);
		 System.out.println(s1.sname);
		 s1.showData();
				 
	}

}
