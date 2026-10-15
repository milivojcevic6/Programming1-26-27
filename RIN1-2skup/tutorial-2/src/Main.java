public class Main {


    // This is an in-line comment
    // In this
    // file
    // ,
    // we
    // are
    // learning about methods

    /*

    This
     is
      a
   comment
    block
   */

   //TODO Ne pozabi izpisati welcome metodo

    public static void main( String[] args ){

        System.out.println( "Hello World!" );

        System.out.print("Same line...");                           //  ctrl + d
        System.out.println("still the same line.");

        Main.myName();
        myName();

        hello("Milan");
        hello("Predrag");
        hello("Žan");
        hello("Anja");
        hello("Ana");

//        welcome();
        System.out.println( welcome() );
    }

    /**
     Opis metode
     */
    private static void myName(){

        System.out.println( "Milan" );                                   // sout

    }

    private static void hello( String name ){

//        System.out.println("Hello Milan");          // ctrl + /
        System.out.println("Hello " + name );

    }


    public static String welcome(){

        return "Welcome to the University of Primorska!";
    }


}
