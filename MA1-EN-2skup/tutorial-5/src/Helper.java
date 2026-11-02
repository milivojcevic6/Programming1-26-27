import java.util.Random;
import java.util.Scanner;

public class Helper {
    // game in which we have to
    // guess a random number form certain range
    // we get hint if number is less or more
    // than our guess

    public static void guessingGame(Scanner scanner, Random random){
        // we will need input
        System.out.println("Please enter upper value: ");
        int max = scanner.nextInt();

        System.out.println("I am thinking of a int number from 1 to "+ max +
                " try to guess it!");

        int target = random.nextInt(1, max + 1); // random int [1,max]

        // infinite loop - that we exit only when guess it correct
        int attempts = 0;
        while (true){
            attempts++;
            System.out.println("Please guess the number between 1 and " + max + ": ");
            int guess = scanner.nextInt();

            // compare guess and target
            if(guess > target){
                System.out.println("Go lower!!!");
            }else if(guess < target){
                System.out.println("Go higher!!!");
            }else{
                // if it is not geater nor lower it must be equal
                System.out.println("Congrats!!! I was thinking of " + guess + "!!!" +
                        " You did it in " + attempts + " attempts!!!");
                break; // finish the game (exit the loop)
            }
        }



    }
    //        if()
    //            if()
    //                if() // nested ifs

    // NESTED LOOPS
    public static void printCoordinates(int totalRows, int totalCols){
        for (int row = 0; row < totalRows; row++) { // outer loops - used for rows
            for (int col = 0; col < totalCols; col++) {// inner loops - used for cols
                System.out.print("(" + row + "," + col + ")");
                //System.out.printf("gasfvjasj %.1f");
            }
            System.out.println();
        }
    }

    // Multiplication table
    public static void multTable(int n){
        // 1 * 1 = 1 1 * 2 = 2
        // 2 * 1 = 2 2 * 2 = 4
        // for n = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " * "+ j + " = " + (i*j) + "\t");
            }
            System.out.println(); // go to next row/line
        }
    }

    public static void exampleA(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j <= i) System.out.print(" # ");
                else System.out.print("   ");
            }
            System.out.println(); // go to next row/line
        }
    }
}
