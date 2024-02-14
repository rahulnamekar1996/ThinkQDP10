package com.assignment.Stringlogical;

public class CountOccuranceOfAllChar {
	
	static void q3(String s)
	{
		// 3.Write a Java program to count occurrences of all character in given string.
		int count;
		int i;
		boolean flag;

		for (i = 0; i < s.length(); i++)
		{

			count = 1;
			flag = false;
			if (s.charAt(i) != ' ') 
			{
				for (int k= i - 1; k >= 0; k--)
				{
					if (s.charAt(i) == s.charAt(k))
					{
						flag = true;
					}
				}
				if (flag == false) {
					for (int j = i + 1; j < s.length(); j++)
					{
						if (s.charAt(i) == s.charAt(j))
							count++;

					}
					System.out.println(s.charAt(i) + " *Count Of Occurance is= " + count);
				}

			}
		}

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Stringsz are Immutable  ";
		q3(str);

	}

}
