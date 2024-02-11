package com.arrayassignmentday1;

import java.util.Scanner;

public class PrintPrime {
	public static boolean checkPrime (int num) 
	{ 
		boolean flag=true;
    
		 for(int i=2; i<num; i++){
		      
		        
		       
		            
		            if(num%i==0){
		                flag=false;
		                break;
		            
		        }
		        
		       
		    }
		    return flag;
		
	}
	
	

	public static void main(String[] args) {
		   
		     int[] array = new int [5];
		     Scanner sc = new Scanner (System.in);
		    
		     System.out.println("Enter the elements of the array: ");
		     for(int i=0; i<array.length; i++)
		     {
		        array[i] = sc.nextInt();
		     }
		    
		     
		      int sum =0;
		      for(int i =0;i<array.length;i++) 
		      {
		    	  if(checkPrime (array[i])) {
		    	  sum=sum+array[i];
		    	  }
		      }
		      System.out.println("Sum = "+sum);
	}




}
