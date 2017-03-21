/**
 * Student ID: 2422194
 */
import java.util.ArrayList;
public class Student extends Person {
    private String courseTitle;
    public Student (String name, int age, String c) {
        super(name, age);                                   //creates a Person in the super class
        courseTitle = c;
    }
    
    //set method
    public void setCourse(String c) {
       if (courseTitle != null) {
        courseTitle = c;
       }
    }
    
    //get method
    public String getCourse() {
        return courseTitle;
    }
    
    //returns a String containing the data in the object
    public String toString() {
        return super.getName() + ", " + super.getAge() + ", " + super.getID() + ", " + getCourse();
    }
}
