package com.assignment.switchstatement;
import java.util.Scanner;
public class VowelorConsonant 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char ch ;
		System.out.println("Enter a character");
		ch= sc.next().charAt(0);
        switch (ch)
        {
            case 'a':
            case'A':
            case'E':
            case 'e':
            case'I':
            case 'i':
            case'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println(ch +" " +" is vowel");
                break;
            default:
                System.out.println(ch +" "+" is consonent");
        }

	}

}
