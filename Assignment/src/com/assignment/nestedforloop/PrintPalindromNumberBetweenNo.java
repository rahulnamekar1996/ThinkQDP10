package com.assignment.nestedforloop;

public class PrintPalindromNumberBetweenNo {
	
	public static int findReverse(int num) {
		int rev=0,rem;
		while(num!=0) {
			rem= num%10;
			rev=rev*10+ rem;
			num/=10;
		}
		return rev;
	}
    public static void printPalindrome(int range)
    {
    	int i;
    	for(i=100;i<=range;i++) 
    	{
    		if(i==findReverse(i))
    		{
    			
    		System.out.println(i+"="+findReverse(i)+" = palindrome");
    		}
    		else 
    		{
    			System.out.println(i+"="+findReverse(i)+" =Not palindrome");
    		}
    
    	
    	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPalindrome(500);
	}


}
