package com.demo.enum1;
enum Season{SUMMER,WINTER,MONSOON};

public class EnumDemo2 {
public static void main(String[] args) {
		
		Season s= Season.SUMMER;
		
		switch(s)
		{
		case SUMMER: System.out.println("Cotton clothes");
		              break; 
		case WINTER: System.out.println("Woollen clothes");
                      break;
		case MONSOON: System.out.println("Umbrella and Raincoat");
                       break;
        default: System.out.println("error");
		}
		
	}

}
