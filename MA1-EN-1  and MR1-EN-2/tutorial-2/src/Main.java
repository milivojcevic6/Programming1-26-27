public class Main {

    // This is an inline comment

    /*

        This is a comment block.
        We can write longer texts inhere

     */

    //TODO Create welocme() method

    public static void main(){

        System.out.println("Hello World");

        Main.name();
        Main.hello("Milan");
        Main.hello("Mark");            // ctrl + d

//        Main.welcome();                   // ctrl + /
        System.out.println( Main.welcome() );
    }

    public static void name(){
        System.out.println("Milan");
    }

    public static void hello( String name ){
        // System.out.println("Hello Milan");
        System.out.print("Hello ");
        System.out.println(name);
//        System.out.println();               // sout
    }


    public static String welcome(){

        return "Welcome to the University of Primorska!";

    }

}



