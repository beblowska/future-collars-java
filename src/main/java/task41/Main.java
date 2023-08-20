package task41;

public class Main {
    public static void main(String[] argc){
        Message windowMessage = new WindowMessage();
        Message consoleMessage = new ConsoleMessage();

        System.out.println(windowMessage.getMessage());
        System.out.println(consoleMessage.getMessage());
    }
}
