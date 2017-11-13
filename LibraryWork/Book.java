package LibraryWork;


/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private Author bookAuthor;
    private String title;

    /**
     * Constructor for objects of class Book
     */
    public Book(Author auth, String tit)
    {
        // initialise instance variables
        this.bookAuthor = auth;
        this.title = tit;
    }
    
    public String toString()
    {
      return "The author is: " + this.bookAuthor + "\nThe title is: " + this.title;
    }

}
