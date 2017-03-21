/**
 * Student ID: 2422914
 */
import java.util.ArrayList;                                                             

public class UniversityManagerTest {
    static UniversityManager universityManager = new UniversityManager();               //new UniversityManager object
    
    public static void main(String[] args) {
        UniversityManagerTest.run();   
    }

    public static void storePeople() {
        universityManager.clear();                                                              //clear all previously held data
        //re-populate the objects, re-populate the arrayList
        universityManager.addPeople(new Lecturer("Wood", 35, "Computing Science"));             //add new lecturer to arrayList
        universityManager.addPeople(new Lecturer("Jones", 45, "Mathematics"));
        universityManager.addPeople(new Student("Smith", 19, "Software Engineering"));          //add new student to arrayList
        universityManager.addPeople(new Student("Brown", 21, "Maths"));
        universityManager.addPeople(new Administrator("McCormick", 60, "Principal and Vice-Chancellor"));
        universityManager.addPeople(new Administrator("Adams", 55, "School Manager"));          //add new administrator to arrayList
    }

    public static void run() {
        storePeople();                                      //create a bunch of objects
        System.out.println("\n--People List--");
        universityManager.printPersonList();                //print entire arrayList
        // ----------------------
        System.out.println("\n--People Tree--");        
        universityManager.printPersonTree();                //print binarytree, consisting of the objects created in storePeople()
        System.out.println();
        // ----------------------
        //print out the 3 traversals for the binary tree
        System.out.println("\n--Pre Order --\n" + universityManager.preWalk());         //pre-order traversal 
        System.out.println("\n--In Order --\n" + universityManager.inWalk());           //in-order traversal 
        System.out.println("\n--Post Order --\n" + universityManager.postWalk());       //post-order traversal 
        // ----------------------        
        
        //universityManager.scanner();                                                  //extra feature for fun
        
        System.out.println("\n--Find--");
        String personToFind1 = "Wood";                  
        String person = universityManager.find(personToFind1);                          //searches binaryTree for the String
        if (person != null)                                                             //if the binaryTree found the person
            System.out.println("Found: " + person);                                     //print the person object (it prints out the entire person as a result of node.getPerson() using toString()
        else                                                                            //if return was null
            System.out.println("Could not find "+ personToFind1);                       
        
        System.out.println("\n--Find--");                                               
        String personToFind2 = "Black"; 
        person = universityManager.find(personToFind2);
        if (person != null)
            System.out.println("Found: " + person);
        else
            System.out.println("Could not find "+ personToFind2);
     
        // ----------------------
        // ----------------------
        
        System.out.println("\n--Unsorted--");                                          
        universityManager.printPersonList();                                           //print unsorted array
        System.out.println("\n--Sorted--");                                            
        universityManager.sort();                                                      //sorting algorithm method
        universityManager.printPersonList();                                           //print the sorted array
    }

    /**
     * the pre-order walk
     */
    public static void preOrderTest() {
        storePeople();                                                          
        System.out.println("\n--In Order --\n" + universityManager.preWalk()); 
    }

    /**
     * the in-order walk
     */
    public static void inOrderTest() {
        storePeople();
        System.out.println("\n--In Order --\n" + universityManager.inWalk());
    }

    /**
     * the post-order walk
     */
    public static void postOrderTest() {
        storePeople();
        System.out.println("\n--Post Order --\n" + universityManager.postWalk());
    }
}