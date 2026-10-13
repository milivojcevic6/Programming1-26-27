public class Main {


    // This is an in-line comment
    // Today we
    // are
    // learning
    // about
    // java methods

    /*

    This
    is
    a
    comment
    block
     */

    //TODO Don't forget to write welcome method



    public static void main( String[] args ){

        System.out.println( "Hello World!" );

        System.out.print("Same line...");
        System.out.println("still the same line");                // ctrl + d

        Main.myName();
        myName();
        hello("Milan");
        hello("Niki");                                      // ctrl + d
        hello("Kaja");

//        welcome();
        System.out.println( welcome() );
    }

    public static void myName(){

        System.out.println( "Milan" );

    }

    public static void hello( String name ){
//        System.out.println("Hello Milan");              // sout     ctrl + /
        System.out.println("Hello " + name );
    }

    public static String welcome(){

        return "Welcome to the University of Primorska!";

    }


}


