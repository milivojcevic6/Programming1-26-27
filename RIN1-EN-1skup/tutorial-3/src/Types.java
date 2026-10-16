public class Types {


    /*

    Primitive data types:
    int - integer, whole numbers    32b
    long - long, whole numbers      64b
    float - float, decimal number   32b
    double - double, decimal number 64b
    char - character  'a' 'b' 'A' 'B' '#' ' '
    boolean - true/false

     */

    public static void overview(){

        int grade = 6;
        System.out.println("Grade is: " + grade );

        grade = 9;
        System.out.println("Grade is: " + grade );

        grade = grade - 2;
        System.out.println("Grade is: " + grade );

        long points = 50L;
        System.out.println(points);

    }

    public static void overflow(){

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        System.out.println("Max value is: " + max );
        System.out.println("Min value is: " + min );

        System.out.println("Max + 1 is: " + (max + 1) );
        System.out.println("Min - 1 is: " + (min - 1) );

        long maxL = Long.MAX_VALUE;
        System.out.println( "Max long value is: " + maxL );                   // sout
        System.out.println("Long max + 1 is: " + (maxL + 1) );


    }


}
