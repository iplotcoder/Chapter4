package LibraryWork;


/**
 * Write a description of class Author here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Author
{
    // instance variables - replace the example below with your own
    String name;
    int age;

    /**
     * Constructor for objects of class Author
     */
    public Author(String nm, int ag)
    {
        // initialise instance variables
        this.name = nm;
        this.age = ag;
    }
    
    public String toString()
    {
      return "The author's name is: " + this.name + "\nThe age of the author is: " + this.age;
    }
}
