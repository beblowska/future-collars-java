package task41;

public abstract class Message {
    public abstract String getMessage();
}

class WindowMessage extends Message {
    @Override
    public String getMessage() {
        return "This is class WindowMessage";
    }
}

class ConsoleMessage extends Message {
    @Override
    public String getMessage() {
        return "This is class ConsoleMessage";
    }
}
