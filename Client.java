import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverAddress = "localhost";
        int serverPort = 5001;

        try (Socket socket = new Socket(serverAddress, serverPort);
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to server!");
            System.out.println("Server says: " + input.readLine());

            // Send messages to the server
            String userInput;
            while (true) {
                System.out.print("Enter message: ");
                userInput = consoleInput.readLine();
                if (userInput.equalsIgnoreCase("exit"))
                    break; // Exit condition

                output.println(userInput);
                System.out.println("Server response: " + input.readLine());
            }
        } catch (IOException e) {
            System.err.println("Error in client communication: " + e.getMessage());
        }
    }
}
