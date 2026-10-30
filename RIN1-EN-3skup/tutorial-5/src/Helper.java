import java.util.Random;
import java.util.Scanner;

public class Helper {
    // create number guessing game
    // if correct guess we are done
    // if less than result we tell user
    // same if more than result

    public static void guessingGame(Scanner sc, Random rand){
        System.out.println("Welcome to Guess the Number game!");
        System.out.print("Choose upper bound: ");
        int max = sc.nextInt();

        // generate number int [1,max]
        int target = rand.nextInt(1,max+1);
        //System.out.println(target); // testing

        System.out.println("I am thinking of 1 number from 1 to "
                + max + ", try to guess it!");
        int attempts = 0;
        while(true){ // run infinitely until we guess the number
            attempts++;
            System.out.print("Guess the number: ");
            int guess = sc.nextInt();

            if(guess == target){
                System.out.println("Congrats, "+ guess + " was correct!" +
                        " You did it in "+ attempts + " attempts!");
                break;
            }else if(guess < target){
                System.out.println("Go higher!");
            }else{
                System.out.println("Go lower!");
            }

        }

    }

    public static void printCoordinates(int totalRows, int totalCols){
        for (int row = 0; row < totalRows; row++) {
            for (int col = 0; col < totalCols; col++) {
                System.out.print("(" + row + ","+ col+ ")");
            }
            System.out.println();
        }
    }

    public static void multiplicationTable(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " * " + j + " = " + (i*j) + "\t");
            }
            System.out.println();
        }
    }

    public static void exapmleA(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j<=i) System.out.print(" # ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void exapmleI(int n){
        System.out.println();
        System.out.println("EXAMPLE I");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isBorders = (i == 0 || j == 0 || i == n-1 || j == n-1); // whole box
                // upper, left, bottom, right border respectfully
                boolean isDiagonal = (i == j || i == n - j - 1); // main, cross diagonal respectfully
                if(isBorders || isDiagonal) System.out.print(" # ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
