public class Node
{
    int data;
    Node next;
    public Node(int value)
    {
        this.data = value;
        this.next = null;
    }

    public void printNode()
    {
        System.out.println("Data: " + data);
    }
}