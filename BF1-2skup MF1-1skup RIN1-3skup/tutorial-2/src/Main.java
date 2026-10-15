public class Main {

    // This is an in-line comment
    // In this
    // file, we
    // learned
    // about methods

    /*

    this
    is
    a
    comment
    block

     */

    //TODO Reminder za welcome method

    public static void main(){

        System.out.println( "Hello World" );

        System.out.print("Same line...");
        System.out.println("still the same line");                // ctrl + d

        Main.myName();
        myName();

        hello("Milan");
        hello("prof. Niki");
        hello("TA Kaja");
        hello("TA Bogdan");

//        welcome();
        System.out.println( welcome() );

    }

    private static void myName(){

        System.out.println("Milan");                       // sout

    }

    public static void hello( String name ){

//        System.out.println("Hello Milan");              // ctrl + /
        System.out.println("Hello " + name );

    }

    public static String welcome(){

        return "Welcome to the University of Primorska";

    }

}



