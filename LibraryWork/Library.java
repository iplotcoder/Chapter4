package LibraryWork;


/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    // instance variables - replace the example below with your own
    private String name;
    private Book[] books;

    /**
     * Constructor for objects of class Library
     */
    public Library(String nm, int size)
    {
        // initialise instance variables
        this.name = nm;
        this.books = new Book[size];
    }
    
    public void addBook(int location, Book b) {
        books[location] = b;
    }
    
    public String toString()
    {
      String output = "The library " + this.name + "has the following \n";
      for(Book b : books) {
          output += b + "\n";
        }
      return output;
    }
}
