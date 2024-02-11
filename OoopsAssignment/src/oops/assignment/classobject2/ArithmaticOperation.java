package oops.assignment.classobject2;

public class ArithmaticOperation {
	int a,b;
	
	public void setValues(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int showaddition()
	{
		int add= a+b;
		return add;
	}
	public int showSubtraction()
	{
		int sub= a-b;
		return sub;
	}
	public int showMul()
	{
		int mul= a*b;
		return mul;
	}
	public int showdiv()
	{
		int div= a/b;
		return div;
	}
	public void showaddition1()
	{
		int add= a+b;
		System.out.println(" addition =" +add);
	}
	public void showSubtraction1()
	{
		int sub= a-b;
	System.out.println("Subtraction = "+ sub) ;
	}
	public void showMul1()
	{
		int mul= a*b;
		System.out.println("Multiplication = "+ mul);
	}
	public void showdiv1()
	{
		int div= a/b;
		System.out.println("Division ="+div);
	}
	public void showaddition2(int a,int b)
	{
		this.a=a;
		this.b=b;
		int add= a+b;
		System.out.println(" addition =" +add);
	}
	public void showSubtraction2(int a,int b)
	{
		this.a=a;
		this.b=b;
				
		int sub= a-b;
	System.out.println("Subtraction = "+ sub) ;
	}
	public void showMul2(int a,int b )
	{
		this.a=a;
		this.b=b;
		int mul= a*b;
		System.out.println("Multiplication = "+ mul);
	}
	public void showdiv2(int a ,int b)
	{
		this.a=a;
		this.b=b;
		int div= a/b;
		System.out.println("Division ="+div);
	}
	public void showResult() 
	{
		System.out.println("Addition ="+showaddition());
		System.out.println("Subtraction ="+showSubtraction());
		System.out.println("Multiplication="+showMul());
		System.out.println("Division ="+showdiv());
	}
	

}
