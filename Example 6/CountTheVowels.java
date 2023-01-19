//********************************************************************
// CountTheVowels.java    Author: Bruno Stevaux              100144894
//
// This program will take in a string, and then count the amount of
// vowels ( a, e, i, o, u ) in it. Then it will print out the amount 
// of each vowel found in the string.
//********************************************************************


import java.util.Scanner;

public class CountTheVowels 
{
    //***************************************************************
    // We will first scan for a string input, and then look at each
    // value from 0 all the way to the length of the string. For each 
    // of the characters we will compare them to their 'char' value
    // to determine if they are a vowel or not.
    //***************************************************************
    
    public static void main(String[] args)
    {
        // Starting our counters for each of the vowels. 
        
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        
        // Setting up scanner 
        Scanner scan = new Scanner(System.in);
        
        // Asking for and getting input string
        System.out.println("Enter a string: ");
        String input = scan.nextLine();
        
        // Making all the characters in our string lowercase.
        input = input.toLowerCase();
        
        for(int x = 0; x<input.length(); x++)
        {
            // For each iteration, check the char value in the string
            // at the indicated index and compare it to the char value
            // of 'a' 'e' 'i' 'o' 'u'. If it matches, then add one to
            // the corresponding counter.
            
            if (input.charAt(x) == 'a')
                a++;
            if (input.charAt(x) == 'e')
                e++;
            if (input.charAt(x) == 'i')
                i++;
            if (input.charAt(x) == 'o')
                o++;
            if (input.charAt(x) == 'u')
                u++;
        }
        
        // Printing the results.
        // Note: \n will print them to the console in a new line, as 
        // opposed to adding it on to the end of the sentence.
        System.out.println("Vowel counts:" + "\na: " + a + "\ne: " + e 
                               + "\ni: " + i + "\no: " + o + "\nu: " + u);
        
        // Closing the scanner.
        scan.close();
    }
}