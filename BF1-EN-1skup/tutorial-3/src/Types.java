public class Types {

    /*
    Primitive data types:
    int - integer, whole number     32b
    long - long, whole number       64b
    float - decimal number          32b
    double - decimal number         64b
    char - characters  'a' 'A' '#' ' '
    boolean - two value: true/false
     */

    public static void overview(){

        int grade = 6;
        System.out.println("My grade is: " + grade );

        grade = 9;
        System.out.println("My grade is: " + grade );

        grade = grade - 2;
        System.out.println("My grade is: " + grade );

    }

    public static void overflow(){

        int max = Integer.MAX_VALUE;    // ctrl + d
        int min = Integer.MIN_VALUE;

        System.out.println("Max value is: " + max );         // sout
        System.out.println("Min value is: " + min );

        System.out.println( "Max value + 1 is: " + max + 1 );
        System.out.println( "Max value + 1 is: " + (max + 1) );
    }

}
