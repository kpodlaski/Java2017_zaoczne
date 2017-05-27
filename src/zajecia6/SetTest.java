package zajecia6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Krzysztof Podlaski on 27.05.2017.
 */
public class SetTest {
    public static void main(String[] a) {
        Set<Person> pSet = new HashSet<>();
        pSet.add(new Person("Jan","Kowalski"));
        pSet.add(new Person("Janina","Kowalska"));
        pSet.add(new Person("Kowalski","Jan"));
        System.out.println(pSet);
        pSet.add(new Person("Janina","Kowalska"));
        System.out.println(pSet);
        for(Person p : pSet){
            System.out.println(p);
        }
        Iterator<Person> it = pSet.iterator();
        while (it.hasNext()){
            Person x = it.next();
            System.out.println("Osoba:"+x + " hash:"+x.hashCode());
            if (x.equals(new Person("Jan","Kowalski")))
                it.remove();
        }
        System.out.println(pSet);
    }

}
