// Author: Bruno Stevaux 
// Student ID: 144894s
// Email: 144894s@acadiau.ca

public class PriorityQueueTester{
    public static void main(String[] args){

        PriorityQueue array = new PriorityQueue();

        System.out.println("\n - - - Edge case pop(): - - - ");

        System.out.println(array);
        array.push(1);
        array.push(2);
        array.push(3);
        array.push(4);
        array.push(5);
        System.out.println(array);
        array.push(9); // Overflow!
        System.out.println(array);

        System.out.println("\n - - - Edge case pop(): - - - ");
        array.pop();
        array.pop();
        array.pop();
        array.pop();
        array.pop();
        array.pop();
        System.out.println(array);
        array.pop();

        array.clear();

        System.out.println("\n - - - Edge case add(): - - - ");
        array.add(5,0);
        array.add(4,0);
        array.add(3,0);
        array.add(2,0);
        array.add(1,0);
        System.out.println(array);
        array.add(99,0); // Overflow!
        System.out.println(array);
        array.add(99,8); // Inside array, out of queue;
        array.add(99,17); // Outside array, out of queue;
        array.add(99,-22); // Outside array, out of queue;
        System.out.println(array);

        System.out.println("\n - - - Edge case remove(): - - - ");
        array.remove(2);
        array.remove(2);
        array.remove(2);
        array.remove(2);
        array.remove(2); // Nothing to remove!
        System.out.println(array);
        array.remove(-1); // Outside of queue
        array.remove(99); // Outside of queue
        System.out.println(array);
        array.remove(0);
        array.remove(0);
        array.remove(0);
        System.out.println(array);
        
    }   
}