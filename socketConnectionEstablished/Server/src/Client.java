import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {


        try{
            System.out.println("Client started");
            Socket soc = new Socket("localhost",9806);

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
