import java.util.Scanner;

/*
 * Week 3 - Tasks
 * Teden 3 - Naloge
 *
 * Topics / Teme:
 *  - for, while, and do-while loops
 *      (zanke for, while in do-while)
 *  - loop control: break and continue
 *      (krmiljenje zank: break in continue)
 *  - reading user input with Scanner
 *      (branje uporabniskega vnosa z razredom Scanner)
 *  - nested loops and 2D console patterns
 *      (ugnezdene zanke in 2D vzorci na konzoli)
 *
 * Fill in every method marked with TODO, then run main to check your output.
 * Dopolni vse metode oznacene s TODO in pozeni main, da preveris izpis.
 * Solutions / Resitve: TasksSolved.java
 */
public class Tasks {

    public static void main(String[] args) {

        // ===== Part A: Basic Loops / Osnovne zanke =====
        System.out.println("--- Task 1: factorial ---");
        System.out.println(factorial(5)); // Expected: 120
        System.out.println(factorial(3)); // Expected: 6
        System.out.println(factorial(0)); // Expected: 1

        System.out.println("\n--- Task 2: sumMultiples ---");
        System.out.println(sumMultiples(10, 3)); // Expected: 18 (3 + 6 + 9)
        System.out.println(sumMultiples(20, 5)); // Expected: 50 (5 + 10 + 15 + 20)
        System.out.println(sumMultiples(5, 7));  // Expected: 0

        System.out.println("\n--- Task 3: countEvensInRange ---");
        System.out.println(countEvensInRange(3, 8)); // Expected: 3 (4, 6, 8)
        System.out.println(countEvensInRange(2, 6)); // Expected: 3 (2, 4, 6)
        System.out.println(countEvensInRange(7, 7)); // Expected: 0

        System.out.println("\n--- Task 4: firstPowerOfTwoAbove ---");
        System.out.println(firstPowerOfTwoAbove(10)); // Expected: 16
        System.out.println(firstPowerOfTwoAbove(32)); // Expected: 64
        System.out.println(firstPowerOfTwoAbove(0));  // Expected: 1


        // ===== Part B: Loop Control & Scanner / Krmiljenje zank in Scanner =====
        System.out.println("\n--- Task 5: printSkipping ---");
        printSkipping(10, 3); // Expected: 1 2 4 5 7 8 10 
        printSkipping(8, 2);  // Expected: 1 3 5 7 

        System.out.println("\n--- Task 6: sumPositiveUntilNegative ---");
        Scanner testSc1 = new Scanner("5 10 3 -1");
        System.out.println(sumPositiveUntilNegative(testSc1)); // Expected: 18

        System.out.println("\n--- Task 7: readValidChoice ---");
        Scanner testSc2 = new Scanner("0 9 3"); // 0 and 9 are invalid, 3 is valid in [1, 5]
        System.out.println(readValidChoice(testSc2, 1, 5)); // Expected: 3


        // ===== Part C: Nested Loops / Ugnezdene zanke =====
        System.out.println("\n--- Task 8: drawHollowSquare (4) ---");
        drawHollowSquare(4);

        System.out.println("\n--- Task 9: drawInvertedTriangle (4) ---");
        drawInvertedTriangle(4);

        System.out.println("\n--- Task 10: drawCheckerboard (3, 5) ---");
        drawCheckerboard(3, 5);
    }

    /**
     * Task 1: Return the factorial n! (1 * 2 * ... * n).
     * For n = 0, return 1.
     * factorial(5) -> 120
     */
    public static int factorial(int n) {
        // TODO
        return 0;
    }

    /**
     * Task 2: Return the sum of all positive integers up to n that are divisible by k.
     * sumMultiples(10, 3) -> 18  (3 + 6 + 9)
     * sumMultiples(5, 7)  -> 0
     */
    public static int sumMultiples(int n, int k) {
        // TODO
        return 0;
    }

    /**
     * Task 3: Return the count of even integers between start and end inclusive.
     * countEvensInRange(3, 8) -> 3  (4, 6, 8)
     * countEvensInRange(7, 7) -> 0
     */
    public static int countEvensInRange(int start, int end) {
        // TODO
        return 0;
    }

    /**
     * Task 4: Return the smallest power of 2 strictly greater than threshold.
     * firstPowerOfTwoAbove(10) -> 16
     * firstPowerOfTwoAbove(32) -> 64
     */
    public static int firstPowerOfTwoAbove(int threshold) {
        // TODO
        return 0;
    }

    /**
     * Task 5: Print numbers from 1 to limit on one line separated by spaces,
     * skipping any number divisible by skip. End with a newline.
     * printSkipping(10, 3) -> 1 2 4 5 7 8 10 
     */
    public static void printSkipping(int limit, int skip) {
        // TODO
    }

    /**
     * Task 6: Read integers from sc until a negative integer is entered.
     * Return the sum of all positive integers read before the negative one.
     */
    public static int sumPositiveUntilNegative(Scanner sc) {
        // TODO
        return 0;
    }

    /**
     * Task 7: Repeatedly read an integer from sc until the value is between
     * min and max inclusive, then return that value.
     */
    public static int readValidChoice(Scanner sc, int min, int max) {
        // TODO
        return 0;
    }

    /**
     * Task 8: Print an N x N square of asterisks with a hollow interior
     * (asterisks on the outer border, spaces inside).
     *
     * Example size = 4:
     * * * * *
     * *     *
     * *     *
     * * * * *
     */
    public static void drawHollowSquare(int size) {
        // TODO
    }

    /**
     * Task 9: Print an inverted left-aligned triangle of asterisks with size rows.
     *
     * Example size = 4:
     * * * * *
     * * * *
     * * *
     * *
     */
    public static void drawInvertedTriangle(int size) {
        // TODO
    }

    /**
     * Task 10: Print a checkerboard of alternating '#' and '.' of given rows and columns.
     * The top-left character (row 0, col 0) must be '#'.
     *
     * Example rows = 3, cols = 4:
     * # . # .
     * . # . #
     * # . # .
     */
    public static void drawCheckerboard(int rows, int cols) {
        // TODO
    }
}
