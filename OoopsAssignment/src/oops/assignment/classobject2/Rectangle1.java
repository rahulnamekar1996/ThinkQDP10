package oops.assignment.classobject2;

public class Rectangle1 {
	int l,b;
	public void setResult(int l,int b)
	{
		this.l=l;
		this.b=b;
		
		
	}
	public void showArea(int a,int b) 
	{
		l=a;
		this.b=b;
		double area=l*b;
		System.out.println(area);
		
	}
	public double showarea() 
	{
		double area=l*b;
		return area;
	}
	public double checkArea(int a,int b) 
	{
		l=a;
		this.b=b;
		double area=showarea();
		return area;
	}

}
