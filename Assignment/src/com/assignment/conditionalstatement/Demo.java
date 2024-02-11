package
com.assignment.conditionalstatement;
import java.util.Scanner;
public class Demo 
{

	public static void main(String[] args) 
	{
		// find largest number between two numbers
		/*Scanner sc=new Scanner(System.in);
		
		int num1,num2;
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		
		if(num1>num2) 
		{
			System.out.println(num1+"is greater than"+num2);
		}
		else if(num1==num2)
		{
		     System.out.println(num1+" is equal to"+num2);
		}
		else
		{
			System.out.println(num2+"is greater than "+num1);
		}*/
		
		
		
		
		
		// find vowel or consonent given character
		/*Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("enter any character");
        ch= sc.next().charAt(0);
       
        
        switch(ch) 
        {
        case 'a':
        case 'A':
        case 'e':
        case 'E':
        case 'i':
        case 'I':
        case 'o':
        case 'O':
        case 'u':	
        case 'U':	
        	System.out.println(ch+ " charter is vowel");
        	break;
        	default:
        		System.out.println(ch+"character is consonent");
       
        }*/
        
		
		// 4.check character is alphabet,digit or special charater
		
		/*char ch;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter any character");
		 ch= sc.next().charAt(0);
		 
		 if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z'))
		 {
			System.out.println(ch+" characte is alphabet");
		 }
		 else if(ch>='0'&& ch<='9')
		 {
			 System.out.println(ch+"character is digit");
		 }
		 else 
		 {
			 System.out.println(ch+"character is special");
		 }*/
		
		
		// 5.character is upper case or lower case
		
		/*char ch;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any character");
		ch= sc.next().charAt(0);
		if(ch>='a'&& ch<='z') 
		{
			System.out.println(ch+"character is in lower case");
		}
		else if(ch>='A'&& ch<='B') 
		{
			System.out.println(ch+"character is in Upper case");
		}
		else 
		{
			System.out.println(ch+"character is special or digit");
		}*/
		
		
		// input a week number and find that week day
		/*int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number in week from 1-7");
		num= sc.nextInt();
		
		if(num==1) 
		{
		  System.out.println("This is sunday");
		}
		else if(num==2) 
		{
		  System.out.println("This is monday");
		}
		 
		else if(num==3) 
		{
		  System.out.println("This is tuesday");
		}
		 
		else if(num==4) 
		{
		  System.out.println("This is wenesday");
		}
		else if(num==5) 
		{
		  System.out.println("This is thusday");
		}
		else if(num==6) 
		{
		  System.out.println("This is friday");
		}
		else if(num==7) 
		{
		  System.out.println("This is saturday");
		}
		else 
		{
			System .out .println("number is  invalid");
		}*/
		
		
		// find month from the number and thats day

	    /*int month;
	     Scanner sc=new Scanner(System.in);

	    System.out.print("Enter number between 1-12 ");
	    month=sc.nextInt();
	    if(month == 1)
	    {
	        System.out.println("JANUARY 31 days");
	    }
	    else if(month == 2)
	    {
	        System.out.println("FEBRUARY 28 or 29 days");
	    }
	    else if(month == 3)
	    {
	        System.out.println("MARCH 31 days");
	    }
	    else if(month == 4)
	    {
	        System.out.println("APRIL 30 days");
	    }
	    else if(month == 5)
	    {
	        System.out.println("MAY 31 days");
	    }
	    else if(month == 6)
	    {
	        System.out.println("JUNE 30 days");
	    }
	    else if(month == 7)
	    {
	        System.out.println("JULY 31 days");
	    }
	    else if(month == 8)
	    {
	        System.out.println("AUGUST 31 days");
	    }
	    else if(month == 9)
	    {
	       System.out.println("SEPTEMBER 30 days");
	    }
	    else if(month == 10)
	    {
	        System.out.println("OCTOBER 31 days");
	    }
	    else if(month == 11)
	    {
	        System.out.println("NOVEMBER 30 days");
	    }
	    else if(month == 12)
	    {
	        System.out.println("DECEMBER 31 days");
	    }
	    else
	    {
	        System.out.println("Invalid numbr ");
	    }*/
		
		
		// find profit and lost
		/*double sellingPrice, costPrice;
		Scanner sc= new Scanner(System.in);
     	System.out.println("Enter the Cost price ");
     	costPrice=sc.nextDouble();
	    System.out.println("Enter the Selling price:");
     	sellingPrice=sc.nextDouble();

	     if(costPrice-sellingPrice>0)
	     {
	     
	      System.out.println("loss" +(costPrice-sellingPrice));
	     }
	     else if(costPrice-sellingPrice<0)
	     {
	       System.out.println("profit" +(sellingPrice-costPrice));
	     }
	     else 
	     
	     {
	       System.out.println("there is no lost");
      
	     }*/
		
		//11. Enter marks of five subject and find percentage and grade
		
		/* Scanner sc=new Scanner(System .in);
		 double phy,chem,bio,math,comp;
		 float percentage,average,total;
		 char grade;
		 System.out.println("Enter a marks of chemestry");
		 chem= sc.nextDouble();
		 System.out.println("Enter a marks of physics");
		 phy= sc.nextDouble();
		 System.out.println("Enter a marks of biology");
		 bio= sc.nextDouble();
		 System.out.println("Enter a marks of mathmatics");
		 math= sc.nextDouble();
		 System.out.println("Enter a marks of computer");
		 comp= sc.nextDouble();
		 
		 total=(float) (chem+phy+bio+math+comp);
		 percentage= (float)(total/5.0);
		 average=(float)(total/500);
		 
		 
		 
		 if(percentage >= 90)
		 {
			 System.out.println(grade='A');
		 }
		 else if(percentage >= 80 )
		 {
			 System.out.println(grade='B');
		 }
		 else if(percentage>=60)
		 {
			 System.out.println(grade='c');
		 }
		 else if (percentage>=50) 
		 {
			 System.out.println(grade='D');
		 }
		 else if(percentage>=40)
		 {
			 System.out.println(grade='E');
		 }
		 else
		 {
			 System.out.println(grade='F');
		 }
		 
		 System.out.println("Percentage"+"="+percentage);
		 System.out.println("the Grade Is"+
				 "'"+grade+"'");*/
		 
		 // find gross salllary by using basic sallary and respective hra and da 
		
	/*	double basic ,gross, hra,da;
		
		gross =hra +da+basic;
		Scanner sc=new Scanner (System.in);
		 System.out.println("Enter your basic sallry");
		 basic=sc.nextDouble();
		 
		 
		if(basic<=10000) 
		{
			hra=basic*0.2;
			da=basic*0.8;
			gross=basic+hra+da;
			
		}
		else if  (basic<=20000) 
		{
			hra=basic*0.25;
			da=basic*0.9;
			gross=basic+hra+da;
			
		}
		else if (basic>=20000) 
		{
			hra=basic*0.3;
			da=basic*0.95;
			gross=basic+hra+da;
			
		}
		
		 System.out.println("gross");*/
		
		// check wheather tringle is isosceles ,equilatteral or scalline
		
		/*double side1,side2,side3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lenth of three sides of tringle");
		side1= sc.nextDouble();
		side2=sc.nextDouble();
		side3=sc.nextDouble();
		
		
		if(side1==side2&&side2==side3) 
		{
			System .out.println("tringle is equilatteral tringle");
		}
		else if(side1==side2||side2==side3||side1==side3)
		{
			System .out.println("tringle is issoseles tringle");
		}
		else 
		{
			System .out.println("tringle is scalene tringle");
		}*/
		
		// find total electricity bill by using parametres
		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Electricity Unit : ");
		int unit = sc.nextInt();
		float amt,surcharge,totalBill;
		if(unit<=50)
		{			
			amt = unit*0.50f;
		}
		else if(unit<=150)
		{
			amt = unit*0.75f;
		}
		else if(unit<=250)
		{
			amt = unit*1.20f;
		}
		else
		{
			amt = unit*1.50f;
		}
 
		surcharge = amt*0.2f;
		totalBill= amt+surcharge;
		System.out.println("Total Electricity Bill : "+totalBill);*/
		
//-----------------------------------------------------------------------------------------------
		 
		// check whether no is divisible by 5 and 11 or not
		/*int number;
		Scanner sc= new Scanner(System.in);
		System .out.println("Enter a number whether it is divisible by 5 and 11 or not");
		number=sc.nextInt();
		
		if(number%5==0&&number%11==0)
		{
		 System.out.println("the number "+number+"is divisible by 5 and 11");
		}
		else
		{
			 System.out.println("the number "+number+"is not divisible by 5 and 11");
		}*/
		
		
		
		
		// find maximum number betwwen three numbers
		/*int num1, num2, num3;  
		System.out.println("Enter three numbers ");  
		Scanner sc = new Scanner(System.in);  
		num1=sc.nextInt();  
		num2=sc.nextInt();  
		num3=sc.nextInt();  
		if (num1 > num2 && num1 > num3) 
		{	
		System.out.println("The largest number is "+num1); 
		}
		else if (num2 > num1 && num2 > num3) 
		{ 
		System.out.println("The largest number is "+num2);  
		}
		else if (num3 > num1 && num3 > num2)
		{  
		System.out.println("The largest number is "+num3);  
		}
		else 
		{ 
		System.out.println("The numbers are same.");  
		}*/
		
		
		
		//----------------- datatypes and operator logical programm----------------
		
		
		//1. find sum of two numbers
		
		/*int a,b;
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter first value");
		a= sc.nextInt();
		System.out.println("Enter second value");
		b= sc.nextInt();
		
		int c= a+b;
		
		System .out .println("Addition"+"="+c);*/
		
		
		//2. perform all arithmatic operation
		
		/*int a,b;
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter first value");
		a= sc.nextInt();
		System.out.println("Enter second value");
		b= sc.nextInt();
		
		
		System.out.println("Additin"+"="+(a+b));
		System.out.println("Subtraction"+"="+(a-b));
		System.out.println("multiplication"+"="+(a*b));
		System.out.println("Division"+"="+(a/b));
		System.out.println("Modulous"+"="+(a%b));*/
		
		// 3. enter length and bridth find perimetre of rectange
		
		/*int length,bridth;
		int perimetre;
		 Scanner sc= new Scanner(System.in);
		  System.out.println("Enter a length of rectangle");
		  length=sc.nextInt();
		  System.out.println("Enter a brdth of rectangle");
		  bridth=sc.nextInt();
		  perimetre= 2*(length+bridth);
		  
		  System.out.println("Perimetre of rectangle"+"="+perimetre);*/
		
		
		//4. enter length and bridth find area of rectange
		  
		/*float length,bridth;
		 double area;
		 Scanner sc= new Scanner(System.in);
		  System.out.println("Enter a length of rectangle");
		  length=sc.nextInt();
		  System.out.println("Enter a brdth of rectangle");
		  bridth=sc.nextInt();
		 area = (length*bridth);
		 
		  System.out.println("Area of rectangle"+"="+area);*/
		
		// 5. enter redius of circle and find its diametre ,circumferance and area 
		
		/*float r,d,circumferance,area;
		double  pi=3.14;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		r=sc.nextInt();
		
		d=2*r;
		circumferance= (float)(2*pi*r);
		area= (float)(pi*r*r);
		
		System.out.println("Circumferance of circle"+circumferance);
		System.out.println("Area  of circle"+area );*/
		
		
		// 6. enter length in centimetre and convert into metre and kilometre
		
		/*float legth ,metre ,killometre;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a length in centimtre which converted in metre and killometre");
		legth=sc.nextLong();
		
		metre=legth/100;
		killometre=(legth/10000);
		
		System.out.println(legth+"centimetre"+"="+metre+"metre");
		System.out.println(legth+"centimetre"+"="+killometre+"killometre");*/
		
		
		//7. write a java program to enter temp in celcius and convert int ferhenite
		
		
		/*float celcius ,ferhnite;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter temp in celcius which convert int ferhnite");
		celcius=sc.nextFloat();
		
		ferhnite= ((celcius*9.0f/5.0f)+32);
		
		System.out.println(celcius+" celcius is equl to ="+ferhnite+"ferhnite");*/
		
		
		//8. convert ferhnite to celcius
		/*double celcius ,ferhnite;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter temp in fehrnite which convert int celcius");
		ferhnite=sc.nextDouble();
		
		celcius=(ferhnite-32)*(0.5556);
		
		System.out.println(celcius+" ferhnite is equl to ="+celcius+"celcius");*/
		
		//9.enter no of days find no year ,weak, days 
		
		/*int d ,year ,week,days;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no of days");
		d=sc.nextInt();
		
		week=d/7;
		year=d/365;
		days= d-((year*365)+(week));
		
		System.out.println("week"+week);
		System.out.println("year"+year);
		System.out.println("days"+days);*/
		
		//10. enter two angles of tringle find third angle of tringle 
		
      	/*  float angle1,angle2,angle3;
	        Scanner sc=new Scanner (System.in);
	       System.out.println("enter first and second angle");
	       angle1=sc.nextFloat();
	       angle2=sc.nextFloat();
	   
	       angle3= 180-(angle1+angle2);
	        System.out.println("third angle will be"+angle3);*/
		
		
		//11. find area of tringle on the basis of given height and base
		/*Scanner sc = new Scanner(System.in);
         float b,h,a;
        System.out.println("Enter the base & height of the triangle::\n");

        b = sc.nextFloat();
         h = sc.nextFloat();
         

        
       
        a = (float)((b * h) / 2);

		
		System.out.println("araea of tringle is"+a);*/
		
		//12.find area of equillateral tringle
		/*float s,a;
		Scanner sc= new Scanner(System.in);

        System.out.println("Enter the side of an equilateral triangle::\n");

        s = sc.nextFloat();
         a = (float)((Math.sqrt(3) / 4) * (s * s));
      System.out.println("Area of the equilateral triangle = " + a );*/
		
		
		
		// 13. find simple interest by input values of p,t,r.
		
		
		/* float p, r, t,simpleInterest;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the Principal amount ");
	        p = s.nextFloat();
	        System.out.print("Enter the Rate of interest amount ");
	        r = s.nextFloat();
	        System.out.print("Enter the Time period  ");
	        t = s.nextFloat();
	        
	        simpleInterest = (float)(r * t * p) / 100;
	        System.out.print("The Simple Interest is : " + simpleInterest);*/
		
		 
	 
		//14.find compound interest using input p,t,r.
		/* float principle,rate,time,number;
	    Scanner input = new Scanner(System.in);

	   
	    System.out.print("Enter the principal ");
	     principle = input.nextFloat();

	    System.out.print("Enter the rate ");
	    rate = input.nextFloat();

	    System.out.print("Enter the time ");
	    
	    time = input.nextFloat();

	    System.out.print("Enter number of times interest is compounded ");
	    number = input.nextFloat() ;
	    float  interest =(float) (principle * (Math.pow((1 + rate/100), (time * number))) - principle);
        System.out.println("Compound Interest " + interest);*/

	
		
		// count notes 
		
		/*int amt,r500=0,r100=0,r50=0,r20=0,r10=0,r5=0,count=0;
		System.out.println("Enter amount in rupees:");
		Scanner sc=new Scanner(System.in);
		amt=sc.nextInt();
		if (amt>=500) 
		{
			r500=amt/500;*/
		
		
		
		/* Scanner sc =new Scanner (System.in);
		 int choice;
		 
		 System.out .println("welcome to nescafe");
		 System.out.println("1.tea\n2.coffee\n3.sandwich");
		 System.out.println("Enter your choice");
		 choice=sc.nextInt();
		 
		 switch(choice) 
		 {
		 case 1: 
			 System .out.println(" Tea fo rs 30");
			 break;
		 case 2:
			 System.out.println("Coffee for rs 50");
			 break;
			 
			 
		 case 3:
		 System.out.println("Sandweech for rs 100");
		     break;
		 default:
			 System.out.println("invalid option choice");*/
		
		/* Scanner sc =new Scanner (System.in);
		 char
		 choice;
		 
		 System.out .println("welcome to nescafe");
		 System.out.println("A.tea\nB.coffee\nC.sandwich");
		 System.out.println("Enter your choice");
		 choice=sc.next().charAt(0);
		 
		 switch(choice) 
		 {
		 case 'A' : 
		 case 'a':
			 System .out.println(" Tea fo rs 30");
			 break;
		 case 'B':
		 case 'b':
			 System.out.println("Coffee for rs 50");
			 break;*/
		
		/*Scanner sc =new Scanner (System.in);
		 int
		 choice;
		 
		 System.out .println("welcome to fashion world");
		 System.out.println("1.Men\n2.Woman\n3.Kids");
		 System.out.println("Enter your choice");
		 choice=sc.nextInt();
		 
		 switch(choice) 
		 {
		 case 1 : 
		 
			 System .out.println(" Wellcome to mens fashion world");
			 
			 System.out.println("1.jeans\n2.Tshirt\n3.wallet");
			 System.out.println("Select your choice");
			 choice=sc.nextInt();
			 switch(choice) 
			 {
			 case 1:
				 System.out.println("you choice to jeans");
				 break;
			 case 2:
				 System.out.println("you choice to purchase Tshirt");
			 case 3:
				 System.out.println("you purchase a wallet");
				 default:
					 System .out.println("invalid choice option");
					 
				 
			 
			 }
			 break;
		 case 2:
		 
			 System.out.println("welcome to ladies costumes departmentan curtllery");
			 
			 System.out.println("1.saree\2.ha\3.sandal");
			 System.out.println("Enter your choice");
			 choice=sc.nextInt();
			 switch(choice) 
			 { case 1:
				 System.out.println("you choice to saree");
				 break;
			 case 2:
				 System.out.println("you choice to purchaseha");
			 case 3:
				 System.out.println("you purchase a sanadal");
				 default:
					 System .out.println("invalid choice option");
					 
			 
			 }
			 break;
			 
			 
		 case 3:
		
		 System.out.println("welcome to kids wear ");
		 System.out.println("1.shirt\2.three piece\3.hat");
		 System.out.println("Enter your choice");
		 choice=sc.nextInt();
		 switch(choice) 
		 {case 1:
			 System.out.println("you choice to shirt");
			 break;
		 case 2:
			 System.out.println("you choice to threepiece");
		 case 3:
			 System.out.println("you purchase a hat");
			 default:
				 System .out.println("invalid choice option");
				 
		 }
		 
		 
		     
		 break;
		 default:
			 System.out.println("invalid option choice");
		 
		 }*/
		 
		
		 
		 
		 
		 
		 
		 
		
	 }
		
		
	  
	}
	