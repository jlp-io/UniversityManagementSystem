/**
 * Student ID: 2422194
 */
import java.util.ArrayList;
public abstract class Person implements Comparable<Person> {
    private String name;                            
    private int age;                                
    private int id;
    private static int currentId;

    //constructor
    public Person(String n, int a) {
        if (n != null && a > 0) {
        name = n;   
        age = a;
        id=setID();
        }
    }
    
    //set methods
    public void setName(String name) {
        if (name != null) {
        name = name;
       }
    }
    
    public void setAge(int age) {
        if (age > 0) {
        age = age;
        }
    }
    
    public int setID() {                        //every setID() method call results in the most recent id being incremented, allowing there to be unique ID's for objects
        currentId++;                            //currentId is a static int that keeps track of all setID() method calls
        return currentId;                       //returns to the id variable in the constructor
    }
   
    //get methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return id;
    }
  
    //reset this.id so that it becomes the largest ID out of all the persons. 
    public void resetID() {
        this.id = setID();                        
    }

    public String toString() {
        return "Name is " + name + ", " + "Age is " + age + ", " + "ID is " + id;
    }

    /**
     * @param comparePerson the person that we are comparing the 'this' Person to
     * @return nameComparison the int result of the compareTo between the name strings of both Persons. 
     */
    public int compareTo(Person comparePerson) {
        //the value of nameComparison will be positive if this.getName() is lower on the alphabet than comparePerson.getName()
        int nameComparison = this.getName().compareTo(comparePerson.getName());                      
        return nameComparison;                                                    
    }  
}