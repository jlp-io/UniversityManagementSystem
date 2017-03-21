/**
 * Student ID: 2422194
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UniversityManager {
    private ArrayList<Person> personList;
    private BinaryTree personTree;

    public UniversityManager() {
        personList = new ArrayList<Person>();       //create arrayList to hold the objects
        personTree = new BinaryTree();             //instantiate binarytree object
    }

    public void clear() {
        personList.clear();                         //empty the arraylist
        personTree.clear();                         //empty the binary tree
    }
    
    public void addPeople(Person p) {
        personList.add(p);                   //add object to ArrayList
        personTree.addNode(new Node(p));     //add new Node to binary tree
    }
    
    /**
     * print the people ArrayList, one line for each element
     */
    public void printPersonList() {
       for (int i = 0; i < personList.size(); i++) {     //sift through the arrayList
        System.out.println(personList.get(i));           //print every element
       }
    }
 
    /**
    * prints the binary tree 
    */
    public void printPersonTree() {
        personTree.printTree();         
    }

    /**
     * sort the binary tree in the pre-order traversal
     */
    public String preWalk() {
        return personTree.preOrder();       
    }

    /**
     * sort the binary tree in the in-order traversal
     */
    public String inWalk() {
        return personTree.inOrder();        
    }

    /**
     * sort the binary tree in the post-order traversal
     */
    public String postWalk() {
        return personTree.postOrder();      
    }

    /**
     * Find people in the tree and return the person object
     * @param name the name of the person that we want to locate in the binary tree
     */
    public String find(String name) {
        String find = personTree.find(name);       //search the binary tree for the String parameter
        return find;                                   
    }
    
    /**
     * Alternative to the find method, using a scanner. It compiles and runs although it results in the top lines in the terminal window disappearing. 
     * I added it as a creative extra feature. 
    */
    public void scanner() {
        Scanner scan = new Scanner(System.in);                                          //create Scanner object
        boolean searchDirectory = true;                                             
        while (searchDirectory) {                                                       //while user has not opted out
        System.out.println();
        System.out.println("Search directory (n to cancel)");                           
        String persontoFind1 = scan.next();                                             //store input in a string
        if (persontoFind1.equals("n")) {                                                //if is n
            searchDirectory = false;                                                    //break the loop
            System.out.println("Ending search...");                                     //let the user know
        }else{                                                                          //if not n
        String person = find(persontoFind1);                                            //method call to search the tree for "Brown"
        if (person != null)                                                             //if person is actually in the tree
            System.out.println("Found: " + person);                                     //print the person
        else
            System.out.println("Could not find "+ persontoFind1);                       //if input does not match anything in the directory
        }
       }
    }
    
    /**
     * Sorts the ArrayList in non-decreasing alphabetical order
     * @return personList the sorted list
     */
     public ArrayList<Person> sort() {
    Person temp;
    for (int i = 0; i < personList.size(); i++) {
        for (int j = i+1; j < personList.size(); j++) {
            int comparePeople = personList.get(i).compareTo(personList.get(j));
            if (comparePeople>0) {                                             //if personList.get(i) is lower on the alphabet than personList.get(j)
                //bubble sort
                temp = personList.get(i);                                      //store (i) in a temporary person
                personList.set(i, personList.get(j));                          //set (i) to the element in (j)
                personList.set(j, temp);                                       //set (j) to the element in temp
            }
            //repeat this process until every element in the arrayList has been visited
            
            /*
            //error handling
            if (comparePeople == 0) {                                         //if the objects are exactly the same
                System.out.println("This sort is not working");               //error message
            }
            */
        }
    }
    return personList;
   }
}