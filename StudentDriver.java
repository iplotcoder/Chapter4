
/**
 * Write a description of class StudentDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentDriver
{
    public static void main()  {
        Student sam = new Student(1234, "Sam");
        System.out.println("The student name is: " +sam.getName());
        System.out.println(sam);
    }
}
