package oops.assignment.classobject;

class CalPercentage
{
	int sub1;
	int sub2;
	int sub3;
	int sub4;
	int sub5;
	
	public void setMarks(int sub1 ,int sub2, int sub3,int sub4,int sub5)
	{
		this.sub1=sub1;
		this.sub2=sub2; 
		this.sub3=sub3;
		this.sub4=sub4;
		this.sub5=sub5;
		
	}
	public  double showTotal() 
	{
		double total =(double)(sub1+sub2+sub3+sub4+sub5);
		return total;
	}
	public double findPercentage() 
	{
		double per = (showTotal()*100)/500;
		return per;
	}
	public void showClass()
	{
		double per =findPercentage();
		if(per>=80)
		{
			System.out.println("Grade = "+"First class");
		}
		else if(per>=60 && per <80) 
		
		{
			System.out.println("Grade = "+"Second class ");
		}
		else if(per >=40 &&per <60)
		{
			System.out.println("Grade = "+" Third claas");
			
		}
		else 
		{
			System.out.println("Grade = "+ " Fail");
		}
	}
	
}

public class Percentage {
	
	

	public static void main(String[] args) {
		CalPercentage c= new CalPercentage();
		c.setMarks(60, 60, 60, 60, 60);
		System.out.println("Percentage is = "+c.findPercentage());
		c.showClass();

	}

}
