import java.util.Scanner;


public class Main {
    static void main(String[] args) {
//        System.out.println(10/3); // integer division
//        System.out.println(10 / 3.0);
//        System.out.println((double) 10 / 3);

        // modulo
//        System.out.println(10 % 3); // reminder of integer division
        //letters();
        //toCap('c');
//        weather();
//    courseResult(98);
//    courseResult(49);
//        transformCharacter('a');
//        transformCharacter('Z');
//        transformCharacter('8');
//        transformCharacter('&');
        createSpaceMission();

    }

    public static void letters(){
        char letter = 'a';
        char digit = '0';
        char dollarSign = '$';

        System.out.println("Character a: " + letter);
        System.out.println("ASCII value for a: " + (int)letter);
        System.out.println("Character from ASCII value: " + (char)88);
    }

    public static void toCap(char lowerCaseLetter){
        System.out.println("Capital of " + lowerCaseLetter + " is " + (char)(lowerCaseLetter - 32));
    }

    // IF - ELSE - IF (Conditional statements)

    public static void weather(){
        // method that helps us decide if we should go out or study
        boolean isSunny = true;
        boolean hasHomework = false;

        System.out.println("Is it sunny? " + isSunny);
        System.out.println("Do we have a homework? " + hasHomework);

        float temperature = 27.8f;
        boolean isHotEnough = temperature >= 20; // check if at least 20 degrees celsius

        System.out.println("Is it hot enough? " + isHotEnough);

        // to go outside we need weather to be sunny and hot enough and to not have and HW
        // Logical operators
        // AND (in Java &&) - true only when all parameters are true
        // OR (||) - true if any parameter is true
        // NOT (!) - flips the boolean value (from true to false and vice versa)
        boolean goOutside = isSunny && isHotEnough && !hasHomework;
        System.out.println("Should I go outside? " + goOutside);
    }

    // method that calculates final grade of student
    public static void courseResult(double totalPoints){
        // min points needed
        int minPointsNeeded = 50;

        // check if student passed the course
        if (totalPoints >= minPointsNeeded){ // condition goes into brackets ()
            System.out.println("Congrats! You passed the course!");
            int grade = 0;
            // 95 for 10
            // 85 for 9
            // 75 for 8
            // rest is 6
            if(totalPoints >= 95) grade = 10;
            else if(totalPoints >= 85) grade = 9; // alternatively check whole range && totalPoints < 95
            else if(totalPoints >= 75) grade = 8;
            else grade = 6;

            System.out.println("Final grade: " + grade);


        }else{
            System.out.println("Sorry, you failed! :(");
        }
    }

    public static void transformCharacter(char c){
        // if its small letter transform to capital
//        if(c >= 97 && c <= 122){
        if(c >= 'a' && c <= 'z'){
            System.out.println("Capital of " + c + " is " + (char) (c-32));
        }
        // if its capital letter transform to small
        else if(c >= 'A' && c <= 'Z'){
            System.out.println("Lowercase of " + c + " is " + (char) (c+32));
        }
        // if it is a digit just print
        else if(c >= '0' && c <= '9'){
            System.out.println(c + " is a digit!");
        }
        // if anything else print that it is not digit or letter
        else {
            System.out.println(c + " is not alphanumeric!");
        }
    }

    // STANDARD INPUT
    // Scanner

    public static void createSpaceMission() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the name of the misssion: ");
        String name = scanner.nextLine();

        System.out.println("How long the mission is in days?");
        int days = scanner.nextInt();

        System.out.println("How much gas you need?");
        double gasAmount = scanner.nextDouble();

        System.out.println("Should you return?");
        boolean willReturn = scanner.nextBoolean();

        scanner.nextLine(); // only if nextLine is used

        System.out.println("Enter type of mission (M - Moon landing, O - Orbiting the planet): ");
        char type = scanner.nextLine().charAt(0);
        //char type = scanner.next().charAt(0);

        // print info
        System.out.println("Name of the mission: " + name);
        System.out.println("Lenght of the mission: " + days + " days");
        System.out.println("Gas needed: " + gasAmount + " liters");
        System.out.println("Will you return: " + willReturn);
        System.out.println("Type of the mission: " + type);
    }


}
