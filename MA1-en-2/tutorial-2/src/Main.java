public class Main {


    // This is an inline comment
    // Today we are covering
    // methods and
    // comments

    /*

    This
    is
    a
    comment
    block
     */


    //TODO Reminder to create welcome method

    public static void main(String[] args){

        System.out.println("Hello World!");

        System.out.print("Same line...");
        System.out.println("still in the same line");

        Main.myName();
        Main.hello("Milan");
        Main.hello("Stefan");                // ctrl + d
        Main.hello("Niki");
        Main.hello("Bogdan");

//        Main.welcome();                               // ctrl + /
        System.out.println( Main.welcome() );         // sout
        System.out.println( welcome() );         // ctrl + d

    }


    public static void myName(){

        System.out.println("Milan");

    }

    public static void hello( String name ){

//        System.out.println("Hello Milan");                   // ctrl + /
        System.out.println("Hello "+name);                   // sout

    }

    public static String welcome(){

        return "Welcome to the University of Primorska!";

    }


}
