public class Types {

    /*
    Primitive data types:
    int - integer, whole number     32b
    long - long, whole number       64b
    float - decimal numbers         32b
    double - decimal numbers        64b
    char - character    'a' 'A' '#' ' ' '2'
    boolean - two values: true/false
     */



    public static void overview(){

        int ocena = 9;

        System.out.println( "Ocena je: " + ocena );       // sout

        ocena = 10;
        System.out.println( "Ocena je: " + ocena );       // ctrl + d
        System.out.println( "Ocena je: " + ocena );       // ctrl + d
        System.out.println( "Ocena je: " + ocena );       // ctrl + d

        ocena = ocena - 2;
        System.out.println( "Ocena je: " + ocena );       // ctrl + d
        System.out.println( "Ocena je: " + ocena );       // ctrl + d
        System.out.println( "Ocena je: " + ocena );       // ctrl + d

    }

    public static void overflow(){

        int max;
        int min;

        max = Integer.MAX_VALUE;
        min = Integer.MIN_VALUE;

        System.out.println( "Max je: " + max );
        System.out.println( "Min je: " + min );
        System.out.println("Max + 1 je: " + max + 1);
        System.out.println("Max + 1 je: " + (max + 1) );
        System.out.println("Max + 5 je: " + (max + 5) );
        System.out.println("Min - 4 je: " + (min + 4) );

    }



}
