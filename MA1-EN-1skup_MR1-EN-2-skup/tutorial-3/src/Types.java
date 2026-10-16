public class Types {

    /*
    Primitive data types:
    int - integer, whole number 32b
    long - long, whole numbers  64b
    double - decimal numbers    64b
    float - decimal numbers     32b
    char - character 'a' 'b' 'A' 'B' '#' ' '
    boolean -  true / false
     */

    public static void overview(){

        int grade;
        grade = 6;
        System.out.println( grade );
        grade = 5 + 3;
        System.out.println( grade );
        grade = grade + 2;
        System.out.println( grade );

    }

    public static void overflow(){

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("Max value is: " + max );
        System.out.println("Min value is: " + min );

        System.out.println("Max value + 1 is: " + (max + 1) );
    }

}
