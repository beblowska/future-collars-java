package task31;

public class Cinema {

    private final int seatNumber;
    private final int rowNumber;
    private boolean isOccupied;

    public Cinema(int seatNumber, int rowNumber) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.isOccupied = false;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
    public int getRowNumber() {
        return rowNumber;
    }
    public boolean isOccupied() {
        return isOccupied;
    }
    public void occupy() {
        isOccupied = true;
    }
    public void free() {
        isOccupied = false;
    }
}
