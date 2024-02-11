package com.assignment.switchstatement;
import java.util.Scanner;
public class AlgebraCalculation {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
          int option;
          System.out.println("Enter number which algebric operation you required");
          System.out.println("1.Area of a Circle\n2.Area of square\n3.Area of right angle tringle\n4.Area of rectangle\n5.Circumferance of circle\n6.Perimetre of square");

          System.out.println("Enter your option:");
          option=s.nextInt();

          switch(option)
          {
                case 1: System.out.println("Enter radius:");
                            float r=s.nextFloat();
                            float ac=3.14f*r*r;
                           System.out.println("Area:"+ac);
                           break;

               case 2: System.out.println("Enter side:");
                            int x=s.nextInt();
                            int as=x*x;
                           System.out.println("Area:"+as);
                           break;

               case 3: System.out.println("Enter height and base:");
                            float h=s.nextFloat();
                            float bs=s.nextFloat();
                            float art=0.5f*h*bs;
                           System.out.println("Area:"+art);
                           break;

              case 4: System.out.println("Enter length and breadth:");
                            int l=s.nextInt();
                            int b=s.nextInt();
                            int ar=l*b;
                           System.out.println("Area:"+ar);
                           break;

             case 5: System.out.println("Enter radius");
                            float R=s.nextFloat();
                            float C=3.14f*2f*R;
                           System.out.println("Circumference:"+C);
                           break;


              case 6: System.out.println("Enter side");
                            int X=s.nextInt();
                            int p=4*X;
                           System.out.println("Perimeter:"+p);
                           break;

               default:
            	   System.out.println("Invalid option");
              }

	}

}
