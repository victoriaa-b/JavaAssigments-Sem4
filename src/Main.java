// Calculate the average temperature, and give how many days are above the average temperature
// 1. Take an input from the user (eg 5)
// 2. Prompt the user to enter all the 5 numbers (temperature values)
// 3. Calculate the average temperature
// 4. Given the average temperature, how many of the numbers in the line 2 are above the average temperature?


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // 1. Take the input from the user
        // Need the number of days to work with
        System.out.println("Please enter the total amount of days: ");
        int totalNumOfDays = input.nextInt();

        // array for the temps
        int[] temps = new int[totalNumOfDays];
        int sum = 0;

        // 2. Need user to enter all of the numbers
        System.out.println("Please enter the " + totalNumOfDays + "temperatures value: ");
        for ( imt i = 0; i < totalNumOfDays; i ++) {
            System.out.print("Please enter the temperatures for day " + (i + 1) + ": ");
            temps [i] = input.nextInt();
            sum += temps[i];
        }

        // 3. Calculate the average temp
       // error maybe? double average = (double) sum / totalNumOfDays;




    }
}