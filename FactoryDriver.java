
/**
 * Write a description of class FactoryDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FactoryDriver
{
    public static void main(String[] args) {
        Factory tesla = new Factory("123 main st", 100);
        Car modelS = new Car(20000, "Tesla");
        tesla.addCar(modelS , 0);
        System.out.println(tesla);
    }
}

