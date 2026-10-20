public class Types {

    /*
    Primitive data types:
    int -       32b
    long -      64b
    float -     32b
    double -    64b
    char - character    'a' 'A' '1' '#' ' '
    boolean - two values: trues/false
     */


    public static void overview(){

        int ocena = 9;
        System.out.println( "Ocena je: " + ocena );             // sout

        ocena = 6;
        System.out.println( "Ocena je: " + ocena );
        ocena = ocena + 4;
        System.out.println( "Ocena je: " + ocena );

    }

    public static void overflow(){

        int max;
        int min;

        max = Integer.MAX_VALUE;
        min = Integer.MIN_VALUE;
        System.out.println("Max je:  " + max );  // ctrl + d
        System.out.println("Min je: " + min );
        System.out.println( "Max + 1 je: " + max + 1 );
        System.out.println( "Max + 1 je: " + (max + 1) );

    }



}
