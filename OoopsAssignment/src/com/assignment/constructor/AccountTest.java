package com.assignment.constructor;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Account a1=new Account ();
        a1.acc_no=123456;
        a1.custName="Rahul";
        System.out.println(" Account no = "+ a1.acc_no );
        System.out.println(" Account no = "+ a1.custName );
         
        Account a2 =new Account(1234566 ,"akash");
        System.out.println(a2.acc_no);
        System.out.println(a2.custName);
        
        Account a3= new Account (1445647,"amol");
        Account a4=new Account(7896451,"ajay");	
        System.out.println(a3.acc_no);
        System.out.println(a3.custName);
        System.out.println(a4.acc_no);
        System.out.println(a4.custName);
        new Account();
        
        
	}

}
