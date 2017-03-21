/**
 * Student ID: 2422194
 */
public class Node implements Comparable<Node> {
    // CLASS ATTRIBUTES
    private Person data;// the data we are storing at the node
    private Node left;// object reference to node at left.
    private Node right;// object reference to node at right.

    //constructor
    public Node(Person data) {
        this.data = data;
    }

    /**
     * Compare two nodes 
     * returns negative if before, zero if same order, or positive if after
     */
    public int compareTo(Node node) {     
        return this.data.toString().compareTo(node.getNode().toString());
    }

    // getter methods
    public String getNode() {
        return this.data.getName();             //return the Node's name only
    }
    
    //return the entire node's contents 
    public String getPerson() {
        return this.data.toString();            
    }

    // setter method
    public void setNode(Person data) {
        this.data = data;                       
    }

    // get the left child
    public Node getLeft() {
        return this.left;                  
    }

    // set the left child
    public void setLeft(Node left) {
        this.left = left;
    }

    // get the right child
    public Node getRight() {
        return this.right;
    }

    // set the right child
    public void setRight(Node right) {
        this.right = right;
    }

    // does the node have a left child
    public boolean hasLeft() {
        return left != null;
    }

    // does the node have a right child
    public boolean hasRight() {
        return right != null;
    }

    // returns a String containing the data in the node.
    public String toString() {
        return this.getNode().toString();
    }
}