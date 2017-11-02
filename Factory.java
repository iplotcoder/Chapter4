
public class Factory
{
    // instance variables - replace the example below with your own
    String address;
    Car[] inventory;

    public Factory(String st, int size)
    {
        // initialise instance variables
        this.address = st;
        this.inventory = new Car[size];
    }

    public void addCar(Car c, int spot) {
        inventory[spot] = c;
    }
    
    public String toString() {
        String output = "This is the factory inventory: \n";
        for(int i = 0; i <inventory.length; i++) {
            output += inventory[i].toString();
        }
        for(Car c:inventory) {
            output += c.toString() + "\n";
        }
        return output;
    }
    
}
