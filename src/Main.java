import zajecia1.Car;
import zajecia1.Vehicle;

public class Main {

    public static void main(String[] args) {
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
