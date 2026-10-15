public class Main {


    // This is an in-line comment
    // Today,
    // we are learning
    // methods

    /*

    This
    is
    a
    block
    comment

     */

    //TODO Don't forget to write welcome method


    public static void main(String[] args){

        System.out.println("Hello World!");

        System.out.print("Same line...");              // ctrl + d
        System.out.println("still in the same line");

        Main.myName();
        myName();

        hello("Milan");
        hello("Misha");
        hello("Dzana");

//        welcome();
        System.out.println( welcome() );

        Types.overview();

    }

    public static void myName(){

        System.out.println("Milan");

    }

    public static void hello( String name ){

//        System.out.println("Hello Milan");              // sout             ctrl + /
        System.out.println("Hello " + name + "!");

    }

    public static String welcome(){

        return "Welcome to the University of Primorska!";

    }

}