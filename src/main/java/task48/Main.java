package task48;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Adam", 30);
        Person person2 = new Person("Adam", 30);
        Person person3 = new Person("Alicja", 25);

        System.out.println("person1.equals(person2): " + person1.equals(person2)); // Output: true
        System.out.println("person1.equals(person3): " + person1.equals(person3)); // Output: false

        System.out.println("HashCode person1: " + person1.hashCode());
        System.out.println("HashCode person2: " + person2.hashCode());
        System.out.println("HashCode person3: " + person3.hashCode());
    }
}
