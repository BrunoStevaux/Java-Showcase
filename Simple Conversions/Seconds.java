//********************************************************************
//  Seconds.java       Author: Bruno Stevaux
//
//  Takes in seconds and will output in Hours, Minutes and Seconds
//********************************************************************

import java.util.Scanner;

public class Seconds
{
    //-----------------------------------------------------------------
    //  Calculates Hours Minutes and Seconds from given Seconds
    //  
    //-----------------------------------------------------------------
    
  public static void main(String[] args)
    {
      final int SECONDS_IN_HOURS = (3600); // Number of seconds in an hour
      final int SECONDS_IN_MINUTES = 60; // Number of seconds in a minute
      final int SECONDS = 1; // Number of seconds in a second
      
      int time, seconds, minutes, hours; // Stating our variables
       
      Scanner scan = new Scanner(System.in); //Setting up a scanner to be used
      System.out.print("Enter the number of seconds: "); //Promting user
      time = scan.nextInt(); //Requesting information from user
      
      // Dividing time by 3600s to get hours. Everything after decimal
      // is discarted
      
      hours = time/SECONDS_IN_HOURS; //Hours becomes what is before the decimal
      time = time%SECONDS_IN_HOURS;  //Time becomes what doesn't fit in hours
                                    
      
      minutes = time/SECONDS_IN_MINUTES;
      time = time%SECONDS_IN_MINUTES;
      
      seconds = time;

      
      //Printing out the Hour(s), Minute(s) and Second(s) out to the user
      System.out.println("");
      System.out.println("Hours: " + hours);
      System.out.println("Minutes: " + minutes);
      System.out.println("Seconds: " + seconds);
      
      scan.close();
    }
}
