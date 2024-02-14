package com.assignment.stringlogical2;

public class RemoveDuplicateWord {
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
				if(s[i]!=null && s[i].equalsIgnoreCase(s[j])) 
				{
					flag=true;
					break;
				}
				
			}
			if(flag==false)
			{
				for(int k=i+1;k<s.length;k++) 
				{
					if(s[i]!=null && s[i].equalsIgnoreCase(s[k]))
					{
						count++;
						s[k]=null;
					}
				}
				
			
		
			if(s[i]!=null) 
			{
				System.out.print(s[i]+" ");
			}
			
			}
			
		}
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String str="Java is fun and java is iteresting";
		System.out.println(str);
		findDuplicateAndUnique(str);

		
	}

}
