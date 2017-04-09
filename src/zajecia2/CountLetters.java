package zajecia2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Krzysztof Podlaski on 09.04.2017.
 */
public class CountLetters {

    public static void main(String[] a) throws IOException {
        int counter =0;
        BufferedReader breader;
        breader = new BufferedReader(new InputStreamReader(
                new URL("http://www.onet.pl").openStream())
        );
        int znak;
        while ( (znak = breader.read())>0 ){
            char c =(char) znak;
            if (c=='x' || c=='X'){
                counter++;
            }
        }
        breader.close();
        System.out.println(counter);

    }
}
