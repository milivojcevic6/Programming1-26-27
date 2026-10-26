import java.util.Scanner;

public class Main {
    static void main(String[] args) {
//        System.out.println(10/3); // 3
//        System.out.println((double)10/3); // 3.3333
//        System.out.println((float)10/3); // 3.3333
//        System.out.println(10.0/3); // 3.3333
//        // or *1.0
//
//        System.out.println(10%3); // reminder is 1
//        int randomNum = randomIntFromRange(1,3);
//        System.out.println(randomNum);
//        System.out.println(randomIntFromRange(-2,3));

//        letters();
//        toCap('c');

//        weather();
//        courseGrade(97);
//        System.out.println();
//        courseGrade(47);
//        System.out.println();
//        courseGrade(85);

//        toCapital('a');
//        toCapital('Z');
//        toCapital('6');
//        toCapital('$');

        // STANDARD INPUT
        Scanner scanner = new Scanner(System.in);

        // creating a party
        System.out.println("Location?");

        String location = scanner.nextLine();



        System.out.println("Number of people? ");
        int numberOfPeople = scanner.nextInt();


        System.out.println("Budget?");
        double money = scanner.nextDouble();

//        scanner.nextLine();
        // scan next char
        System.out.println("Size of party: (M,L,S)");
//        char size = scanner.nextLine().charAt(0);
        char size = scanner.next().charAt(0);



        System.out.println("Location: " + location);
        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Budget: " + money);
        System.out.println("Size: "+ size);
    }

    // method that generates random int from some range
    public static int randomIntFromRange(int from, int to){
        int number = 0;
        number = (int)(Math.random() * (to - from + 1)) + from;
        return number;
    }

    // characters - letter, digit, other symbols
    public static void letters(){
        char letter = 'a'; // "" for strings and '' for chars
        char digit = '8';
        char symbol = '%';
        char space = ' ';

        System.out.println("Letter: " + letter);
//        System.out.println(1+2);
//        System.out.println("text "+(1+2));
        System.out.println("ASCII table value of " + digit + " is " + (int) digit);
        System.out.println("ASCII table value of " + letter + " is " + (int) letter);
        System.out.println("Character with ASCII table value of " + 78 + " is " + (char) 78);
    }

    public static void toCap(char c){
        System.out.println("Capital of " + c + " is "+ (char)(c - 32));
    }

    // IF - ELSE - IF (Conditions, conditional statements)
    // Boolean values - True False
    // Logical operators
    // AND (&&) - all conditions are true
    // OR (||) - at least one is true
    // NOT (!) - flips the value from True to False and vice versa

    // method that tells us if we should go out or study
    public static void weather(){
        boolean isSunny = true;
        boolean haveHomework = false;

        System.out.println("Is it sunny? " + isSunny);
        System.out.println("Do we have HW? " + haveHomework);

        float temperature = 27.8f;
        // we say its hot if it more than 21 degrees celsius
        boolean isHotEnough = temperature > 21;

        System.out.println("Is it hot enough? " + isHotEnough);

        // go out only if it is hot sunny day and no HW
        boolean goOutside = isSunny && isHotEnough && !haveHomework;
        System.out.println("Go outside? " + goOutside);
    }

    // check if student has passed the course and give it a grade
    public static void courseGrade(double totalPoints){
        // check if passed
        if(totalPoints >= 50) { // inside () goes condition
            // if condition is true
            // execute this
            System.out.println("Good job, you passed!");
            // calculate the grade
            // 95+ is 10
            // 85+ is 9
            // 75+ is 8
            // rest is 6
            int grade = 0;
            if(totalPoints >= 95){
                grade = 10;
            }else if(totalPoints >= 85){ //&& totalPoints < 95
                grade = 9;
            }else if(totalPoints >= 75){
                grade = 8;
            }else{
                grade = 6;
            }

            System.out.println("Grade: " + grade);

        }else{
            // if condition is false
            // execute this
            System.out.println("Better luck next year :(");
        }
    }

    public static void toCapital(char c){
        // check if lowercase make upper
        //if(c >= 97 && c <= 122)  System.out.println("Capital of " + c + " is "+ (char)(c - 32));
        if(c >= 'a' && c <= 'z')  System.out.println("Capital of " + c + " is "+ (char)(c - 32));
        // check if upper make it lower
        else if(c >= 65 && c <= 90)   System.out.println("Lowercase of " + c + " is "+ (char)(c + 32));// this is not allowed 10 < c < 20 instead 10 < c && c < 20
        // if digit print it
        else if(c >= '0' && c <= '9') System.out.println(c + " is a digit");
        // otherwise say it is nto a letter nor digit
        else System.out.println(c + " is not a digit nor letter");
    }

    //
}
