
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    // instance variables - replace the example below with your own
    private int price;
    private String type;

    /**
     * Constructor for objects of class Car
     */
    public Car(int pri, String typ)
    {
        // initialise instance variables
        this.price = pri;
        this.type = typ;
    }
    
    public int getPrice()
    {
        return this.price;
    }
    
    public String getType()
    {
        return this.type;
    }
    
    public String toString() {
        return "This car's price is: " + this.price;
    }
    
    public boolean equals(Car other)  {
        if(this.price == other.price && this.type.equals(other.type)) {
            return true;
        }
        else {
            return false;
        }
    }
}
