// Author: Bruno Stevaux 
// Student ID: 144894s
// Email: 144894s@acadiau.ca

public class PriorityQueue{

private int[] queue;
private int queuePos;   

    // Constructor: Starts an array of size 5, with nothing inside.

    public PriorityQueue()
    {
        queue = new int[5];
        queuePos = 0;
    }

    // Doubling array: creates a new array twice the size of the old one.

    public void doubleSize(int[] array)
    {
        int[] doubledQueue = new int[queue.length * 2];
        for(int i = 0; i < queue.length; i++)
            doubledQueue[i] = queue[i];
        System.out.println("Array doubled! new length is " + queue.length*2); 
        queue = doubledQueue;
    }

    // Push: Adds values to the end of the queue. If the queue is full when
    // attempting to add, double the queue size.

    public void push(int value)
    {
        if(queuePos >= queue.length)
            doubleSize(queue);
        queue[queuePos] = value;
        queuePos++;
    }

    // Pop: Removes the last item in the queue. If the queue is empty, prints
    // an error message

    public void pop()
    {
        if(queuePos > 0)
        {
            queuePos--;
            queue[queuePos] = 0;
        }
        else
        {
            System.out.println("Error: No values in queue to pop.");
        }
    }

    // Add: Adds a value at a certain position in the queue. If trying to 
    // add outside of queue, prints an error message. If adding a value 
    // would overfill the queue, double it then add it.

    public void add(int value, int location)
    {
        if (location < queuePos+1 && location >= 0)
        {
            if(queuePos + 1 > queue.length)
                doubleSize(queue);
            for(int i = queuePos; i > location; i--)
            {
                queue[i] = queue[i-1];
            }
            queue[location] = value;
            queuePos++;
        }
        else
            System.out.println("Error " + location + " is too far bruh." 
            + " the max is " + queuePos + " my short little t-rex array "
            + "like arms cannot reach that far :(");
    }

    // Remove: Removes a value from a specific location. If trying to remove
    // outside of queue or array, prints an error message.
    
    public void remove(int location)
    {
        if(location < queuePos && location >= 0)
        {      
            for(int i = location; i < queuePos; i++)
            {
                queue[i] = queue[i+1];
            }
            queue[queuePos] = 0;
            queuePos--;
        }
        else
        {
            System.out.println("Error: there is nothing stored in queue " +
            "position " + location + " to remove"); 
        }
    }

    // listedArray: Lists all values of the array in order the be printed.

    public String listedArray()
    {
        String stringArray = "";
        for(int i : queue)
        {
            stringArray += (i + " ");
        }     
        return stringArray;
    }

    // listedQueue: Lists all the values in the QUEUE in order to be printed.

    public String listedQueue()
    {
        String stringQueue = "";
        for(int i = 0; i < queuePos; i++)
        {
            stringQueue += queue[i] + " ";
        }
        return stringQueue;
    }

    // Clear: Clears the array and queue.
    public void clear()
    {
        queue = new int[5];
        queuePos = 0;
        System.out.println("Queue cleared.");
    }

    // toString: Prints the array when called.
    public String toString()
    {   
        return "Values of array: " + listedArray() + "\nValues of queue: " 
        + listedQueue();
    }
} 