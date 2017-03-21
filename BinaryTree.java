/**
 * Student ID: 2422194
 */
public class BinaryTree {

    private Node root; // The root Node of the tree
    private int size = 0; // A count of the Nodes in the tree

    // Returns the number of Nodes in the tree.
    public int size() {
        return size;
    }

    // Empties the tree
    public void clear() {
        this.root = null;                                       //empty the root of the tree
        size = 0;                                               //remove all nodes attached to the tree
    }

    // Determines if the tree is empty or not.
    public boolean isEmpty() {
        return (root == null);                                  //return an empty value for the root of the tree
    }

    // adds a node
    public void addNode(Node nodeToInsert) {
        // If tree is empty, make our new Node the root
        if (root == null) {
            root = nodeToInsert;
            size = 1;                       //the tree now has 1 node i.e. the root
        } else {
            // Start the recursive calls to add the descendants of NodeST person
            addNode(nodeToInsert, root);
            size = size + 1;
        }
    }

    /**
     * private adds a node
     * @param nodeToInsert the new node that we want to add
     * @param currentNode the node that we compare it with, so we can identify the accurate location
     */
    private void addNode(Node nodeToInsert, Node currentNode) {
        if (nodeToInsert.compareTo(currentNode) < 0) {          //if nodeToInsert is higher up alphabetically than currentNode
            if (currentNode.hasLeft())                          //if the node has a left child
                addNode(nodeToInsert, currentNode.getLeft());   //recursive call to compare nodeToInsert with the left child of currentNode.                                                                                 //this will continue until nodeToInsert is lower on the alphabet than currentNode
                else {                                          //if there is no left child
                currentNode.setLeft(nodeToInsert);              //set currentNode as the left child
                return;
            }
        } else {                                                //if nodeToInsert is lower on the alphabet than currentNode. 
            if (currentNode.hasRight())                         //check if the currentNode has a right child
                addNode(nodeToInsert, currentNode.getRight());  //if it does, we do a similar recursion as before, but with the right children of currentNode
            else {                                              //if there is no right child
                currentNode.setRight(nodeToInsert);             //set nodeToInsert as the right child
                return;
            }
        }
    }

    // preOrder
    public String preOrder() {
        StringBuffer stringBuffer = new StringBuffer();
        if (root == null)                   //if the beginning of the tree has nothing
            return "Empty Tree!";           //return empty message
        else
            preOrder(root, stringBuffer);      
        return stringBuffer.toString();
    }

    // private preOrder
    private void preOrder(Node node, StringBuffer stringBuffer) {
        // We visit the NodeSTs and add its contents to our String
        stringBuffer.append(node.getNode().toString() + ", "); // Visit NodeST
        if (node.hasLeft())                         //if the node has a left child
            preOrder(node.getLeft(), stringBuffer);// Visit left
        if (node.hasRight())                        //if the node has a right child
            preOrder(node.getRight(), stringBuffer);// Visit right
    }

    // inOrder
    public String inOrder() {
        StringBuffer stringBuffer = new StringBuffer();
        if (root == null)
            return "Empty Tree!";
        else
            inOrder(root, stringBuffer);
        return stringBuffer.toString();
    }

    // private inOrder
    private void inOrder(Node node, StringBuffer stringBuffer) {
        // We visit the NodeSTs and add its contents to our String
        if (node.hasLeft())// Visit left
            inOrder(node.getLeft(), stringBuffer);          //recursive call that changes @param node to its left child
            stringBuffer.append(node.getNode().toString() + ", ");// // Visit NodeST
        if (node.hasRight())// Visit right
            inOrder(node.getRight(), stringBuffer);         //recursive call that changes @param node to its right child
    }

    // postOrder
    public String postOrder() {
        StringBuffer stringBuffer = new StringBuffer();
        if (root == null)
            return "Empty Tree!";
        else
            postOrder(root, stringBuffer);
        return stringBuffer.toString();
    }

    // private postOrder
    private void postOrder(Node node, StringBuffer stringBuffer) {
        // We visit the NodeSTs and add its contents to our String
        if (node.hasLeft()) // Visit left
            postOrder(node.getLeft()    , stringBuffer);
        if (node.hasRight()) // Visit right
            postOrder(node.getRight(), stringBuffer);
        stringBuffer.append(node.getNode().toString() + ", ");// Visit NodeST
    }

    // find
    public String find(String name) {
        return find(name, root);                    
    }

    // private find
    private String find(String name, Node node) {
        if (node == null)                                                           //if node is empty
            return null;                                                            //return null, which will ultimately print the else condition in the test class
        int order = name.toString().compareTo(node.getNode().toString());           //comparing the name parameter with the root of the tree 
        if (order == 0)                                                             //if they are the same
            return node.getPerson();                                                //return the node object. it has been found
        if (node.hasLeft() && order < 0)                                            //if name is higher in the alphabet than node            
            return find(name, node.getLeft());                                      //recursive method call, changing node for a node that is to the left
        if (node.hasRight() && order > 0)                                           //if name is lower in the alphabet than node
            return find(name, node.getRight());                                     //recursive method call, changing node for a node that is to the right
        return null;                                                                //return null if none of the if statements work
   }

    public void printTree() {
        printIndentedTree(root, 0);                                     
    }

    // private print tree
    private void printIndentedTree(Node node, int depth) {
        if (node.hasRight())                                        
            printIndentedTree(node.getRight(), depth + 1);
        // Show depth of current code by indenting to the right
        for (int d = 0; d < depth; d++)
            System.out.print("  ");
        System.out.println(node.getNode().toString());
        if (node.hasLeft())
            printIndentedTree(node.getLeft(), depth + 1);
    }
}