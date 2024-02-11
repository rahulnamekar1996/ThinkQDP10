package com.assingnment.constructor;

public class TestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Palindrome p=new Palindrome(545);
       if(p.checkPalindrome()) 
       {
    	   System.out.println("Number is palindrome");
    	   
       }
       else 
       {
    	   System.out.println("Number is not palindrome");
       }
	}

}
