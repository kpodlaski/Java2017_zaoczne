package zajecia2;

/**
 * Created by Krzysztof Podlaski on 09.04.2017.
 */
public class Watki {


    public static void main (String[ ] a){
        Zadane z1 = new Zadane("Z1");
        Zadane z2 = new Zadane("Z2");
        z1.run();
        z2.run();
    }
}

class Zadane implements Runnable{
    String nazwa;
    public Zadane(String nazwa) {
        this.nazwa = nazwa;
    }
    @Override
    public void run() {
        for (int i=0; i< 50; i++){
            System.out.println(nazwa + " " + i);
        }
    }
}