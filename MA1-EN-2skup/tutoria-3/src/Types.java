public class Types {

    /*
    Primitive data types:
    int - integer, whole numbers    32b
    long - long, whole numbers      64b
    double - decimal numbers        64b
    float - decimal numbers         32b
    char - character 'a' 'A' '#' ' '
    boolean - two values: true/false
     */

    public static void overview(){

        int grade = 6;
        System.out.println("Grade is: " + grade );

        grade = 9;
        System.out.println("Grade is: " + grade );

        grade = grade - 2;
        System.out.println("Grade is: " + grade );

    }

    public static void overflow(){

        int max = Integer.MAX_VALUE;        // ctrl + d
        int min = Integer.MIN_VALUE;

        System.out.println("Max value is: "+ max);  // sout
        System.out.println("Min value is: "+ min);

        System.out.println("Min value + 1 is: "+ (min + 1));
        System.out.println("Min value - 1 is: "+ (min - 1));
        System.out.println("Max value + 1 is: "+ (max + 1));

    }


}









