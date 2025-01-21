// Simulate a movie theater that helps users to book and reserve seats
// (if seat is taken, let them know it is taken and suggest an available seat)
// cancel seats
// retrieve initial seating charting


public class movieTheater {
    public final int[][] seats; // 2 dimensional array

    // Constructor & Initializing
    public movieTheater(int rows, int columns){
        seats = new int [rows][columns];
        for(int[] row : seats) {
            java.util.Arrays.fill(row,0); // 0 shows whether the seat is available or not
        }

    }

    // Reserving seats


}
