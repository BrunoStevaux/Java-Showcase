// Author: Bruno Stevaux 
// Student ID: 144894s
// Email: 144894s@acadiau.ca

public class BinarySearchTree{
    Node root; // Creating the root

    // This makes a BST with an initial value, which will be root.
    public BinarySearchTree(int newRoot){
        Node node = new Node(newRoot);
        root = node;
    }

    // Adds a value at the appropriate location
    public void add(int value){
        Node current = this.root;
        boolean a = true; 
        while(a){
            // Adds to the left
            if(value < current.value){
                if(current.left == null){
                    current.left = new Node(value);
                    current.left.parent = current; 
                    System.out.println("Insterting " + value + " to the left of " + current.value);
                    a = false;
                } else {
                    current = current.left; // Try left
                }
            } else { 
                // Adds to the right
                if(current.right == null){
                    current.right = new Node(value);
                    current.right.parent = current;
                    System.out.println("Insterting " + value + " to the right of " + current.value);
                    a = false;
                } else {
                    current = current.right; // Try right
                }
            }
        }
    }

    // Returns the size of a subtree of a given node.
    public int size(Node node){
        if(node == null){ // If node is not there, add nothing.
            return 0;
        } else {
            return size(node.left) + 1 + size(node.right); // recursively adds 
        }
    }

    // checks the depth of a node by checking how many parents until it reaches root.
    public int depth(Node node){
        int count = 0;
        while(node.parent != null){ // if node has parent
            count++;                // add one
            node = node.parent;     // go to parent
        }
        return count;
    }

    // prints left to right, using depth traversing using recursion
    public void depthTraverse(Node node){

        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        depthTraverse(node.left);
        depthTraverse(node.right);
    }

    // printing for debugging
    public void depthTraversePLUS(Node node){

        if(node == null){
            return;
        }
        System.out.print("[VALUE : " + node.value);
        if(node.right != null){
            System.out.print(" RIGHT: " + node.right.value);
        }
        if(node.left != null){
            System.out.print(" LEFT: " + node.left.value);
        }
        if(node.parent != null){
            System.out.print(" PARENT: " + node.parent.value);
        }
        if(node.parent == null){
            System.out.print(" PARENT: Root");
        }
        System.out.print("]\n");
        depthTraversePLUS(node.left);
        depthTraversePLUS(node.right);
    }    

    // Finds the height of the tree, to be used for breadth searching 
    public int findHeight(Node node){
        if(node == null){
            return 0;
        } else {
            int left = findHeight(node.left);
            int right = findHeight(node.right);

            if(left > right){
                return (left + 1);
            } else {
                return (right + 1);
            }
        }
    }

    // prints the nodes by each height, starting at top
    public void printByDepth(Node node, int level){
        if( node == null){
            return;
        }
        if( level == 1){
            System.out.print(node.value + " ");
        }
        else if(1 < level){
            printByDepth(node.left, level-1);
            printByDepth(node.right, level-1);
        }
    }
    public void breadthTraverse(){
        int height = findHeight(root);
        for(int level = 1; level <= height; level++){
            printByDepth(root, level);
        }
    }
}