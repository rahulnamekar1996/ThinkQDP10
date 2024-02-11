package oops.assignment.classobject2;

public class Account {
	
	int aac_no;
	String name;
	float balance=10000;
	
	public void setDetails(int acc_no,String name,float balance) 
	{
		this.aac_no=acc_no;
		this.name=name;
		this .balance =balance;
		
	}
	
	public float showDeposit(float amount) 
	{
		balance=balance +amount;
		return balance;
	}
	public void showWithdraw(float amount) 
	{
		balance =balance -amount;
	}
    public void displayaccountInformatin() 
    {
    	System.out.println("Account Number is : "+ aac_no);
    	System.out.println("Account Holder Name :"+name);
    	
    	System.out.println(" Amout : "+balance);
    	
    }
    
	
}
