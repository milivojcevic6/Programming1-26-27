public class Operators {

    /*
            + - * / %
     */


    public static void basicOperators(){

        int a = 7;
        int b = 3;

        System.out.println( "a je: " + a );
        System.out.println( "b je: " + b );
        System.out.println( "a+b je: " + a + b );
        System.out.println( "a+b je: " + (a + b) );
        System.out.println( "a-b je: " + (a - b) );
        System.out.println( "a*b je: " + (a * b) );
        System.out.println( "a/b je: " + (a / b) );
        System.out.println( "a%b je: " + (a % b) );
    }

    public static void nums(){

//        int a = 8;
//        int b = 5;
        int a = 8, b = 5;

        int c = a + b;
        System.out.println( "c je: " + c);

        c = Math.max(a, b);
        System.out.println( "c je: " + c);

        c = Math.min(a, b);
        System.out.println( "c je: " + c);

        c = (int) Math.pow(a, b);
        System.out.println( "c je: " + c);

        System.out.println( 2.7f );
        System.out.println( (int) 2.7f );
        System.out.println( Math.round(2.7f) );
        System.out.println( Math.round(2.4f) );
        System.out.println( Math.floor(2.7f) );
        System.out.println( Math.ceil(2.4f) );


    }


}
