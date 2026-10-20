public class Types {

    /*

    Primitive data type:
    int - integer, whole number         32b
    long - long, whole number           64b
    float - decimal number              32b
    double - decimal number             64b
    char - character    'a' 'A' '#' ' '
    boolean - two value: true/false

     */



    public static void overview(){

        int ocena = 9;
        System.out.println("Ocena je: " + ocena );       // ctrl + d

        ocena = 10;
        System.out.println("Ocena je: " + ocena );       // sout

        ocena = ocena - 2;
        System.out.println("Ocena je: " + ocena );       // ctrl + d
        System.out.println("Ocena je: " + ocena );       // ctrl + d

    }


    public static void overflow(){

        int max;
        int min;

        max = Integer.MAX_VALUE;
        min = Integer.MIN_VALUE;

        System.out.println("Max je: " + max );      // ctrl + d
        System.out.println("Min je: " + min );
        System.out.println("Max + 1 je: " + max + 1 );
        System.out.println("Max + 1 je: " + (max + 1) );

    }


}
