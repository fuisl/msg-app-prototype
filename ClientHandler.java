
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private final Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.printf("ClientHandler started for %s%n", socket.getInetAddress());
        
        try (BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            String clientInput;
            while ((clientInput = input.readLine()) != null) {
                System.out.printf("Received from %s: %s%n", socket.getInetAddress(), clientInput);
            }
        } catch (Exception e) {
            System.out.printf("Exception occurred for %s: %s%n", socket.getInetAddress(), e.getMessage());
        }
    }
}
