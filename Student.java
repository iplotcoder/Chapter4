
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private int idNumber;
    private String name;
    private Student bestFriend;
    private Pet pete;
    private Hat h;
    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
    }
    
    public Student(int num, String nm)  {
        this.idNumber = num;
        this.name = nm;
    }

    public String getName() {
        return this.name;
    }
    
    
    public Student makeStudent()  {
        Student joe = new Student(this.idNumber, bestFriend.name);
        return joe;
    }
    
    public String toString()  {
        return "The studemt name is: " + this.name;
    }
}
