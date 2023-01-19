//********************************************************************
//  Assignment.java       Author: Trudel
//
//  Demonstrates the various assignment statements.
//********************************************************************

public class Assignment
{
  //-----------------------------------------------------------------
  //  Show how an operator can be combined with the equal sign.
  //-----------------------------------------------------------------
  public static void main(String[] args)
  {
    int x, y;
    
    // 2 ways to add y to x.
    x=1;
    y=2;
    x = x + y;
    System.out.println(x);
    x=1;
    y=2;
    x += y;
    System.out.println(x);
    System.out.println();
    
    // Simlarly for the other operators. For example, multiplication.
    x=1;
    y=2;
    x = x * y;
    System.out.println(x);
    x=1;
    y=2;
    x *= y;
    System.out.println(x);
    System.out.println();
    
    // Can also have a complicated expression on the RHS.
    x=1;
    y=2;
    x = x + ((2 * y) + 10);
    System.out.println(x);
    x=1;
    y=2;
    x += (2 * y) + 10;
    System.out.println(x);
    System.out.println();
    
    // Must be careful.
    x=2;  // Different initialization.
    y=2;
    x *= 2 * y + 10;  // Equation 1
    System.out.println(x);
    x=2;
    y=2;
    x = x * ((2 * y) + 10);  // Same as Equation 1.
    System.out.println(x);
    System.out.println();
    x=2;
    y=2;
    x = x * 2 * y + 10;  // Not equivalent to Equation 1.
    System.out.println(x);
  }
}

