package task31;

public class Main {

    public static void main(String[] args) {
        Cinema cinema = new Cinema(1, 2);
        System.out.println("Seat number: " + cinema.getSeatNumber());
        System.out.println("Row number: " + cinema.getRowNumber());

        cinema.occupy();
        System.out.println("Occupied: " + cinema.isOccupied());

        cinema.free();
        System.out.println("Free: " + cinema.isOccupied());
    }
}
