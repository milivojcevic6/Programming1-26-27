public class Operators {

    /*
    + - * / %
     */



    public static void basicOperators(){

        int a = 7;
        int b = 3;

        System.out.println( "a is: " + a);       // sout
        System.out.println( "b is: " + b);       // ctrl + d

        System.out.println( "a+b is: " + a + b );
        System.out.println( "a+b is: " + (a + b) );
        System.out.println( "a-b is: " + (a - b) );
        System.out.println( "a*b is: " + (a * b) );
        System.out.println( "a/b is: " + (a / b) );
        System.out.println( "a%b is: " + (a % b) );

    }

    public static void nums(){

//        int a = 8;
//        int b = 5;
        int a = 8, b = 5;

        int c = a + b;
        System.out.println("c is: " + c);

        c = Math.max( a, b);
        System.out.println("c is: " + c);

        c = Math.min( a, b);
        System.out.println("c is: " + c);

        c = (int) Math.pow( a, b);
        System.out.println("c is: " + c);

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

        // -3 and 7 should be included. and random number int
        System.out.println( rndmFromRange(-3, 7) );
        System.out.println( rndmFromRange(-3, 7) );
        System.out.println( rndmFromRange(-3, 7) );
        System.out.println( rndmFromRange(-3, 7) );
        System.out.println( rndmFromRange(-3, 7) );
    }

    private static int rndmFromRange(int from, int to){

        return  (int) (Math.random() * (to - from + 1)) + from;

    }

}
