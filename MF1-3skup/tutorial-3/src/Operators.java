public class Operators {

    /*

    + - * / %

     */

    public static void basicOperators(){

        int a = 7;
        int b = 3;

        System.out.println("a je: " + a);   // sout
        System.out.println("b je: " + b);   // ctrl + d

        System.out.println("a + b je: " + a + b);
        System.out.println("a + b je: " + (a + b) );
        System.out.println("a - b je: " + (a - b) );
        System.out.println("a * b je: " + (a * b) );
        System.out.println("a / b je: " + (a / b) );
        System.out.println("a % b je: " + (a % b) );

    }

    public static void nums(){

//        int a = 8;
//        int b = 5;
        int a = 8, b = 5;

        int c = a + b;
        System.out.println("c je: " + c);

        c =  Math.max(a, b);
        System.out.println("c je: " + c);

        c =  Math.min(a, b);
        System.out.println("c je: " + c);

    }

}
