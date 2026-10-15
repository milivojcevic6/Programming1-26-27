public class Main {


    // This is an in-line comment
    // Today we are
    // learning
    // about
    // java methods


    /*

    This
    is
    a
    block
    of
    comment

     */

    //TODO Reminder to create welcome method

    public static void main( String[] args ){

        System.out.println( "Hello World" );

        System.out.print( "Ista vrstica..." );
        System.out.println( "se vedno ista" );              // ctrl + d


        Main.myName();
        myName();

        hello("Milan");
        hello("Niki");
        hello("Bogdan");
        hello("Kaja");

//        welcome();                // ctrl + /
        System.out.println( welcome() );

    }


    public static void myName(){

        System.out.println("Milan");

    }

    public static void hello( String name ){

//        System.out.println("Hello Milan");          // sout         // ctrl + /
        System.out.println("Hello " + name );

    }


    public static String welcome(){

        return "Welcome to the University of Primorksa!";
    }




}

