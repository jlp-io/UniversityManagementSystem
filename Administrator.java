/**
 * Student ID: 2422194
 */
import java.util.ArrayList;
public class Administrator extends Person {
    private String jobTitle;
    public Administrator(String name, int age, String j) {
        super(name, age);                               //creates a Person
        jobTitle = j;
    }
    
    public void setJob(String j) {
       if (jobTitle != null) {
        jobTitle = j;
       }
    }
    
    public String getJob() {
        return jobTitle;
    }

    //returns a String containing the data in the object
    public String toString() { 
        return super.getName() + ", " + super.getAge() + ", " + super.getID() + ", " + getJob();
    }
}
