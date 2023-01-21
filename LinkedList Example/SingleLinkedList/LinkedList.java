public class LinkedList
{
    Node head;
    Node tail; 
    int size;

    // Creating our linkedList
    
    public LinkedList(int data)
    {
        Node newNode = new Node(data);
        this.head = newNode;
        this.tail = newNode;
        this.size = 1;
    }

    // Inserting at head middle and tail
    
    public void insert(int location, int data)
    {
        Node node = new Node(data);

        int position = 0;

        if(location == 0)
            position = 1;
        if(location == size)
            position = 3;
        if(position == 0)
            position = 2;

        switch(position)
        {
            // Adding at the head
            case 1:
                node.next = head;
                head = node;
                this.size++; 
                break;

            // Adding at the middle
            case 2:
                if(location > size || location < 0)
                {
                    System.out.println(location + ", I can't insert there.");
                    break;
                }
                Node traverse = head;
                for(int i = 0; i < location-1; i++)
                    traverse = traverse.next;
                node.next = traverse.next;
                traverse.next = node;
                this.size++;
                break;

            // Adding at the tail 
            case 3:
                this.tail.next = node;
                this.tail = node;
                this.size++;
                break;
        }
    }

    public void delete(int location)
    {
        Node node = head;

        int position = 0;

        if(location == 0)
            position = 1;
        if(location == size-1)
            position = 3;
        if(position == 0)
            position = 2;
        

        switch(position)
        {
            // Deleting head
            case 1:
                this.head = node.next;
                this.size--;
                break;

            // Deleting middle
            case 2:

                if(location > size || location < 0)
                {
                    System.out.println(location + ", I can't delete there.");
                    break;
                }
                for(int i = 0; i < location - 1; i ++)
                    node = node.next;
                node.next = node.next.next;
                this.size--;
                break;

            // Deleting tail
            case 3:
                Node last = head;
                Node lLast = null;

                while(last.next != null)
                {
                    lLast = last;
                    last = last.next;
                }

                lLast.next = null;

                this.tail = last;
                this.size--;
        }
    }

    public void traverse(int start)
    {
        if(start < size && start > 0)
        {
            System.out.println("\nTraversing . . . \nSize: "+ size);

            Node current = this.head;
            int pos = 0;

            for(int i = 0; i < start; i++)
            {
                current = current.next;
                pos++;
            }        
            while(current != null)
            {   
                System.out.print(pos + " ");
                current.printNode();
                current = current.next;
                pos++;
            }
        }
        else
        {
            System.out.println(start + " is out of bounds.");
        }
    }
}