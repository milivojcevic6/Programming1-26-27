import java.util.Random;
import java.util.Scanner;

public class Helper {
    // game for guessing the number from certain range
    // if correct we exit the game
    // if not we tell user to guess higher or lower

    public static void guessingGame(Scanner scan, Random random){
        System.out.println("Welcome to guess the number game!");
        System.out.print("Please enter upper bound: ");
        int limit = scan.nextInt();

        System.out.println("I am thinking of a number between 1 and "
                + limit + ", I want you to guess it!");
        int target = random.nextInt(1,limit+1); // int [1,limit]
        int attempts = 0;
        while(true){
            attempts++;
            System.out.print("Guess the number: ");
            int guess = scan.nextInt();

            if(guess == target){
                System.out.println("Congrats! I was thinking of "
                        + guess + "! You needed "+ attempts + " attempts!");
                break;
            } else if (guess > target) {
                System.out.println("Go lower!");
            } else{
                System.out.println("Go higher!");
            }
        }
    }

    public static void printCoordinates(int totalRows, int totalCols){
        for (int row = 0; row < totalRows; row++) {
            for (int col = 0; col < totalCols; col++) {
                System.out.print("("+row+","+col+") ");
            }// end of a row
            // go to new line
            System.out.println();
        }
    }

    public static void multiplicationTable(int n){
        System.out.println("Multiplication table "+ n + " by "+ n);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " * "+ j + " = "+ (i*j) + "\t");
            }
            System.out.println();
        }
    }

    public static void exmpleA(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if(i >= j) System.out.print(" # ");
               else System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void exmpleI(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isBorder = (i==0 || i == n-1 || j==0 || j == n-1);
                // borders: top, bottom, left, right
                boolean isDiagonal = (i==j || i+j == n-1);
                // diagonals: main and the other one
                if(isBorder || isDiagonal) System.out.print(" # ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
