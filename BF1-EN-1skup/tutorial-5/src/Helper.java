import java.util.Random;
import java.util.Scanner;

public class Helper {
    // random int guessing game
    // exit game when users guesses correctly
    // give hint when it misses

    public static void guessingGame(Scanner scanner, Random random){
        System.out.print("Please enter upper bound: ");
        int max = scanner.nextInt();

        int target = random.nextInt(1,max+1); // random int [1,max]
        System.out.println("I am thinking of a number from 1 to "
                + max + ", try to guess it!");

        //System.out.println("TARGET: "+ target);
        int attempts = 0;
        while (true){
            attempts++;
            System.out.println("Please guess the number: ");
            int guess = scanner.nextInt();

            if(guess == target) {
                System.out.println("Congrats! I was thinking of " + guess +
                        ". Number of guesses: "+ attempts);
                break;
            } else if (guess < target) {
                System.out.println("Go higher!");
            } else{
                System.out.println("Go lower!");
            }

        }
        System.out.println("GAME ENDED");

    }

    public static void printCoordinates(int totalRows, int totalCols){
        for (int row = 0; row < totalRows; row++) {// one row of coordinates
            for (int col = 0; col < totalCols; col++) { // one column
                System.out.print("(" + row + "," + col + ")");
            }// start new row
            System.out.println();
        }
    }

    public static void multiplicationTable(int n){
        for (int row = 1; row <= n; row++) {// one row of coordinates
            for (int col = 1; col <= n; col++) { // one column
                System.out.print(row + "*" + col + "=" + (row*col) + "\t");
            }// start new row
            System.out.println();
        }
    }
    
    public static void exampleA(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i >= j) System.out.print(" # ");
                else System.out.print("   ");
            }// go to new row/line
            System.out.println();
        }
    }
}
