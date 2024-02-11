package com.demo.basicofarray;

public class SearchElement {
	
	public static boolean searchElement(int ar[],int ele)
	{
		for (int i=0;i<ar.length;i++) 
		{
			if(ar[i]==ele) 
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {12,13,14,15,16,17,};
	    if(searchElement(arr,10)) 
	    {
	    	System.out.println("element is present in the array");
	    }
	    else 
	    {
	    	System.out.println("Element is not presnt in the array");
	    }

	}

}
