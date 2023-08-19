package task49;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5.0, 7.0);
        
        String triangleString = triangle.toString();
        System.out.println(triangleString); // Output: Triangle{width=5.0, height=7.0}
    }
}
