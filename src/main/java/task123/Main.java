package task123;
import task123.client.Client;
import task123.server.Server;

public class Main {
    public static void main(String[] args) {
        Thread serverThread = new Thread(() -> Server.main(null));
        serverThread.start();

        try {
            Thread.sleep(1000); // Give the server some time to start
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Client.main(null);
    }
}
