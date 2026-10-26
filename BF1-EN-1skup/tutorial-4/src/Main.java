import java.util.Scanner;

public class Main {
    static void main(String[] args) {
//        System.out.println(10/3); // 3 integer division
//        System.out.println(10/3d); // we need to cast 1 of them
//        System.out.println(10/3.0);
//        System.out.println(10/(double)3);
//
//        System.out.println(10%3); // modulo reminder of division

//        System.out.println(Math.random());
//        System.out.println(Math.random());
//        System.out.println(randomIntFromRange(-3,7));
//        System.out.println(randomIntFromRange(-3,7));
//        System.out.println(randomIntFromRange(-3,7));
//        letters();
//        toCap('z');
//        weather();
//        calculateGrade(98.7);
//        System.out.println();
//        calculateGrade(49);
//        System.out.println();
//        calculateGrade(76);
//        toCapital('A');
//        toCapital('s');
//        toCapital('7');
//        toCapital(')');
        // STANDARD INPUT
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // create a game hero
        System.out.println("Give hero a name: ");
        String name = scanner.nextLine();

        System.out.println("How old is the hero?");
        int age = scanner.nextInt();

        System.out.println("HP?");
        double HP = scanner.nextDouble();

//        scanner.nextLine(); // reads \n
        // scan char
        System.out.println("Type: A-archer, M-mage");
//        char type = scanner.nextLine().charAt(0);
        char type = scanner.next().charAt(0);

        System.out.println("Name: " + name);
        System.out.println("Age: " +age);
        System.out.println("HP: "+ HP);
        System.out.println("Type: " + type);
    }

    // method that gives us random integer from some range e.g. [3,7]
    public static int randomIntFromRange(int from, int to){
        int number = 0;
        number =  (int)(Math.random() * (to - from + 1)) + from;
        return number;
    }

    // characters - letter, digit, other symbols of lenght 1
    public static void letters(){
        char letter = 'a'; // "some text"
        char digit = '1';
        char symbol = '$';
        char space = ' ';

        System.out.println("Letter: " + letter);
        System.out.println("ASCII table value of digit " + digit + " is " + (int) digit); // cast char to int
        System.out.println("ASCII table value 120 is this char " + (char) 120); // cast int to char
    }

    // method that makes small letter capital
    public static void toCap(char c){
        System.out.println("Capital letter of " + c + " is " + (char)(c - 32));
    }

    // IF - ELSE -IF (conditional statements, conditions)

    // boolean values - TRUE and FALSE
    // LOGIC OPERATORS
    // AND (&&) - true only when all conditions are true
    // OR (||) - true if at least one condition is true
    // NOT (!) - negate/flip the value form True to False and vice versa

    public static void weather(){
        // this method helps us decide if we should go out or study
        boolean isSunny = true;
        boolean haveHomework = false;

        System.out.println("Is it sunny? " + isSunny);
        System.out.println("Have HW? " + haveHomework);

        double temperature = 26.2d;
        // we say its hwo if more than 22 degrees
        boolean isHot = temperature > 22; // 16.2 > 22 = false

        System.out.println("Hot enough? " + isHot);

        // go out if hot sunny day and no HW
        boolean goOut = isSunny && isHot && !haveHomework;
        System.out.println("Go out? "+ goOut);
    }
    //calculate final grade for course based on total points
    public static void calculateGrade(double totalPoints){
        // first check if course is passed
        // if at least 50 points
        if (totalPoints >= 50){ // condition goes in ()
            // passed - executed when true
            System.out.println("Congrats!");
            // if passed calculate the grade
            // 95+ for 10
            // 85+ for 9
            // 75+ for 8
            // rest is 6
            int grade = 0;
            if (totalPoints >= 95) grade = 10;
            else if (totalPoints >= 85) grade = 9;
            else if (totalPoints >= 75) grade = 8;
            else grade = 6;

            System.out.println("Grade: " + grade);

        }else{
            // failed - executed when false
            System.out.println("Sorry, see you next time :(");
        }
    }

    public static void toCapital(char c){
        // if small letter make it big
        if(c >= 97 && c <= 122) toCap(c);
        // if big letter make it small
        else if (c >= 'A' && c <= 'Z') System.out.println("Lower case of " + c + " is " + (char)(c + 32));
        // if digit print it
        else if (c >= '0' && c <= '9') System.out.println(c + " is a digit");
        // else say not a digit or letter
        else System.out.println(c + " is not a letter nor digit");
    }


}
