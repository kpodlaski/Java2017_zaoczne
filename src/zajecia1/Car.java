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
        this.milage=0.0;
        this.regNr = regNr;
        this.yearOfProduction=yearOfProduction;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return regNr.equalsIgnoreCase(car.regNr);
    }

    @Override
    public int hashCode() {
        return regNr.hashCode();
    }

    @Override
    public int compareTo(Car o) {
        //Sortowanie rosnące z rokiem produkcji
        return -(this.yearOfProduction-o.yearOfProduction);
    }
}
