import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverAddress = "localhost";
        int serverPort = 5001;

        try (Socket socket = new Socket(serverAddress, serverPort);
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            String message = "Hello from client!";
            output.println(message);
            System.out.printf("Sent to server: %s%n", message);

            String response = input.readLine();
            System.out.printf("Received from server: %s%n", response);
        } catch (IOException e) {
            System.out.printf("Client exception: %s%n", e.getMessage());
        }
    }
}
