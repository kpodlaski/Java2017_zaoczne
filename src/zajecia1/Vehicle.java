package zajecia1;

/**
 * Created by Krzysztof Podlaski on 12.03.2017.
 */
public class Vehicle {
    public String brand;
    public String owner;

    public Vehicle(String brand, String owner) {
        this.brand = brand;
        this.owner = owner;
    }

    /*Ala Ma kota*/
    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
