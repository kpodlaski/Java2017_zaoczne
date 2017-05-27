package zajecia6;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Krzysztof Podlaski on 27.05.2017.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Person,Salary> salary = new HashMap<>();
        salary.put(new Person("Jan","Kowalski"),new Salary(2353.2));
        salary.put(new Person("Janina","Kowalska"),new Salary(13045.0));
        salary.put(new Person("Kowalski","Jan"),new Salary(1345.0));
        System.out.println(salary);
        salary.put(new Person("Jan","Kowalski"),new Salary(4350.2));
        System.out.println(salary);
        Salary s = salary.get(new Person("Kowalski","Jan"));
        s.value+=500;
        System.out.println(s);
        System.out.println(salary);
        for(Person p : salary.keySet()){
            System.out.println(p +" zarobki miesiecznie: "+salary.get(p));
        }

    }
}

class Salary{
    public double value;
    public Salary(double v){
        value = v;
    }
    @Override
    public String toString(){
        return ""+value;
    }
}