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
    public void seatingChart() {
        System.out.println();
        for (int[] row : seats) {  // 0 - available, 1 - taken
            for (int seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }

    // Checks to see of seats are in the parameters
    private boolean seatNum(int row, int column){
        return row >= 0 && row < seats.length && column >= 0 && column < seats[0].length;
    }

    // Lets a seat be suggested if picked one is already taken
    // Scan seats from the seating charts
    private void suggestedSeat(){
        for (int row = 0; row < seats.length; row++) {
            for (int column = 0; column < seats[row].length; column++) {
                if (seats[row][column] == 0) { // check to see if seat is available
                    System.out.println("Try seat: Row " + row + ", Column " + column);
                    return;
                }
            }
        }
        System.out.println("There are no seats currently available.");
    }


    // Reserving seats
    public void reservedSeat(int row, int column) {
        if (!seatNum(row, column)) {
            System.out.println("The Seat number does not exist.");
        } else if (seats[row][column] == 1){
            System.out.println("This seat is unavailable.");
            suggestedSeat();
        } else {
            seats[row][column] = 1; // 1 sets the seat as reserved
            System.out.println("Your seat has been reserved.");
        }
    }

    // Cancelling Seats
    public void cancellingSeat( int row, int column) {
        if (!seatNum(row, column)) {
            System.out.println("The Seat number does not exist.");
        } else if (seats[row][column] == 0) {
            System.out.println("This seat is not reserved.");
        } else {
            seats[row][column] = 0;
            System.out.println("The reservation has been cancelled.");
        }
    }

    // Main method
    public static void main(String[] args) {
        movieTheater theaterSeating = new movieTheater(5, 5);

        // Seating chart
        System.out.println(("Seating Chart:"));
        theaterSeating.seatingChart();

        // Reserve a seat
        System.out.println(("\nReserving seat (3,2):"));
        theaterSeating.reservedSeat(3,2);
        theaterSeating.seatingChart();

        // reserve a taken one
        System.out.println("\nTrying to reserve seat (3,2):");
        theaterSeating.reservedSeat(3,2);

        // Cancelling
        System.out.println("\nCancelling seat (3,2)");
        theaterSeating.cancellingSeat(3,2);
        theaterSeating.seatingChart();


}
}
