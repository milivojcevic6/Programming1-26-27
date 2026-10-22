public class Types {


    /*
    Primitive data types:
    int - integer, whole numbers        32b
    long - long, whole numbers          64b
    float -  decimal numbers            32b
    double - decimal numbers            64b
    char - character    'a' 'A' '#' '$' '5' ' '
    boolean - two value:    true/false
     */

    public static void overview(){

        int ocena = 9;
        System.out.println("Moja ocena je: " + ocena );       // sout ctrl + d
        ocena = 10;
        System.out.println("Moja ocena je: " + ocena );
        ocena = ocena - 2;
        System.out.println("Moja ocena je: " + ocena );

    }

    public static void overflow(){

        int max;
        int min;

        max = Integer.MAX_VALUE;
        min = Integer.MIN_VALUE;
        System.out.println("Max je:  " + max );
        System.out.println("Min je: " + min );
        System.out.println("Max + 1 je: " + max + 1 );
        System.out.println("Max + 1 je: " + (max + 1) );
        System.out.println("Max + 5 je: " + (max + 5) );
        System.out.println("Min + 4 je: " + (min + 4) );

    }

}
