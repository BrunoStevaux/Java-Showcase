//********************************************************************
//  PalindromeTester.java       Author: Bruno Stevaux       100144894
//
//  Demonstrates the use of Scanner to read file input and parse it
//  using alternative delimiters.
//********************************************************************

import java.util.Scanner;
import java.io.*;

public class PalindromeTester
{
  //*****************************************************************
  // We will create one big long string containing every letter and
  // number from each file (so the new string will NOT contain spec - 
  // ial characters such as: !, @, #, etc... 
  //*****************************************************************
  
  public static void main(String[] args) throws IOException
  {
    Scanner fileScan;
    String str, fileName, another = "y";
    int left, right;
    
    // Creating our scanner
    Scanner scan = new Scanner(System.in);

    // Checking if user wants to continue 
    while (another.equalsIgnoreCase("y")) // allows y or Y
    {
      System.out.println("Enter the name of a file"); // Asking for file
      fileName = scan.nextLine();                     // Getting file 
      fileScan = new Scanner(new File(fileName));     // Opening file 
      str = fileScan.nextLine();                      // First line of file
      String contents = "";                           // Blank string
      
      // From the beginning to the end of the first line 
      for(int i = 0; i < str.length(); i++)
      {
        char x = str.charAt(i);
        if(Character.isDigit(x) || Character.isLetter(x)) // Add only letters
                                                          // or numbers
          contents += Character.toUpperCase(x);           // Add it to Contents
      }
      
      // For all lines after first line
      while(fileScan.hasNextLine())
      {
        // Line is equal to the entire line 
        String line = fileScan.nextLine();
        for(int i = 0; i < line.length(); i++)
        {
          char x = line.charAt(i);
          if(Character.isDigit(x) || Character.isLetter(x))
            contents += Character.toUpperCase(x);
        }
        
      }
      
      // Left is start of string, right is end of string
      left = 0;
      right = contents.length() - 1;

      //As long as the right and left match, continue and go inside one.
      while (contents.charAt(left) == contents.charAt(right) && left < right)
      {
        left++;
        right--;
      }
      System.out.println();
      
      // If the strings do not mirror, AKA palindrome, it is not one.
      if (left < right)
        System.out.println("That file does NOT contain a palindrome.");
      // Otherwise they are
      else
        System.out.println("That file CONTAINS a palindrome.");
      
      System.out.println();
      // Asking if user wants to try another.
      System.out.print("Test another palindrome (y/n)? ");
      another = scan.nextLine();
    }
    
  }
}
