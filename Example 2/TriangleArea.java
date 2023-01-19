//********************************************************************
//  TriangleArea.java       Author: Bruno Stevaux
//
//  Will calculate the area of a trangle from 3 given sides
//********************************************************************

import java.util.Scanner;

public class TriangleArea
{
  
  //********************************************************************
  // Will use Heron's formula for finding the area of a triangle from
  // three given sides by adding all sides together, dividing them by two
  // to give 's' then square rooting (s(s-a)(s-b)(s-c)) where a b and c
  // are sides inputed by the user
  //********************************************************************
  
  public static void main(String[] args)
  {
    //*********************************************
    // We have 3 sides, so we use Heron's formula.
    // s = (a+b+c)/2
    // Area = sqrt(s(s-a)(s-b)(s-c))
    //*********************************************
    
    double a, b, c, s, area;
    
    Scanner scan = new Scanner(System.in); // Setting up the Scanner 
    System.out.print("Enter the length of side 1:"); // Getting side a
    a = scan.nextDouble();
    System.out.print("Enter the length of side 2:"); // Getting side b
    b = scan.nextDouble();
    System.out.print("Enter the length of side 3:"); // Getting side c
    c = scan.nextDouble();
    
    s = (a+b+c)/2; //First formula
    area = Math.sqrt(s*(s-a)*(s-b)*(s-c)); //Second formula
    
    
    System.out.println("Area: " + area);
    
    scan.close();
  }
}