public class Types {

    /*
    Primitive data types:
    int - integer,  whole number    32b
    long - long,    whole number    64b
    float - decimal number          32b
    double - decimal number         64b
    char - character  'a' 'A' '#' '$' ' '
    boolean - two values: true/false
     */


    public static void overview(){

        int ocena = 7;
        System.out.println("Ocena je: " + ocena );      // sout ctrl + d

        ocena = 9;
        System.out.println("Ocena je: " + ocena );
        ocena = ocena + 1;
        System.out.println("Ocena je: " + ocena );

    }


    public static void overflow(){

        int max;
        int min;

        max = Integer.MAX_VALUE;
        min = Integer.MIN_VALUE;
        System.out.println("Max je:  " + max );  // ctrl + d
        System.out.println("Min je: " + min );
        System.out.println("Max + 1 je: " + max + 1);
        System.out.println("Max + 1 je: " + (max + 1) );
        System.out.println("Max + 5 je: " + (max + 5) );
        System.out.println("Min + 4 je: " + (min + 4) );

    }


}
