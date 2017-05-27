package zajecia6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 27.05.2017.
 */
public class ListTest {
    public static void main(String[] args) {
        List<Person> pList = new ArrayList<Person>();
        pList.add(new Person("Jan","Kowalski"));
        pList.add(new Person("Janina","Kowalska"));
        pList.add(new Person("Kowalski","Jan"));
        System.out.println(pList);
        Person p = pList.get(2);
        System.out.println(p);
        for ( Person op : pList){
            System.out.println("OSOBA: "+op);
        }
        System.out.println("-----------------------");
        for (int i=0; i<pList.size(); i++){
            System.out.println("OSOBA: "+pList.get(i));
        }
        p= new Person("Kowalski","Jan");
        if (pList.contains(p)){
            System.out.println(pList.indexOf(p));
        }
        else System.out.println("Ne ma w liście "+p);

    }
}
