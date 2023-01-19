//********************************************************************
//  MoneycConversion.java       Author: Bruno Stevaux
//
//  Takes in an ammount of money, and will return the value in 
//  Cash value ($10 bills, $5 bills, Toonies, Loonies, Quarters
//  Dimes and Nickles)
//********************************************************************

import java.util.Scanner; //importing scan so we can input information

public class MoneyConversion
{
    //-----------------------------------------------------------------
    //  Gives cash value amount in bills/ coins 
    //  from taking in dollar amount 
    //-----------------------------------------------------------------
  public static void main(String[] args)
    {
      // Declaring static values for bills and coins, but *100 so they can be
      // stored as integers without losing values after decimals
      final int TEN = 1000;
      final int FIVE = 500;
      final int TOONIE = 200;
      final int LOONIE = 100;
      final int QUARTER = 25;
      final int DIME = 10;
      final int NICKLE = 5;

      // Declaring our money values
      int ten, five, toonie, loonie, quarter, dime, nickle, pennies;
      // Declaring our input value of $ in doubles so we can capture decimals.
      double money;
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter monetary amount:");
      
      // Getting dollar amount from user, and converting into ints so we can
      // do remainder calculations without decimals.
      
      money = scan.nextDouble();
      money = money*LOONIE; //allows us to keep decimals, as whole ints.
      pennies = (int)money;
      
      ten = pennies / TEN;     //Getting amount of possible $10 bills
      pennies = pennies % TEN; //Making remainder what cannot fit in $10 bills.
      five = pennies / FIVE;
      pennies = pennies % FIVE;
      toonie = pennies / TOONIE;
      pennies = pennies % TOONIE;
      loonie = pennies / LOONIE;
      pennies = pennies % LOONIE;
      quarter = pennies / QUARTER;
      pennies = pennies % QUARTER;
      dime = pennies / DIME;
      pennies = pennies % DIME;
      nickle = pennies / NICKLE;
      
      
      
      // Printing off the conversion of numerical dollar value into
      // Bill / coin values.
      
      System.out.println("That is equivalent to:");
      System.out.println(ten + " ten dollar bills");
      System.out.println(five + " five dollar bills");
      System.out.println(toonie + " toonies");
      System.out.println(loonie + " loonies");
      System.out.println(quarter + " quarters");
      System.out.println(dime + " dimes");
      System.out.println(nickle + " nickles");
      
      scan.close();

    }
}
