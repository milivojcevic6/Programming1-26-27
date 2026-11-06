/*
 * Week 2 - Solutions
 * Teden 2 - Resitve
 *
 * Topics / Teme:
 *  - integer division and modulo: quotient and remainder
 *      (celostevilsko deljenje in ostanek)
 *  - floating-point division and type casting
 *      (deljenje z realnimi stevili in pretvorba tipov)
 *  - Math methods: abs, ceil
 *      (metode razreda Math: abs, ceil)
 *  - characters and ASCII arithmetic
 *      (znaki in racunanje z ASCII kodami)
 *  - relational and logical operators: &&, ||, !
 *      (primerjalni in logicni operatorji)
 *  - conditional branching: if, else if, else
 *      (pogojni stavki: if, else if, else)
 *
 * Try to solve Tasks.java on your own first!
 * Najprej poskusi sam/a resiti naloge v Tasks.java!
 */
public class TasksSolved {

    public static void main(String[] args) {

        // ===== Part A: Operators & Arithmetic / Operatorki in aritmetika =====
        System.out.println("--- Task 1: leftoverCandies ---");
        System.out.println(leftoverCandies(25, 4));  // Expected: 1
        System.out.println(leftoverCandies(30, 5));  // Expected: 0
        System.out.println(leftoverCandies(7, 10));  // Expected: 7

        System.out.println("\n--- Task 2: fuelConsumption ---");
        System.out.println(fuelConsumption(45.0, 600.0)); // Expected: 7.5
        System.out.println(fuelConsumption(10.0, 250.0)); // Expected: 4.0

        System.out.println("\n--- Task 3: roundUpBoxes ---");
        System.out.println(roundUpBoxes(10, 4)); // Expected: 3
        System.out.println(roundUpBoxes(12, 4)); // Expected: 3
        System.out.println(roundUpBoxes(1, 5));  // Expected: 1


        // ===== Part B: Math & Characters / Math in znaki =====
        System.out.println("\n--- Task 4: distance1D ---");
        System.out.println(distance1D(3, 10));  // Expected: 7
        System.out.println(distance1D(10, 3));  // Expected: 7
        System.out.println(distance1D(-4, 5));  // Expected: 9

        System.out.println("\n--- Task 5: isCloser ---");
        System.out.println(isCloser(50, 48, 55)); // Expected: true
        System.out.println(isCloser(50, 55, 48)); // Expected: false
        System.out.println(isCloser(10, 8, 12));  // Expected: false

        System.out.println("\n--- Task 6: toLower ---");
        System.out.println(toLower('G')); // Expected: 'g'
        System.out.println(toLower('a')); // Expected: 'a'
        System.out.println(toLower('!')); // Expected: '!'


        // ===== Part C: Conditionals & Logic / Pogojni stavki in logika =====
        System.out.println("\n--- Task 7: inRange ---");
        System.out.println(inRange(15, 10, 20)); // Expected: true
        System.out.println(inRange(10, 10, 20)); // Expected: true
        System.out.println(inRange(25, 10, 20)); // Expected: false

        System.out.println("\n--- Task 8: safeDivisible ---");
        System.out.println(safeDivisible(12, 3)); // Expected: true
        System.out.println(safeDivisible(12, 5)); // Expected: false
        System.out.println(safeDivisible(12, 0)); // Expected: false

        System.out.println("\n--- Task 9: ticketCategory ---");
        System.out.println(ticketCategory(8));   // Expected: Child
        System.out.println(ticketCategory(16));  // Expected: Teen
        System.out.println(ticketCategory(35));  // Expected: Adult
        System.out.println(ticketCategory(70));  // Expected: Senior
        System.out.println(ticketCategory(-2));  // Expected: Invalid

        System.out.println("\n--- Task 10: maxOfThree ---");
        System.out.println(maxOfThree(3, 9, 5)); // Expected: 9
        System.out.println(maxOfThree(7, 7, 2)); // Expected: 7
        System.out.println(maxOfThree(1, 4, 8)); // Expected: 8
    }

    /**
     * Task 1: Return the remainder when totalCandies is divided equally among students.
     */
    public static int leftoverCandies(int totalCandies, int students) {
        return totalCandies % students;
    }

    /**
     * Task 2: Return fuel consumption in liters per 100 km.
     */
    public static double fuelConsumption(double litersUsed, double distanceKm) {
        return (litersUsed / distanceKm) * 100.0;
    }

    /**
     * Task 3: Return the minimum number of boxes needed to pack totalItems.
     */
    public static int roundUpBoxes(int totalItems, int boxCapacity) {
        return (int) Math.ceil((double) totalItems / boxCapacity);
    }

    /**
     * Task 4: Return the non-negative distance between two coordinates on a 1D line.
     */
    public static int distance1D(int x1, int x2) {
        return Math.abs(x1 - x2);
    }

    /**
     * Task 5: Return true if a is strictly closer to target than b is.
     */
    public static boolean isCloser(int target, int a, int b) {
        return Math.abs(target - a) < Math.abs(target - b);
    }

    /**
     * Task 6: If c is an uppercase English letter ('A'-'Z'), return its lowercase version.
     */
    public static char toLower(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32);
        }
        return c;
    }

    /**
     * Task 7: Return true if val is between min and max inclusive.
     */
    public static boolean inRange(int val, int min, int max) {
        return val >= min && val <= max;
    }

    /**
     * Task 8: Return true if num is divisible by divisor (safe against 0).
     */
    public static boolean safeDivisible(int num, int divisor) {
        return divisor != 0 && num % divisor == 0;
    }

    /**
     * Task 9: Return the ticket category based on age.
     */
    public static String ticketCategory(int age) {
        if (age < 0) {
            return "Invalid";
        } else if (age < 12) {
            return "Child";
        } else if (age <= 18) {
            return "Teen";
        } else if (age < 65) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    /**
     * Task 10: Return the largest of three numbers using only if/else.
     */
    public static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
