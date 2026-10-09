public class Main {


    // This is an in-line comment
// ctrl + /
    // On today's tutorial
    // we covered methods
    // and comments

    /*

        This is a comment block

     */

    //TODO Don't forget to define method welcome();

    public static void main(){

//        System.out.println("Hello World");
//
//        Main.name();
//        Main.hello("Milan");
//        Main.hello("Aymen");                // ctrl + d
//
////        Main.welcome();
//        System.out.println( Main.welcome() );
//        System.out.println( welcome() );

        Types.overview();

    }

    public static void name(){
        System.out.println("Milan");             // sout
    }

    public static void hello( String name ){
        System.out.print("Hello ");
//        System.out.println("Milan");        // ctrl + /  and ctrl + d
        System.out.println( name );
    }

    public static String welcome(){

        return "Welcome to the University of Primorska";

    }


}
