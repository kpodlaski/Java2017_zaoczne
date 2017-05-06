package zajecia4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Krzysztof Podlaski on 06.05.2017.
 */
public class ClientServer {
    private Socket socket;
    private InputStream in;
    private OutputStream out;

    public void startServer(int port) throws IOException {
        ServerSocket ssocket = new ServerSocket(port);
        socket = ssocket.accept();
        in = socket.getInputStream();
        out =socket.getOutputStream();
    }

    public void readFromSocket() throws IOException {
        int c = in.read();
        if (c == -1) return;
        System.out.print((char) c);
        System.out.print(" ");
    }
    public void sendToSocket() throws IOException {
        int c = System.in.read();
        out.write(c);
    }

    public static void main(String[] a) throws IOException {
        ClientServer client = new ClientServer();
        client.startServer(8000);
        while (true){
            client.sendToSocket();
            //System.out.println("WAITING");
            client.readFromSocket();
        }
    }
}
