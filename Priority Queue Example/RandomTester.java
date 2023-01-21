// Author: Bruno Stevaux 
// Student ID: 144894s
// Email: 144894s@acadiau.ca

import java.util.Random;

public class RandomTester{
    public static void main(String[] args){

        PriorityQueue array = new PriorityQueue();
        
        Random random = new Random();

        System.out.println("\n\n push() \n\n");
        for(int i = 0; i < 100; i++)
        {
            int randPushValue = random.nextInt(100);
            array.push(randPushValue);
        }
        
        System.out.println(array);

        System.out.println("\n\n add() \n\n");
        for(int i = 0; i < 100; i++)
        {
            int randAddValue = random.nextInt(100);
            int randLocationValue = random.nextInt(100);
            array.add(randAddValue, randLocationValue);
        }
        
        System.out.println(array);

        System.out.println("\n\n pop() \n\n");
        for(int i = 0; i < 50; i++)
        {
            array.pop();
        }
        
        System.out.println(array);

        System.out.println("\n\n remove() \n\n");
        for(int i = 0; i < 100; i++)
        {
            int randRemoveValue = random.nextInt(100);
            array.remove(randRemoveValue);
        }
        
        System.out.println(array);

        System.out.println("\n\n pop() [out of bounds] \n\n");
        for(int i = 0; i < 100; i++)
        {
            array.pop();
        }
        System.out.println(array);
        
        System.out.println("\n\n clear() \n\n");
        array.clear();
        System.out.println(array);
    }   
}