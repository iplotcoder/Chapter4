package LibraryWork;


/**
 * Write a description of class AHSLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AHSLibrary
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        //create a library object
        Library ahs = new Library("Acalanes", 10);
        Author isaac = new Author("Isaac", 18);
        Book b = new Book(isaac, "Java Book");
        ahs.addBook(0, b);
        System.out.println(ahs);
    }
}
