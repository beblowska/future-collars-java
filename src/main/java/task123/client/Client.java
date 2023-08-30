package task123.client;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a list of integers (separated by spaces):");
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");

            List<Integer> numbers = new ArrayList<>();
            for (String numberString : inputArray) {
                numbers.add(Integer.parseInt(numberString));
            }

            objectOutputStream.writeObject(numbers);

            int sum = objectInputStream.readInt();
            System.out.println("Sum received from server: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
