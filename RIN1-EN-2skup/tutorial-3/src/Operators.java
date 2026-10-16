public class Operators {

    /*
    + - * / %
     */


    public static void basicOperators(){

        int a = 7;
        int b = 3;

        System.out.println("a is: "   +    a   );       //ctrl + d
        System.out.println("b is: " + b );
        System.out.println( "a+b is:" + a+b );
        System.out.println( "a+b is:" + (a+b) );
        System.out.println( "a-b is:" + (a-b) );
        System.out.println( "a*b is:" + (a*b) );
        System.out.println( "a/b is:" + (a/b) );
        System.out.println( "a%b is:" + (a%b) );

        int c = 1;
        c++;                // c = c + 1;
        c += 2;             // c = c + 2;
        System.out.println("c is: " + c);
        c--;                // c = c - 1
        --c;                // c = c - 1
        c *= 5;             // c = c * 5
        System.out.println( "c is: " + c );

        int x = 1;
        System.out.println( x );
        System.out.println( x++ );
        System.out.println( x );
        System.out.println( ++x );
    }

    public static void nums(){

//        int a = 8;
//        int b = 5;
        int a = 8, b = 5;

        int c = a + b;
        System.out.println( c );

        c = Math.max(a, b);
        System.out.println( c );

        c = Math.min(a, b);
        System.out.println( c );

        c = (int) Math.pow(a, b);
        System.out.println( c );

        System.out.println( 2.7f );
        System.out.println( (int) 2.7f );
        System.out.println( Math.round(2.7f) );
        System.out.println( Math.round(2.4f) );
        System.out.println( Math.floor(2.7f) );
        System.out.println( Math.ceil(2.4f) );

        System.out.println("Random");
        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.random() );
        System.out.println( Math.random() );

//        System.out.println( Math.random() );
        System.out.println( fromRndmRange(-3,7) );
        System.out.println( fromRndmRange(-3,7) );
        System.out.println( fromRndmRange(-3,7) );
        System.out.println( fromRndmRange(-3,7) );

    }

    /**
    This method return a random integer in the range of from and to parameters.
     @param from is used as a starting point of the range
     @param to is used as a ending point of the range
     */
    private static int fromRndmRange(int from, int to){

        return (int) (Math.random() * (to-from + 1) + from );

    }


}
