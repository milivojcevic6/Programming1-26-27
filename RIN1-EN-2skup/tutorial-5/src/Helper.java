import java.util.Random;
import java.util.Scanner;

public class Helper {

    // method for guessing number game
    // if user guessed correctly congrats
    // if actual number is bigger than guess tell user
    // same for the other case

    public static void guessingGame(Scanner sc, Random rand){
        System.out.print("Please enter upper bound integer: ");
        int upperBound = sc.nextInt();

        System.out.println("I will think of number from 1 to " + upperBound +
                " and you need to guess it! Good luck!");
        int randomNumber = rand.nextInt(1,upperBound+1);
        int attempts = 0;
        while(true){
            attempts++;
            System.out.println("Guess the number between " +
                    "1 and " + upperBound);
            int guess = sc.nextInt();

            if(guess == randomNumber){
                System.out.println("Congrats! "+ guess +
                        " was correct number in " + attempts + " attempts!!!");
                break; // stop the game
            } else if (guess < randomNumber) {
                System.out.println("Guess higher!");
            } else {
                System.out.println("Guess lower!");
            }
        }
    }

    // print coordinates
    public static void printCoordinates(int totalRows, int totalColumns){
        System.out.println("Coordinates for "+ totalRows + " x " + totalColumns + " matrix");
        for (int row = 0; row < totalRows; row++) {
            for (int col = 0; col < totalColumns; col++) {
                System.out.print("(" + row + "," + col + ")");
            }
            System.out.println();
        }
    }

    public static void multiplicationTable(int n){
        System.out.println("Multiplication table "+ n + " x "+ n);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " * " + j + " = " + (i*j) + "\t");
            }
            System.out.println();
        }
    }
    public static void printSquare(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" # ");
            }
            System.out.println();
        }
    }

    public static void exapmleA(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i >= j) System.out.print(" # ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void exampleI(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean borders = (i == 0 || i == n-1 || j == 0 || j == n-1);// borders up down left right respectfully
                boolean diagonals = (i == j || i+j == n-1); // diagonals main and alternative diagonal respectfully

                if(borders || diagonals){
                    System.out.print(" # ");
                }else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }


}
