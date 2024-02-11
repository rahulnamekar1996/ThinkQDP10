package com.assignment.labsession;

public class PrintAlternativeNumber
{
	 public static int checkPrime(int num) 
	 {
		 int i,flag=0;
		 
		 for(i=2;i<=num/2;i++)
		 {
			 if(num%i==0) 
			 {
				 flag=1;
				 break;
			 }
		 }
		 
		 if(flag==0)
			 
			 return 1;
		 else
			 return 0;
		 
		 		
	     
	 }
	    public static void printAlternative(int n)
	    {
	    	
	    	int i,temp=2 ;
	    	
	    	for(i=2; i<=n; i++)
	    	{
	    		if(checkPrime(i)==1) 
	    		{
	    			if(temp%2==0) 
	    			{
	    				System.out.println(i+" ");
	    				
	    			}
	    			temp++;	
	    		}
	    		
	    	}
	    }
	

	public static void main(String[] args) {
	
           int num=17
        		   ;
           
           printAlternative(num);
           
	}

}
