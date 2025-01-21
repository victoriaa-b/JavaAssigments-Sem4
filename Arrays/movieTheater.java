// Simulate a movie theater that helps users to book and reserve seats
// (if seat is taken, let them know it is taken and suggest an available seat)
// cancel seats
// retrieve initial seating charting


public class movieTheater {
    public final int[][] seats; // 2 dimensional array

    // Constructor & Initializing
    public movieTheater(int rows, int column){
        seats = new int [rows][column];
        for(int[] row : seats) {
            java.util.Arrays.fill(row,0); // 0 shows whether the seat is available or not
        }

    }

    // Seating chart logic


    // Checks to see of seats are in the parameters
    private boolean seatNum(int row, int column){
        return row >= 0 && row < seats.length && column >= 0 && column < seats[0].length;
    }

    // Lets a seat be suggested if picked one is already taken
    // Scan seats from the seating charts
    private void suggestedSeat(){

    }


    // Reserving seats
    public void reservedSeat(int row, int column) {
        if (!seatNum(row, column)) {
            System.out.println("Seat number does not exist.");
        } else if (seats[row][column] == 1){
            System.out.println("Seat is already taken.");
            suggestedSeat(); // make class
        } else {
            seats[row][column] = 1; // 1 sets the seat as reserved
            System.out.println("Your seat has been reserved.");
        }
    }

    // Cancelling Seats


}
