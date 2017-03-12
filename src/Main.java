import zajecia1.Car;
import zajecia1.CompareCarsByRegNr;
import zajecia1.Vehicle;

import java.util.*;

public class Main {

    public static void main(String[] args){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("EL1234",2012,
                "Honda", "Ewelina Nowak"));
        cars.add(new Car("EL1243",2018,
                "Volvo","Adam Adamski"));
        cars.add(new Car("EL2431",2002,
                "Peugeot","Barbara Barbarska"));
        cars.add(new Car("ELW1243",2010,
                "Fiat","Tomasz Tomaszewski"));
        cars.add(new Car("EP1243",2008,
                "Ford","Dominika Domarska"));
        Collections.sort(cars);
        System.out.println(cars);
        System.out.println(cars.size());
        for(int i=0; i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        System.out.println("==================");
        for(Car c : cars){
            System.out.println(c);
        }
        System.out.println("==================");
        Iterator<Car> it = cars.iterator();
        while(it.hasNext()){
            Car c = it.next();
            System.out.println(c);
            if (c.yearOfProduction<2012){
                it.remove();
                System.out.println("DO KASACJI");
            }
        }
        System.out.println(cars.size());

    }

    public static void main2(String[] args) {
        Vehicle v = new Vehicle("BMW","Jan Kowalski");
        System.out.println(v.brand + ", "+v.owner);
        System.out.println("obiekt: "+v);
        Car c = new Car("EL1234",2012,
                "Honda", "Ewelina Nowak");
        System.out.println("samochód: "+c);
        v = c;
        ((Car) v).milage=1234.6;
        temp.Car c2 = new temp.Car();
        Car[] cars = new Car[5];
        cars[0]=new Car("EL1243",2018,
                "Volvo","Adam Adamski");
        cars[1]=new Car("EL2431",2002,
                "Peugeot","Barbara Barbarska");
        cars[2]=new Car("ELW1243",2010,
                "Fiat","Tomasz Tomaszewski");
        cars[3]=new Car("EP1243",2008,
                "Ford","Dominika Domarska");
        cars[4]=c;
        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i].yearOfProduction + ":"+cars[i]);
        }
        sortCars(cars);
        System.out.println("===================");
        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i].yearOfProduction + ":"+cars[i]);
        }
        Arrays.sort(cars);
        System.out.println("===================");
        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i].yearOfProduction + ":"+cars[i]);
        }
        Arrays.sort(cars,new CompareCarsByRegNr());
        System.out.println("+++++++++++++++++");
        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i].yearOfProduction + ":"+cars[i]
            + " "+cars[i].regNr);
        }
    }

    private static void sortCars(Car[] cars) {
        Car temp;
        for(int i=0; i<cars.length;i++){
            for (int j=i; j<cars.length; j++){
                if (cars[i].yearOfProduction>cars[j].yearOfProduction){
                    temp = cars[i];
                    cars[i]=cars[j];
                    cars[j]=temp;
                }
            }
        }
    }
}
