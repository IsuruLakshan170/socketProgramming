import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
       String clientSentence;
       String capitalizedSentence;

        System.out.println("Waiting for clients");
        ServerSocket welcomeSocket = new ServerSocket(9807);


        while (true) {
            Socket connectionSocket = welcomeSocket.accept();
            System.out.println("Connection is established");

            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

            clientSentence =inFromClient.readLine();
            capitalizedSentence = clientSentence.toUpperCase() + '\n';
            outToClient.writeBytes(capitalizedSentence);

        }
    }
}