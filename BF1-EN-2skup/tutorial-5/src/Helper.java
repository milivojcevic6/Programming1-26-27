import java.util.Random;
import java.util.Scanner;

public class Helper {
    // guessing random int from range
    // exit game when correct
    // give hint when its not correct

    public static void guessingGame(Scanner scanner, Random random){
        System.out.print("Please enter upper bound to generate " +
                "random number from 1 to that number: ");
        int max = scanner.nextInt();

        int target = random.nextInt(1,max+1); // random int [1,max]

        System.out.println("I am thinking of a number between 1 and " + max+
                ", try to guess it!");

        //System.out.println("TESTING: " + target);



        // we need infinite loop
//        while (guess != target){ valid way but need to define first guess outside

        int attempts = 0;
        while (true){ // infinite loop bcs true is always true :)
            attempts ++;
            System.out.print("Guess the number: ");
            int guess = scanner.nextInt();

            if(guess == target) {
                System.out.println("Congrats! I was thinking of " + guess +
                        ", you did it in "+ attempts + " tries!");
                break;
            } else if (guess < target) {
                System.out.println("Go higher!");
            } else {
                System.out.println("Go lower!");
            }
        }
    }

    public static void printCoordinates(int totalRows, int totalCols){
        for (int row = 0; row < totalRows; row++) {
            for (int col = 0; col < totalCols; col++) {
                System.out.print("(" + row + "," + col + ")");
            }
            // go to new row
            System.out.println();
        }
    }

    public static void multiplicationTable(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(row + "*" + col + "=" + (row*col) + "\t");

                // 1*1=1 1*2=2
                // 2*1=2 2*2=4 // FOR N=2
            }
            // go to new row
            System.out.println();
        }
    }
    public static void exampleA(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if(row <= col) System.out.print(" # ");
                else System.out.print("   ");

            }
            // go to new row
            System.out.println();
        }
    }

}
