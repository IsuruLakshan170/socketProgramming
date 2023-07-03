import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try{
            System.out.println("Waiting for clients requests");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Connection is established");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}