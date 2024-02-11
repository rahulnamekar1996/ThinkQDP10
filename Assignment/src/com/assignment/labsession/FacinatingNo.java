package com.assignment.labsession;
import java.util.Scanner;

	public class FacinatingNo {
		public static int countdigit(int num)
		{
			int count=0;
			while(num!=0)
			{
				count++;
				num/=10;
				
			}
			return count;
		}
		public static boolean isfascinating(int num)
		{
			
			int n2 = num*2;
			int n3 =num*3;
			
			String str = num+""+n2+n3;
			System.out.println(str);
			long n = Long.parseLong(str);
			
			int count;
			for(int i=1;i<=9;i++)
			{
				count=countFreq(n, i);
				if(count!=1)
				{
					return false;
				}
			}
			
			return true;
		}
		public static int countFreq(long num, int i)
		{
			int count = 0;
			while(num!=0)
			{
				int rem=(int) (num%10);
				if(rem==i)
				{
					count++;
					
				}
				num/=10;
			}
			return count;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number : ");
			int num = sc.nextInt();
			if(countdigit(num)>=3)
			{
				if(isfascinating(num))
				{
					System.out.println(num+ " is a fascinating number ");
				}
				else 
					System.out.println(num+" is not a fascinating number ");
			}else
			{
				System.out.println(num+" is not a fascinatong number ");
			}
			
			
		}


}
