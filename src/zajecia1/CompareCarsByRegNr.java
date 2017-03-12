package zajecia1;

import java.util.Comparator;

/**
 * Created by Krzysztof Podlaski on 12.03.2017.
 */
public class CompareCarsByRegNr implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.regNr.compareToIgnoreCase(o2.regNr);
    }
}
