public class Main {

    // This is an in-line comment
    // In this
    // file we
    // covered
    // methods

    /*

    this
    is
    a
    comment
    block
     */

    //TODO Napisi welcome metodo


    public static void main(){

        System.out.println( "Hello World!" );
        System.out.print("Same line...");                           // ctrl + d
        System.out.println("still the same line.");

        Main.myName();
        myName();
        hello("Milan");
        hello("Niki");
        hello("Kaja");
        hello("Bogdan");
//        welcome();
//        System.out.println( welcome() );
    }

    public static void myName(){

        System.out.println( "Milan" );                             // sout

    }

    private static void hello(  String name   ){

//        System.out.println( "Hello Milan" );                        // ctrl + /
        System.out.println("Hello " + name );
        System.out.println( welcome() );
    }


    public static String welcome(){

        return "Welcome to the University of Primorska!";

    }

}


