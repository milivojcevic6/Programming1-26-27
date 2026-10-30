import java.util.Random;
import java.util.Scanner;

public class Helper {
    // GUESS RANDOM NUMBER
    // if user enters somehting smaller tell user
    // if something bigger tell user
    // if correct celebrate

    public static void guessingGame(Scanner sc, Random rand){
        System.out.print("Please enter upper boundary: ");
        int max = sc.nextInt();
        int attempts = 0;
        int randomNumber = rand.nextInt(1,max+1); // random int [1,max]
//        System.out.println("NUMBER: " + randomNumber);
        System.out.println("I picked the number from 1 to " + max + ". Try to guess it!");
        // prompt user to enter number until it is correct
        while (true){
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;
            // check if equal
            if(guess == randomNumber){
                System.out.println("YOU WIN! "+guess+ " was the number I guessed! You did it in " + attempts + " tries!");
                break;
            }else if(guess < randomNumber){
                System.out.println("It is greater, try again!");
            }else {
                System.out.println("It is lower, try again!");
            }
        }
    }

    public static void printCoordinates(int totalRows, int totalCols){
        for (int row = 0; row < totalRows; row++) {
            for (int col = 0; col < totalCols; col++) {
                System.out.print("("+row + "," + col+")");
            }
            System.out.println();
        }
    }

    public static void printMultiplicationTable(int n){
        System.out.println("MULTIPLICATION TABLE " + n + " BY " + n);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }

    public static void exampleA(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i >= j){ // decide when to print #
                    System.out.print(" # ");
                }
            }
            System.out.println();
        }
    }
}
