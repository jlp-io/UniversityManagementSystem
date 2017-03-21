 /**
  * Student ID: 2422194
  */
import java.util.ArrayList;
public class Lecturer extends Person {
    private String department;
    public Lecturer(String name, int age, String d) {        //construct Lecturer object
        super(name, age);                                    //pass variables to super class, creating a Person
        department = d;                                      //keep within this method as it is a unique variable
    }
    
    public void setDepartment(String d) {                   //change department
        if (department != null) {                           //if department has already been set
        department = d;                                    //set parameter as the variable
       }
    }
    
    public String getDepartment() {                       //return department of the Lecturer
        return department;
    }

    //returns a String containing the data in the object
    public String toString() {
         return super.getName() + ", " + super.getAge() + ", " + super.getID() + ", " + getDepartment();
    }    
}