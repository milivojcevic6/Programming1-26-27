/*
 * Week 2 - Tasks
 * Teden 2 - Naloge
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
 * Fill in every method marked with TODO, then run main to check your output.
 * Dopolni vse metode oznacene s TODO in pozeni main, da preveris izpis.
 * Solutions / Resitve: TasksSolved.java
 */
public class Tasks {

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
     * leftoverCandies(25, 4) -> 1
     */
    public static int leftoverCandies(int totalCandies, int students) {
        // TODO
        return 0;
    }

    /**
     * Task 2: Return fuel consumption in liters per 100 km.
     * Formula: (litersUsed / distanceKm) * 100.0
     * fuelConsumption(45.0, 600.0) -> 7.5
     */
    public static double fuelConsumption(double litersUsed, double distanceKm) {
        // TODO
        return 0.0;
    }

    /**
     * Task 3: Return the minimum number of boxes needed to pack totalItems,
     * where each box holds up to boxCapacity items.
     * roundUpBoxes(10, 4) -> 3
     * roundUpBoxes(12, 4) -> 3
     */
    public static int roundUpBoxes(int totalItems, int boxCapacity) {
        // TODO
        return 0;
    }

    /**
     * Task 4: Return the non-negative distance between two coordinates on a 1D line.
     * distance1D(3, 10) -> 7
     * distance1D(-4, 5) -> 9
     */
    public static int distance1D(int x1, int x2) {
        // TODO
        return 0;
    }

    /**
     * Task 5: Return true if a is strictly closer to target than b is.
     * isCloser(50, 48, 55) -> true
     * isCloser(10, 8, 12)  -> false
     */
    public static boolean isCloser(int target, int a, int b) {
        // TODO
        return false;
    }

    /**
     * Task 6: If c is an uppercase English letter ('A'-'Z'), return its lowercase version.
     * Otherwise, return c unchanged.
     * toLower('G') -> 'g'
     * toLower('!') -> '!'
     */
    public static char toLower(char c) {
        // TODO
        return c;
    }

    /**
     * Task 7: Return true if val is between min and max inclusive.
     * inRange(15, 10, 20) -> true
     * inRange(25, 10, 20) -> false
     */
    public static boolean inRange(int val, int min, int max) {
        // TODO
        return false;
    }

    /**
     * Task 8: Return true if num is divisible by divisor.
     * If divisor is 0, return false without crashing.
     * safeDivisible(12, 3) -> true
     * safeDivisible(12, 0) -> false
     */
    public static boolean safeDivisible(int num, int divisor) {
        // TODO
        return false;
    }

    /**
     * Task 9: Return the ticket category based on age:
     *   age < 0   -> "Invalid"
     *   age < 12  -> "Child"
     *   age <= 18 -> "Teen"
     *   age < 65  -> "Adult"
     *   age >= 65 -> "Senior"
     */
    public static String ticketCategory(int age) {
        // TODO
        return "";
    }

    /**
     * Task 10: Return the largest of three numbers using only if/else (do not use Math.max).
     * maxOfThree(3, 9, 5) -> 9
     */
    public static int maxOfThree(int a, int b, int c) {
        // TODO
        return 0;
    }
}
