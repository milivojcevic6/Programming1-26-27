/*
 * Week 1 - Solutions
 * Teden 1 - Resitve
 *
 * Topics / Teme:
 *  - comments, print vs. println          (komentarji, print in println)
 *  - static methods: void, parameters, return values
 *                                           (staticne metode: void, parametri, vracanje vrednosti)
 *  - primitive data types and variables   (primitivni podatkovni tipi in spremenljivke)
 *
 * Try to solve Tasks.java on your own first!
 * Najprej poskusi sam/a resiti naloge v Tasks.java!
 */
public class TasksSolved {

    public static void main(String[] args) {

        // ===== Part A: Printing / Izpisovanje =====
        System.out.println("--- Task 1 ---");
        printIntro();

        System.out.println("--- Task 2 ---");
        printOnOneLine();

        // ===== Part B: Methods / Metode =====
        System.out.println("--- Task 3 ---");
        greet("Ana");
        greet("Luka");

        System.out.println("--- Task 4 ---");
        greetTwice("Niki");

        System.out.println("--- Task 5 ---");
        System.out.println( favouriteLanguage() );

        System.out.println("--- Task 6 ---");
        System.out.println( fullName("Ada", "Lovelace") );

        System.out.println("--- Task 7 ---");
        System.out.println( introduce("Milan") );

        // ===== Part C: Types and variables / Tipi in spremenljivke =====
        System.out.println("--- Task 8 ---");
        gradeChanges();

        System.out.println("--- Task 9 ---");
        intLimits();

        System.out.println("--- Task 10 ---");
        longLimits();

        System.out.println("--- Task 11 ---");
        decimals();
    }

    /**
     * Task 1: Print two lines:
     *   Programming 1
     *   University of Primorska
     */
    public static void printIntro() {
        System.out.println("Programming 1");
        System.out.println("University of Primorska");
    }

    /**
     * Task 2: Print "Java is fun!" on ONE line,
     * using print three times (one word per call) and then println to end the line.
     */
    public static void printOnOneLine() {
        System.out.print("Java ");
        System.out.print("is ");
        System.out.print("fun!");
        System.out.println();          // ends the line
    }

    /**
     * Task 3: Print "Hello, <name>!"
     */
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    /**
     * Task 4: Greet the same person twice by CALLING greet() (do not use println here).
     */
    public static void greetTwice(String name) {
        greet(name);
        TasksSolved.greet(name);       // calling with the class name works too
    }

    /**
     * Task 5: Return (do not print!) the text "Java".
     */
    public static String favouriteLanguage() {
        return "Java";
    }

    /**
     * Task 6: Return the first and last name joined with a space.
     * fullName("Ada", "Lovelace") -> "Ada Lovelace"
     */
    public static String fullName(String first, String last) {
        return first + " " + last;
    }

    /**
     * Task 7: Return "My name is <name>. " followed by the text returned by welcome().
     * introduce("Milan") -> "My name is Milan. Welcome to the University of Primorska!"
     */
    public static String introduce(String name) {
        return "My name is " + name + ". " + welcome();
    }

    /** Helper method for Task 7 (the same as in the tutorial). */
    public static String welcome() {
        return "Welcome to the University of Primorska!";
    }

    /**
     * Task 8: Create an int variable grade with the value 6 and print it.
     * Change it to 9 and print it. Then decrease it by 2 and print it again.
     * Expected output: 6, 9, 7 (each on its own line).
     */
    public static void gradeChanges() {
        int grade = 6;
        System.out.println(grade);

        grade = 9;
        System.out.println(grade);

        grade = grade - 2;
        System.out.println(grade);
    }

    /**
     * Task 9: Print the smallest and the largest int value and then max + 1.
     * What happens with max + 1? (Hint: int has only 32 bits.)
     */
    public static void intLimits() {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        System.out.println("Min int: " + min);              // -2147483648
        System.out.println("Max int: " + max);              //  2147483647
        System.out.println("Max int + 1: " + (max + 1));    // -2147483648 -> overflow, it "wraps around" to min
    }

    /**
     * Task 10: Print the largest long value.
     * Then store Integer.MAX_VALUE in a long variable and add 1. Is there an overflow now?
     */
    public static void longLimits() {
        long maxLong = Long.MAX_VALUE;
        System.out.println("Max long: " + maxLong);         // 9223372036854775807

        long big = Integer.MAX_VALUE;
        System.out.println("Max int + 1 as long: " + (big + 1));   // 2147483648 -> no overflow, long has 64 bits
    }

    /**
     * Task 11: Create a double variable price = 4.99 and a float variable temperature = 21.5.
     * Print both. Why does the float literal need an f at the end?
     */
    public static void decimals() {
        double price = 4.99;
        float temperature = 21.5f;     // without f the literal is a double and does not fit into a float

        System.out.println("Price: " + price);
        System.out.println("Temperature: " + temperature);
    }
}
