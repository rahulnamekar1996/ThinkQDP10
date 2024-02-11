package com.assingnment.for_whileloop;

public class PrimeNumberBe_400_300 {

	public static void main(String[] args) 
	{
		int i,j,num=400,count=0;
	    
		
		for(i=300; i<=num; i++)
		{
			for(j=2;j<=i;j++) 
			{
			if(i%j==0 )
			{
			
				break;
				
			}
			}
			
			if(i==j)
			{
				System.out.println(j+" ");
			}
			
		}
		
		

	}

}
