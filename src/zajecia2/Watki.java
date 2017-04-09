package zajecia2;

/**
 * Created by Krzysztof Podlaski on 09.04.2017.
 */
public class Watki {


    public static void main (String[ ] a)
            throws InterruptedException {
        Zadane z1 = new Zadane("Z1");
        Zadane z2 = new Zadane("Z2");
        new Thread(z1).start();
        new Thread(z2).start();
        Thread.sleep(10);
        System.out.println("Koniec programu");
    }
}
class Zadane implements Runnable{
    String nazwa;
    public Zadane(String nazwa) {
        this.nazwa = nazwa;}
    public void run() {
        for (int i=0; i< 50; i++){
            System.out.println(nazwa + " " + i);
        }
    }
}