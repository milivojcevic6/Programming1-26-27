public class Main {

    // This is an in-line comment
    // In this code we are learning abouut methods


    // in this Main class
    // we are covering examples
    // of comments as well

    /*

    all
    of
    this
    is
    a
    comment
    block

     */


    //TODO Over here add method myName();


    public static void main() {

//        System.out.println("Hello World!");

//        System.out.print("Same line...");             // ctrl + /
//        System.out.print("still the same one.");


        Main.myName();
        myName();                       // ctrl + d
        hello("Hamza");
//        welcome();
        System.out.println( welcome() );        // sout

        Types.overview();

    }

    public static void myName(){

        System.out.println("Milan");

    }

    public static void hello( String name ){

//        System.out.println("Hello Milan");      // sout
        System.out.println("Hello " + name );      // sout

    }

    public static String welcome(){

        return "Welcome to the University of Primorska!";

    }


}

