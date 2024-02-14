package com.assignment.stringlogical2;

public class FindDuplicatesAndUnique {
	
	public static void findDuplicateAndUnique(String st) 
	{
		
		String s[]= st.split("\\s");
		int count ;
		boolean flag =false;
		for(int i=0;i<s.length;i++) 
		{
			count=1;
			flag=false;
			for(int j=i-1;j>=0;j--) 
			{
				if(s[i].equalsIgnoreCase(s[j])) 
				{
					flag=true;
					break;
				}
				
			}
			if(flag==false)
			{
				for(int k=i+1;k<s.length;k++) 
				{
					if(s[i].equalsIgnoreCase(s[k]))
					{
						count++;
					}
				}
				
			
			if(count>1) 
		{
			System.out.println("Duplicate word is ="+s[i]);
		}
			if(count==1) 
			{
				System.out.println("Unique word = "+s[i]);
			}
			
			}
			
		}
		
	
	}
		
	

	public static void main(String[] args) {
       
		String str="Java is fun and java is iteresting";
		System.out.println(str);
		findDuplicateAndUnique(str);

		
		
	}

	
}
