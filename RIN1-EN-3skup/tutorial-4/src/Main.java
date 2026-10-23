import java.util.Scanner;

class Main{
    static void main(String [] args){
//        System.out.println(10/3); //integer division
//        System.out.println(10f / 3);
//        System.out.println(10.0 / 3);
//        System.out.println((double) 10 / 3);
//        System.out.println((float) 10 / 3);
//
//        System.out.println(10 % 3);
//        weather();
//        getFinalGrade(97);
//        System.out.println();
//        getFinalGrade(49);
//        System.out.println();
//        getFinalGrade(77);
//        transformCharacter('a');
//        transformCharacter('Z');
//        transformCharacter('9');
//        transformCharacter('%');

        organiseParty();

    }
    // CONDITIONAL STATEMENTS (IF - ELSE - IF)

    public static void weather(){
        // we want to decide if we should do homework or go outside
        boolean isSunny = true;
        boolean hasHW = false;

        System.out.println("Is it sunny outside? " + isSunny);
        System.out.println("Do we have HW? " + hasHW);

        float temp = 29.6f;
        boolean isHotEnough = temp >= 21;

        System.out.println("Is it hot enough? " + isHotEnough);

        // we need sunny day thats hot enough and we dont have HW
        // LOGICAL OPERATORS
        // AND (&&) - true only if all are true
        // OR (||) - true if any parameter is set to true
        // NOT (!) - flips the value true -> false and vice versa
        boolean canGoOutside = isSunny && isHotEnough && !hasHW;
        System.out.println("GO OUTSIDE? " + canGoOutside);
    }

    public static void getFinalGrade(double totalPoints){
        // method calculates final grade of students that passed the course
        int minimumPointsNeeded = 50;

        if (totalPoints >= minimumPointsNeeded){ // inside () we write condition
            System.out.println("Congrats you passed the course!");
            // for 10 -> 95+ points
            // for 9 -> 85+ points
            // for 8 -> 75+ points
            // the rest is 6 -> 50+

            int grade = 0;

            if(totalPoints >= 95) grade = 10;
            else if (totalPoints >= 85) grade = 9; // write whole range totalPoints >= 85 && < 95
            else if (totalPoints >= 75) grade = 8;
            else grade = 6;

            System.out.println("Final grade for " + totalPoints + " points: " + grade);


        }else{
            System.out.println("Better luck next year!");
        }

    }

    public static void transformCharacter(char c){
        // transform lower case to capital
//        if(c >= 97 && c <= 122){
        if(c >= 'a' && c <= 'z'){
            System.out.println("Capital of " + c + " is: " + (char)(c-32));
        }
        // transform capital to lower
        else if(c >= 'A' && c <= 'Z'){
            System.out.println("Lowercase of " + c + " is: " + (char)(c+32));
        }
        // digit is just printed
        else if(c >= '0' && c <= '9'){ // or take numbers from ASCII table
            System.out.println(c + " is a digit!");
        }
        // other symbols printed and we say it is not a digit nor letter
        else{
            System.out.println(c + " is not alphanumeric!");
        }
    }

    // STANDARD INPUT
    // In Java we use Scanner to do it
    public static void organiseParty(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide location:");
        String address = scanner.nextLine();

        System.out.println("How many people you expect? ");
        int numOfPeople = scanner.nextInt();

        System.out.println("How much money you need? ");
        double money = scanner.nextDouble();
        //scanner.nextLine();

        System.out.println("Size of your t-shirt (We have M, S, L): ");
        //char size = scanner.nextLine().charAt(0);
        char size = scanner.next().charAt(0);

        scanner.close();

        System.out.println("Location: " + address);
        System.out.println("Number of guests: " + numOfPeople);
        System.out.println("Budget: " + money + "EUR");
        System.out.println("Size of t-shirt: " + size);
    }
}

