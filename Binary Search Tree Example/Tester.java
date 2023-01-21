// Author: Bruno Stevaux 
// Student ID: 144894s
// Email: 144894s@acadiau.ca

public class Tester
{
    public static void main(String[] args)
    {

        // Creating a tree
        BinarySearchTree BT = new BinarySearchTree(41);

        // adding
        BT.add(20);
        BT.add(65);
        BT.add(11);
        BT.add(29);
        BT.add(32);
        BT.add(50);
        BT.add(91);
        BT.add(72);
        BT.add(99);

        // Checking it was added correctly
        BT.depthTraversePLUS(BT.root);

        //  Printing size
        System.out.println("Size: " + BT.size(BT.root));
        System.out.println("Size: " + BT.size(BT.root.right));

        // Depth
        System.out.println("Depth " + BT.depth(BT.root));
        System.out.println("Depth " + BT.depth(BT.root.right));

        // Depth Traversing 
        BT.depthTraverse(BT.root);
        System.out.println();
        
        // Breadth Traversing
        System.out.println("BreadthTraverse: ");
        BT.breadthTraverse();

        // CASES
        System.out.println();
        System.out.println("Size: " + BT.size(BT.root.right.right.right.right));
        System.out.println("Size: " + BT.size(BT.root.left.left.left));
        System.out.println("Depth: " + BT.depth(BT.root.right.right.right));
        System.out.println("Depth: " + BT.depth(BT.root.left.left));
        BT.depthTraverse(BT.root.right);
        BT.depthTraverse(BT.root.left);




    }
}