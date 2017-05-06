package zajecia4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Krzysztof Podlaski on 06.05.2017.
 */
public class Client {
    private Socket socket;
    private InputStream in;
    private OutputStream out;

    public void connectToServer(String ip, int port) throws IOException {
        socket = new Socket(ip, port);
        in = socket.getInputStream();
        out =socket.getOutputStream();
    }


    public void sendToSocket() throws IOException {
        //int c = System.in.read();
        for (int i=0 ; i<255; i++)
        out.write(i);
    }

    public void startListener(){
        Listener l = new Listener();
        new Thread(l).start();
    }

    class Listener implements Runnable{
        public void readFromSocket() throws IOException {
            int c = in.read();
            if (c == -1) return;
            System.out.print((char) c);
        }
        public void run() {
            try {
                while (true) {
                    readFromSocket();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] a) throws IOException {
        Client client = new Client();
        client.connectToServer("127.0.0.1",8000);
        client.startListener();
        while (true){
            client.sendToSocket();
            //System.out.println("WAITING");
        }
    }
}
