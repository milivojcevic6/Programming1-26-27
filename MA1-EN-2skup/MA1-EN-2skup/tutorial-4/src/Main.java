import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // integer division
//        System.out.println(10/3); // outputs 3
//        System.out.println(10/(double)3); // outputs 3.333333...
//        System.out.println(10/3.0); // outputs 3.333333...
//
//        System.out.println(10%3); // result 1

        // radnom function
//        System.out.println(Math.random());
//        System.out.println(Math.random());
//
//        // call the function
//        int randomNumber = randomIntFromRange(-2,6);
//        System.out.println(randomNumber);
//        System.out.println(randomIntFromRange(-2,6));

//        letters();
//        toCap('g');

//        weather();
//        courseResult(97.8);
//        System.out.println();
//        courseResult(47.8);
//        System.out.println();
//        courseResult(87.8);

//        capLetter('a');
//        capLetter('Z');
//        capLetter('8');
//        capLetter('$');

        // STANDARD INPUT
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // create a game hero
        System.out.println("Please enter name of the hero: ");
        String name = scanner.nextLine();

        // scan int
        System.out.println("Level of hero?");
        int level = scanner.nextInt();

        // scan double
        System.out.println("HP?");
        double HP = scanner.nextDouble();

        //scanner.nextLine();

        // scan char
        System.out.println("Input type: (M - mage, A - archer)");
        //char type = scanner.nextLine().charAt(0);
        char type = scanner.next().charAt(0);






        // print info
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("HP: " + HP);
        System.out.println("Type: " + type);


    }

    // get random integer from some range
    public static int randomIntFromRange(int from, int to){
        int number = 0;

        number = (int) (Math.random() * (to - from + 1)) + from;
        // first expand the range to be of same magnitude
        // cast to int
        // then shift in correct direction

        return number;
    }

    // characters - letters, symbols, digits
    public static void letters(){
        char letter = 'a'; // single quotes ''
        char digit = '9';
        char symbol = '$';
        char space = ' ';

        System.out.println("Letter: " + letter); // "text" + "abc" = "textabc"
        System.out.println("Digit: " + digit);
        System.out.println("ASCII table value for " + digit + " is: " + (int) digit);
        System.out.println("ASCII value of 77 gives this char: " + (char) 77);

    }
    // function that capitalizes the letter
    public static void toCap(char c){
        System.out.println("Capital letter of " + c + " is: " + (char) (c - 32));
    }

    // IF - ELSE - IF - conditional statements

    // method that checks the weather and tells us if we should go out or study
    public static void weather(){
        // TRUE and FALSE  - boolean
        // logical operators
        // AND (&&) - all statements have to be true to return true
        // OR (||) - at least 1 statement should be true
        // NOT (!) - flips the value TRUE -> FALSE and vice versa

        boolean isSunny = true;
        boolean haveHomework = false;

        System.out.println("Is it sunny? " + isSunny);
        System.out.println("Is there a HW? " + haveHomework);

        float temperature = 29.6f;
        boolean isHotEnough = temperature >= 21;// check if temp is at least 21

        System.out.println("Is it hot enough? " + isHotEnough);

        // go out only if it is hot enough sunny day and no HW
        boolean goOutside = isSunny && isHotEnough && !haveHomework;
        System.out.println("Go outside: " + goOutside);
    }

    public static void courseResult(double totalPoints){
        // 95+ for 10
        // 85+ for 9
        // 75+ for 8
        // 65+ for 7
        // everything else is 6
        // 50+ for passing

        // check if student passed the course
        if(totalPoints >= 50){ // condition goes inside ()
            // executed if true
            System.out.println("Congrats! You passed...");

            // if student passed calculate the final grade
            int grade = 0;
            if(totalPoints >= 95) grade = 10;
            else if (totalPoints >= 85) grade = 9; // && totalPoints < 95
            else if (totalPoints >= 75) grade = 8;
            else if (totalPoints >= 65) grade = 7;
            else grade = 6;

            System.out.println("Your final grade is: " + grade);
        }else{
            // execute if false
            System.out.println("Sorry, see you next year :(");
        }
    }

    public static void capLetter(char c){
        // check if small letter and transform to capital
        // 12 < a < 20 not allowed instead 12 < a && a < 20
//        if(c >= 97 && c <= 122){
        if(c >= 'a' && c <= 'z'){
            System.out.println("Capital of " + c + " is: " + (char)(c - 32));
            // if capital transform to lowercase
        }else if(c >= 'A' && c <= 'Z') {
            System.out.println("Lowercase of " + c + " is: " + (char)(c + 32));
        }
        // if digit write its a digit
        else if (c >= '0' && c <= '9') {
            System.out.println(c + " is a digit");
        }
        // else write its nto letter nor digit
        else{
            System.out.println(c + " is not alphanumerical!");
        }
    }




}
