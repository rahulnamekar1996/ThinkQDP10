package com.assignment.Stringlogical;

public class HieghestFrequancy {

	
	static void q8(String s)
	{
		//8.Write a Java program to find highest frequency character in a string.
		int count;
		int i;
		char maxchar='\u0000';
		boolean flag;

		for (i = 0; i < s.length(); i++)
		{

			count = 1;
			flag = false;
			if (s.charAt(i) != ' ') 
			{
				for (int k = i - 1; k >= 0; k--) 
				{
					if (s.charAt(i) == s.charAt(k)) 
					{
						flag = true;
					}
				}
				if (flag == false) 
				{
					for (int j = i + 1; j < s.length(); j++) 
					{
						if (s.charAt(i) == s.charAt(j))
							count++;

					}
				}
				if(count>maxchar) {
					maxchar=s.charAt(i);
				}
			}					
			System.out.println(maxchar+": "+count);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Stringsz are Immutable  ";
		q8(str);

	}

}
