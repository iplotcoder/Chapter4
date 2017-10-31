
public class Pet
{
    // instance variables - replace the example below with your own
    int age;
    String type;
    private static int numPets;

    public Pet(int ag, String ty)
    {
        // put your code here
        this.age = ag;
        this.type = ty;
        numPets++;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String toString() {
        return "This pet's age is: " + this.age;
    }
    
    public boolean equals(Pet other) {
        if (this.age==other.age) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void example() {
        System.out.println("This is in a static method!");
    }
}
