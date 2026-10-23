import java.util.Scanner;

public class Main {
    static void main(String[] args) {
//        System.out.println(10/3); // integer division
//        System.out.println(10/3.0);
//        System.out.println(10/3f);
//        System.out.println((double) 10/3);

//        System.out.println(10 % 3);
//        nums();
//        weather();
//        courseGrade(98);
//        System.out.println();
//        courseGrade(45);

//        characterTransformer('a');
//        characterTransformer('Z');
//        characterTransformer('9');
//        characterTransformer('$');

        createZoo();
    }

    public static void nums(){
        int a = -12;
        int b = 10;

        // find max value among a and b
        int c = Math.max(a,b);
        System.out.println("Max: " + c);
        System.out.println("Min:" + Math.min(a,b));
        System.out.println("Absolute value: " + Math.abs(a));
        c = (int) Math.pow(a,b);
        System.out.println(c);

        System.out.println((int) 2.7f);
        System.out.println(Math.round(2.7f));
        System.out.println(Math.round(2.4f));
        System.out.println(Math.ceil(2.4f));
        System.out.println(Math.floor(2.9f));

        System.out.println("Random num from 0 to 1 not including 1: " + Math.random());
        // [0,1)
        System.out.println("Random num: " + Math.random());
        System.out.println("Random num: " + Math.random());
    }

    public static int randomIntFromRange(int from, int to){
        int number;

        number = (int) (Math.random() * (to - from + 1)) + from;
        return number;
    }

    // if - else - if (conditional statements)

    public static void weather(){
        // method checks the weather and HW and lets us know if we should go outside
        boolean isSunny = true;
        boolean hasHW = false;

        System.out.println("Is it sunny? " + isSunny);
        System.out.println("Do we have HW? " + hasHW);

        float temp = 28.5f;
        boolean isHotEnough = temp >= 20; // check if at least 20 degrees
        System.out.println("Hot enough? " + isHotEnough);
        // LOGICAL OPERATORS
        // AND (&&) - evaluates as true only if all conditions are true
        // OR (||) - true if at least one is true
        // NOT (!) - flips true to false and vice versa
        boolean goOutside = isSunny && isHotEnough && !hasHW;
        System.out.println("GO OUTSIDE? " + goOutside);
    }

    public static void courseGrade(double totalPoints){
        // check if passed the course then calculate grade
        int minPointsNeeded = 50;

        if (totalPoints >= minPointsNeeded){ // () inside we put condition
            // we do something
            System.out.println("Congrats, you passed the course!");

            int grade;

            // 95+ -> grade 10
            // 85+ -> grade 9
            // 75+ -> grade 8
            // 50+ -> grade 6
            if(totalPoints >= 95) grade = 10;
            else if(totalPoints >= 85) grade = 9; // && < 95
            else if(totalPoints >= 75) grade = 8;
            else grade = 6;

            System.out.println("Final grade for " + totalPoints + " points is: "+grade);


        }else{
            // do something else
            System.out.println("Sorry, but you failed. :(");
        }
    }

    public static void characterTransformer(char c){
//        char letter = 'a';
//        char digit = '2';
//        char space = ' ';
//
//        System.out.println(letter);
//        System.out.println("ASCII table value of " + letter + " is " + (int) letter);
//        System.out.println("Char at value " + 87+ " in ASCII table is " + (char)87);

        // if we get small teller make it uppercase
//        if(c >= 97 && c <= 122){
        if(c >= 'a' && c <= 'z'){
            System.out.println("Capital from " + c + " is " + (char)(c - 32) );
        }
        // if we get upper case make it small
        else if(c >= 'A' && c <= 'Z'){
            System.out.println("Lowercase from " + c + " is " + (char)(c + 32) );
        }
        // if we get digit print and say it is digit
        else if(c >= '0' && c <= '9'){
            System.out.println(c + " is a digit!");
        }
        // else say it is not digit nor letter
        else{
            System.out.println(c + " is not alphanumeric!");
        }
    }

    public static void createZoo(){
        // STANDARD INPUT
        // Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please tell me the name for the ZOO:");
        String name = scanner.nextLine();

        System.out.println("How many animals you plan to have?");
        int animals = scanner.nextInt();

        System.out.println("Budget?");
        double budget = scanner.nextDouble();

        scanner.nextLine(); // use this to process \n at the end of previous scan
        System.out.println("Add animal: (M - monkey, Z - zebra)");

        char animalAdded = scanner.nextLine().charAt(0);
        //char animalAdded = scanner.next().charAt(0);




        System.out.println("Name: " + name);
        System.out.println("Number of animals: " + animals);
        System.out.println("Budget: " + budget);
        System.out.println("Animal added: " + animalAdded);
    }





}
