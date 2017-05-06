package zajecia4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Krzysztof Podlaski on 06.05.2017.
 */
public class Server {

    private ServerSocket ssocket;
    private Socket socket;

    public void startServera(int port) throws IOException {
        ssocket = new ServerSocket(port);
        waitForClients();
        communication();
    }
    public void waitForClients() throws IOException {
        socket = ssocket.accept();
    }
    public void communication() throws IOException {
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        int c;
        while ( (c=in.read()) != -1 ){
            out.write(c);
        }
    }

    public static void main (String[] a) throws IOException {
        Server server = new Server();
        server.startServera(8000);
    }
}
