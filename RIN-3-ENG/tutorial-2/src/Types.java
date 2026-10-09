public class Types {

    /*

    Primitive data types:

    int - integer, whole numbers    32b
    long - long, whole numbers      64b
    double - decimal numbers        64b
    float - decimal numbers         32b


     */

    public static void overview(){

        int grade = 6;
        System.out.println(grade);

        grade = grade + 3;
        System.out.println( grade);

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        System.out.println("Min value is " + min );
        System.out.println("Max value is " + max );
        System.out.println("Max value - 1 is " + ( max - 1 ) );
        System.out.println("Max value + 1 is " + ( max + 1 ) );
    }

}
