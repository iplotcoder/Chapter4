// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    String name;
    int test1;
    int test2;
    int average;
    
    Scanner scan = new Scanner(System.in);
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor
        this.name = studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        //add body of inputGrades
        System.out.println("Input the score on test 1: ");
        test1 = scan.nextInt();
        System.out.println("Input the score on test 2: ");
        test2 = scan.nextInt();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    public int getAverage() 
    {
        average = (test1 + test2) / 2;
        return average;
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    public String getName()
    {
        return this.name;
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    public String toString()
    {
        return "Name: " + this.name + "Test1: " + test1 + "Test2: " + test2;
    }
}