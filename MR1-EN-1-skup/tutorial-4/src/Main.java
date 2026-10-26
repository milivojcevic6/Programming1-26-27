import java.util.Scanner;

public class Main {
    static void main(String[] args) {
//        System.out.println(10/3); // 3 - integer division
//        System.out.println((double) 10 / 3); // 3 - integer division
//        System.out.println(10.0 / 3);
//        System.out.println(10f / 3);
//        System.out.println(10 * 1.0 / 3);

//        System.out.println(10%3); // reminder of int division
//        letters();
//    toCap('z');
//        weather();
//        System.out.println(26>20); prints true
//        getFinalGrade(98);
//        System.out.println();
//        getFinalGrade(49);
//        System.out.println();
//        getFinalGrade(49);
//        toCapital('a');
//        toCapital('A');
//        toCapital('8');
//        toCapital('$');
        createGameHero();
    }

    // characters (char) - letter, digit, any other symbol
    static void letters(){
        char letter = 'b';
        char digit = '2';
        char symbol = '&';
        char space = ' '; // chars always '' strings always ""

        System.out.println("Letter b: " + letter);
        System.out.println("ASCII table value of letter " + letter + " is " + (int) letter);
        System.out.println("ASCII table value 120 corresponds to char " + (char) 120);
    }

    static void toCap(char c){
        System.out.println("Capital letter from " + c + " is " + (char)(c - 32));
    }

    // IF - ELSE - IF (conditional statements, conditions)
    // boolean values TRUE and FALSE
    // logical operators
    // AND (&&) - all conditions must be true
    // OR (||) - at least one condition should be true
    // NOT (!) - flip/negate the value (true becomes false and vice versa)

    // method should help us decide if we should go out or study
    public static void weather(){
        boolean isSunny = true;
        boolean haveHomework = false;

        System.out.println("Is it sunny? " + isSunny);
        System.out.println("Do we have HW? " + haveHomework);

        double temperature = 26.8d;
        boolean isHot = temperature >= 20;// it is hot if its more than 20 degrees Celsius

        System.out.println("Is hot enough? " + isHot);
        // go out only if hot sunny day and no HW
        boolean goOut = isHot && isSunny && !haveHomework;
        System.out.println("Go out: "+ goOut);
    }

    static void getFinalGrade(double totalPoints){
        // first check if the course is passed
        // needed points 50+
        if (totalPoints >= 50) { //condition goes in ()
            // if true we do this
            System.out.println("Congats!");

            // if passed calculate final grade
            // 95+ for 10
            // 85+ for 9
            // 75+ for 8
            // rest is 6
            int grade = 0;
            if (totalPoints >= 95) grade = 10;
            else if(totalPoints >= 85) grade=9;
            else if(totalPoints >= 75) grade=8;
            else grade = 6;

            System.out.println("Your grade: " + grade);
        }else{
            // if false we do this
            System.out.println("Sorry, see you next year :(");
        }
    }

    public static void toCapital(char c){
        // if lowercase make it upper
        if(c >= 97 && c <= 122) toCap(c);
        // if upper make it lowercase
        else if (c >= 'A' && c <= 'Z') System.out.println("Lowercase letter from " + c + " is " + (char)(c + 32) );
        // if digit just print
        else if (c >= '0' && c <= '9') {
            System.out.println(c + " is a digit");
        }
        // else say it is not letter nor digit
        else System.out.println(c + " is not a letter nor digit");
    }

    // STANDARD INPUT
    public static void createGameHero(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give hero a name: ");
        String name = scanner.nextLine();

        System.out.println("Enter level:");
        int level = scanner.nextInt();

        System.out.println("Enter HP:");
        double HP = scanner.nextDouble();

        // fix issue of nextLine() using \n left from nextDouble()
//        scanner.nextLine();

        System.out.println("Enter type: M-mage, A-archer");
//        char type = scanner.nextLine().charAt(0);
        char type = scanner.next().charAt(0);

        System.out.println("NAME: "+ name);
        System.out.println("LEVEL: "+ level);
        System.out.println("HP: "+HP);
        System.out.println("Type: " + type);

    }
}
