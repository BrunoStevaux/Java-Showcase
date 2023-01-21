public class Tester
{
    public static void main(String[] args)
    {
        LinkedList test = new LinkedList(11);
        test.insert(1, 22);
        test.insert(2, 33);
        test.insert(3, 44);
        test.insert(4, 55);
        test.insert(5, 66);
        test.insert(6, 77);
        test.insert(7, 88);

        test.traverse(0);

        test.insert(-5, 99);
        test.insert(100, 99);

        test.traverse(0);

        test.delete(7);
        test.traverse(0);

        test.delete(5);
        test.traverse(0);

        test.delete(0);
        test.traverse(0);

        test.delete(100);
        test.delete(-5);

        test.traverse(5);

        LinkedList test2 = new LinkedList(1);
        test2.insert(1,11);
        test2.insert(2,22);
        test2.insert(3,33);
        test2.insert(4,44);

        test2.delete(3);

        test2.traverse(0);
        
        
    }
}