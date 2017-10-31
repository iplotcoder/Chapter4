
public class PetDriver
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class PetDriver
     */
    public PetDriver()
    {
        Pet pam = new Pet(7, "Cat");
        System.out.println(pam.getAge());
        Pet mike = new Pet(7, "Cat");
        System.out.println(pam.equals(mike));
        
        Pet.example();
    }
    }

