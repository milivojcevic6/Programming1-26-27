public class Main {


    // This is an in-line comment
    // Today we
    // are learning
    // about
    // methods

    /*
    This
    is
    a
    comment
    block
     */


    //TODO Ne pozabi izpisati welcome metodo


    public static void main(){

        System.out.println( "Hello World" );

        System.out.print("Same line...");
        System.out.println("still the same line");

        Main.myName();
        myName();                                          // ctrl + d

        hello("Milan");
        hello("Sofija");
        hello("Tea");
        hello("Niki");

//        welcome();
        System.out.println( welcome() );
    }

    /**
    Metoda tiska ime
     */
    public static void myName(){

        System.out.println("Milan");                           // sout

    }

    private static void hello(  String  name  ){

//        System.out.println( "Hello Milan" );                  // ctrl + /
        System.out.println("Hello " + name );

    }

    public static String welcome(){

        return "Welcome to the University of Primorska!";

    }


}
