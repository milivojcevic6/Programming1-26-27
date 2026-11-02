import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // class Random
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
//        System.out.println(rand.nextInt(1,6)); // generate random int [1,5]
//        int from = 2;
//        int to = 10;
//        System.out.println(rand.nextInt(to - from + 1) + from);

        // LOOPS - FOR, WHILE, DO WHILE
       // FOR - we use it to repeat some action certain amount of times
        // repeat print statement 10 times
//        for(int i = 1; i <= 20; i++){ // init some counter/index; condition; update index
//            // i++ is same as i+=1 or i = i + 1
//            System.out.println("Hi!");
//        }


        // Use for loops to count from 1 to 10
//        for (int i = 1; i < 11; i++){ // or i <= 10
//            System.out.println("Value of i: " + i );
//        }

        // Sum up integers from 1 to some N // if N = 4 -> 1 + 2 + 3 + 4 = 10

//        System.out.println("Please enter N to sum up numbers form 1 to N:");
//        int N = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= N; i++){
//            sum += i; // add each i to the cumulative sum
//        }

//        System.out.println("Sum: "+ sum);

        // WHILE
        // countdown from 10
//        System.out.println("WHILE LOOP");
//        int countdown = 0; // init counter
//        while (countdown > 0){ //condition
//            System.out.println(countdown + "...");  // if no update of counter inside the loop it will run forever
//            countdown--; // same as countdown -= 1 or countdown = countdown - 1;
////            Thread.sleep(1000);
//        }
//        System.out.println("HAPPY NEW YEAR!!!");

        // DO WHILE
//        System.out.println();
//        System.out.println("DO WHILE");
//        countdown = -100000;
//        do{
//            System.out.println(countdown + "...");  // if no update of counter inside the loop it will run forever
//            countdown--;
//        }while(countdown > 0);
//        System.out.println("HAPPY NEW YEAR!!!");

//        int choice;
//        do{
//            // we need to select a menu in a restaurant
//            System.out.print("Please select menu (1-5): ");
//            choice = sc.nextInt();
//        }while(choice < 1 || choice > 5);
//        // repeat the question as long as menu choice is invalid
//        System.out.println("Thanks! Menu " + choice + " is on its way!!!");

    // if we want to skip some iteration or exit loop earlier

        // count from 1 to 10 but skip all numbers divisible by 3
//        for (int i = 1; i <= 10; i++) {
//            if(i % 2 == 0) continue; // % - modulo and gives reminder of division
        // continue skips the rest of current iteration
//            System.out.println(i);
//        }
        //  count from 1 to 10 and stop if you find 7
//        for (int i = 1; i <= 10; i++) {
//            if( i == 7) break; // exits the loop
//            System.out.println(i);
//        }
//        System.out.println("Printed after break;");

        //Helper.guessingGame(sc, rand);

        // example of nester loops

        // repeat it 10 times
//        for (int i = 1; i <= 10; i++) { // represets each row
//            // write numebrs from 1 to 5 in one row
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(j); // one row of data
                    // write columns
//            }
//            System.out.println();
//        }


//        Helper.printCoordinates(3,5);
//        Helper.multTable(5);
        Helper.exampleA(7);
    }
}
