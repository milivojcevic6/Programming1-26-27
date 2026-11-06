import java.util.Scanner;

/*
 * Week 3 - Solutions
 * Teden 3 - Resitve
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
 * Try to solve Tasks.java on your own first!
 * Najprej poskusi sam/a resiti naloge v Tasks.java!
 */
public class TasksSolved {

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
     */
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Task 2: Return the sum of all positive integers up to n that are divisible by k.
     */
    public static int sumMultiples(int n, int k) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Task 3: Return the count of even integers between start and end inclusive.
     */
    public static int countEvensInRange(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Task 4: Return the smallest power of 2 strictly greater than threshold.
     */
    public static int firstPowerOfTwoAbove(int threshold) {
        int power = 1;
        while (power <= threshold) {
            power *= 2;
        }
        return power;
    }

    /**
     * Task 5: Print numbers from 1 to limit on one line, skipping multiples of skip.
     */
    public static void printSkipping(int limit, int skip) {
        for (int i = 1; i <= limit; i++) {
            if (i % skip == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Task 6: Read integers from sc until a negative integer is entered.
     */
    public static int sumPositiveUntilNegative(Scanner sc) {
        int sum = 0;
        while (true) {
            int val = sc.nextInt();
            if (val < 0) {
                break;
            }
            sum += val;
        }
        return sum;
    }

    /**
     * Task 7: Repeatedly read an integer from sc until it is in [min, max].
     */
    public static int readValidChoice(Scanner sc, int min, int max) {
        int choice;
        do {
            choice = sc.nextInt();
        } while (choice < min || choice > max);
        return choice;
    }

    /**
     * Task 8: Print an N x N square of asterisks with a hollow interior.
     */
    public static void drawHollowSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Task 9: Print an inverted left-aligned triangle of asterisks with size rows.
     */
    public static void drawInvertedTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Task 10: Print a checkerboard of alternating '#' and '.' of given rows and columns.
     */
    public static void drawCheckerboard(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
