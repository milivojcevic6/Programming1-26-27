public class Main2 {


    // In-line comment
    // Tutorial 1
    // On the first tutorial
    // we are covering methods

    /*
        This is a block comment.
        Everything we write here
        will be a comment

     */

    public static void main() {

//        System.out.println("Hello World");            // ctrl + /

//        System.out.println("Same line...");
//        System.out.print("still in the same line");       // ctrl + d

//        Main2.name();
//        name();
//
//        hello("Andrej");

//        welcome();

//        System.out.println( welcome() );

        Types.overview();

    }


    public static void name(){

        System.out.println("Hi! Milan here.");

    }

    public static void hello( String name ){

//        System.out.println("Hello Milan");                       // sout
        System.out.println("Hello " + name );                       // sout

    }

    public static String welcome(){

        return "Welcome to the University of Primorska!";

    }


}
