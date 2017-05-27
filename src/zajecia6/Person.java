package zajecia6;

/**
 * Created by Krzysztof Podlaski on 27.05.2017.
 */
public class Person {
    public String name;
    public String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + ' '+ surname ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!name.equalsIgnoreCase(person.name)) return false;
        return surname.equalsIgnoreCase(person.surname);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result =  result + surname.hashCode();
        return result;
    }
}
