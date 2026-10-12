public class Main {


    // This is an in-line comment
    // Today we are
    // learning
    // about methods

    /*

    this
    is
    a
    comment
    block

     */

    //TODO Reminder to write welcome method


    public static void main(String[] args){

        System.out.println("Hello World");
        System.out.print("Same line...");
        System.out.println("still the same line.");               // ctrl + d


        Main.myName();
        myName();

        hello("Milan");                     // ctrl + d
        hello("Bogdan");
        hello("Niki");

//        welcome();
        System.out.println( welcome() );
    }

    public static void myName(){

        System.out.println("Milan");                                   // sout

    }

    public static void hello( String name ){
//        System.out.println("Hello Milan");                          // ctrl + /
        System.out.println("Hello " + name + "!" );                   // ctrl + /
    }

    public static String welcome(){

        return "Welcome to the University of Primorska!";

    }

}

