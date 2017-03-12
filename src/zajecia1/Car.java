package zajecia1;

/**
 * Created by Krzysztof Podlaski on 12.03.2017.
 */
public class Car extends Vehicle implements Comparable<Car>{
    public String regNr;
    public double milage;
    public int yearOfProduction;

    public Car(String regNr, int yearOfProduction,
               String brand, String owner) {
        super(brand, owner);
        milage=0.0;
        this.milage=milage;
        this.yearOfProduction=yearOfProduction;

    }

    @Override
    public int compareTo(Car o) {
        //Sortowanie rosnące z rokiem produkcji
        return -(this.yearOfProduction-o.yearOfProduction);
    }
}
