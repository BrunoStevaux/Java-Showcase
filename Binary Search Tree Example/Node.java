// Author: Bruno Stevaux 
// Student ID: 144894s
// Email: 144894s@acadiau.ca

public class Node{
    int value;
    Node left, right, parent; 
    Node root; 

    public Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
        this.parent = null; 
    }

    public void printNode(){
        
        System.out.println("value: " + value);
        System.out.println("left: " + left);
        System.out.println("right: " + right);
        System.out.println("parent: " + parent);

    }
}