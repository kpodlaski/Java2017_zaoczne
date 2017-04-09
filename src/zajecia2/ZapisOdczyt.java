package zajecia2;

import java.io.*;
import java.net.URL;

/**
 * Created by Krzysztof Podlaski on 09.04.2017.
 */
public class ZapisOdczyt {

    public static void main(String[] a)
            throws Exception {
        String text = "Litwo, Ojczyno moja ...";

        OutputStreamWriter owriter ;
        FileWriter fwriter;
        BufferedWriter bwriter;

        File file = new File("output.txt");
        owriter = new OutputStreamWriter(
                new FileOutputStream(file,true));
        owriter.write(text);
        owriter.write(System.lineSeparator()); // "\n" lub "\r\n"
        owriter.write(text);
        owriter.close();

        InputStreamReader ireader;
        FileReader freader;
        BufferedReader breader;
        breader = new BufferedReader(new FileReader(file));
        int znak;
        while ( (znak = breader.read())>0 ){
            System.out.print( (char) znak+" ");
        }
        breader.close();
        breader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = breader.readLine())!=null ){
            System.out.println(line);
        }
        breader.close();

        breader = new BufferedReader(
                new InputStreamReader(
                //new URL("http://www.onet.pl").openStream()
                System.in
                ));
        while ((line = breader.readLine())!=null
                && !line.equals("STOP")){
            System.out.println(line);
        }
        breader.close();


    }
}
