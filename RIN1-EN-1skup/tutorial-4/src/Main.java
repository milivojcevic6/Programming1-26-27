import java.util.Scanner;

public class Main{
    public static void main(String[] args){
//        System.out.println(10/3); // integer division
//        System.out.println(10.0/3);
//        System.out.println((double)10/3);
//
//        System.out.println(10%3); // modulo operator
//
//        letters();
//        toCap('c');
//        toCap('g');

        // weather method
//        weather();

        // final grade
        courseGrade(99);
//        transformChar('a');
//        transformChar('B');
        transformChar('8');
//        transformChar('$');

        //createCharacter();

        System.out.println(randomFromRange(1,5));
        System.out.println(randomFromRange(1,5));

    }

    public static void letters(){
        char a = 'a';
        char digit = '0';
        char dollarSign = '$';

        System.out.println("Letter a: " + a);
        System.out.println("Digit: " + digit);
        System.out.println("ASCII code of letter a: " + (int) a);
        System.out.println("Char at ASCII code 46: " + (char) 99);
    }

    public static void toCap(char c){
        System.out.println("Capital letter of " + c + " is " + (char)((int) c - 32));
    }

    // if - else - if

    public static void weather(){
        boolean isSunny = true;
        boolean hasHomework = false;

        System.out.println("Is it sunny outside? " + isSunny);
        System.out.println("Do we have a homework? " + hasHomework);

        float temperature = 28.5f;
        int threshold = 20; // 20 degree Celsius

        boolean isHotEnough = temperature >= threshold;
        System.out.println("It is hot enough? " + isHotEnough);

        // logical operators AND, OR, NOT
        // AND (in Java &&) - true only when all parameters are true
        // OR (in Java ||) - true if at least 1 parameter is true
        // NOT (!) - flips the value from true to false and vice versa

        boolean goOutside = isSunny && isHotEnough && !hasHomework;
        System.out.println("Should we go outside? " + goOutside);
    }

    public static void courseGrade(double totalPoints){
        int threshold = 50;

        if (totalPoints >= threshold){ // condition goes inside the brackets
            System.out.println("Congrats, you passed the course!!!");
            // get the final grade
            // 95 for 10
            // 85 for 9
            // 75 for 8
            // the rest is 6
            int finalGrade = 0;
            if(totalPoints >= 95){
                finalGrade = 10;
            }else if(totalPoints >= 85){
                finalGrade = 9;
            }else if (totalPoints >= 75) {
                finalGrade = 8;
            }else{
                finalGrade = 6;
            }

            System.out.println("Final grade: " + finalGrade);
        }else{
            System.out.println("Sorry, not enough points! :(");
        }
    }

    // 2 < a < 5 - not allowed in java 2 < a && a < 5


    public static void transformChar(char c){
            // check if its small letter
            // if((int) c >= 97 && (int) c <= 122){
        if(c >= 'a' &&  c <= 'z'){
            System.out.println(c + " is a lower case letter. Capital is: " + (char)(c - 32));
            // check if it is capital letter
        }else if(c >= 'A' && c <= 'Z') {
            System.out.println(c + " is a capital letter. Lowercase is: " + (char) (c + 32));
            // check if it is a digit
//        }else if((int) c >= 48 && (int) c <= 57){
        }else if(c >= '0' && c <= '9'){
            System.out.println(c + " is a digit.");
        }else{
            System.out.println(c + " is not alphanumeric character.");
        }

    }

    public static void createCharacter(){
        // standard input
        Scanner scanner = new Scanner(System.in);

        // character in a game
        // ask for character name
        System.out.println("Please enter your character name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the level of character: ");
        int level = scanner.nextInt();

        System.out.println("Character has magic powers?: ");
        boolean hasMagic = scanner.nextBoolean();

        System.out.println("Health points?");
        double HP = scanner.nextDouble();

        System.out.println("Enter type of hero? (A - archer, M - mage, W - warrior");
        char type = scanner.next().charAt(0);

        scanner.close();




        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Has magic: " + hasMagic);
        System.out.println("HP: " + HP);
        System.out.println("Type: "+ type);
    }

    public static int randomFromRange(int from, int to){
        // Math.random() [0,1) (from 0 to 0.99999999...)
        // if we want from 1 to 5
        int number = (int) (Math.random() * (to - from + 1)) + from;
        return number;
    }


}
