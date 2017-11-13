package TableTask;


/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;

    /**
     * Constructor for objects of class Athlete
     */
    public Athlete(String nm, int ag)
    {
        // initialise instance variables
        this.name = nm;
        this.age = ag;
    }
    
    public boolean equals(Athlete other) {
        if(this.name.equals(other.name) && this.age == other.age) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public String toString() {
        return "The athlete's name is " + this.name + "\n The athlete is " + this.age + " years old\n";
    }

}
