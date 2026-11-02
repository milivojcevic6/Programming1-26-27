import java.util.Random;
import java.util.Scanner;

public class Helper {
    // guessing number game
    // exit game when user guesses correctly
    // give hint when it makes mistake

    public static void guessingGame(Scanner scanner, Random random){
        System.out.print("Give me upper limit: ");
        int max = scanner.nextInt();

        int target = random.nextInt(1,max+1); // int [1,max]
        System.out.println("I am thinking of a number between 1 and "
        + max + " , try to guess it!");

//        System.out.println("TARGET: " + target);
        int attempts = 0;
        while (true){

            attempts++;
            System.out.print("Please enter a number: ");
            int guess = scanner.nextInt();

            // compare guess and target
            if(guess == target){
                System.out.println("Good job! I was thinking of " + guess +
                        "! You did it in " + attempts + "tries!");
                break;
            }else if(guess < target) System.out.println("Go higher!");
            else  System.out.println("Go lower!");

        }
    }

    public static void printCoordinates(int totalRows, int totalCols){
        for (int row = 0; row < totalRows; row++) {
            for (int col = 0; col < totalCols; col++) {
                System.out.print("(" + row + "," + col +")");
            }// go to new line/row
            System.out.println();
        }
    }

    public static void multiplicationTable(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // 1*1=1 1*2=2
                // 2*1=2 2*2=4 // for n=2
                System.out.print(i + "*" + j + "=" + (i*j) + "\t");
            }// go to new line/row
            System.out.println();
        }
    }


    public static void exampleA(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i >= j)System.out.print(" # ");
                else System.out.print("   ");
            }// go to new line/row
            System.out.println();
        }
    }

    public static void exampleI(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean borders = i == 0 || i == n-1 || j == 0 || j == n- 1;
                // upper, lower, left, right respectfuly
                boolean diagonals = i == j || i + j == n-1;
                if(borders || diagonals) System.out.print(" # ");
                else System.out.print("   ");
            }// go to new line/row
            System.out.println();
        }
    }

}
