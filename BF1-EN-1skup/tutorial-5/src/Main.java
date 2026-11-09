import javax.swing.plaf.TableHeaderUI;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Math.random()
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

//        sc.nextInt();
//        System.out.println(rand.nextInt(10)); // random int [0,9]
//        System.out.println(rand.nextInt(10+1)); // random int [0,10]
//        System.out.println(rand.nextInt(4,16)); // random int [4,15] from java 17+
//        System.out.println(rand.nextInt(15-4+1) + 4);

        // LOOPS - WHILE, DO WHILE, FOR

        // FOR - use it to repeat some action certain amount of times
        // index/counter initialization; condition; update index
//        for(int i = 0; i < 10; i++) {// same as i += 1 or i = i + 1
//            System.out.println("Hi!");
//        }

        // write a program that counts from 1 to 10
//        for (int i = 1; i <= 10; i++){
//            System.out.println("Value of i: " + i);
//        }

        // sum numbers from 1 to N (provided by the user)
//        System.out.print("Please enter N to sum up to it: ");
//        int N = sc.nextInt();
//        int sum = 0;
//        // if N is 4 -> 1 + 2 +3 +4 = 10
//        for (int i = 1; i <= N; i++){
//            // sum up i-s
//            sum = sum + i; // sum += i;
//        }
//
//        System.out.println("SUM: " + sum);

        // WHILE
//        System.out.println("WHILE");
//        int countdown = -10; // init counter/index
//        while (countdown > 0){ // () condition
//            System.out.println(countdown + "...");
//            // update
//            countdown--; // same as countdown-= 1 or countdown = coundown - 1
//            //Thread.sleep(1000);
//        }
//        System.out.println("HAPPY NEW YEAR!");
//
//
//        System.out.println();
//        System.out.println("DO WHILE");
//        // DO WHILE
//        countdown = -10; // init index/counter
//
//        do{
//            System.out.println(countdown + "...");
//            // update
//            countdown--; // same as countdown-= 1 or countdown = coundown - 1
//        }while (countdown > 0); // condition ()
//        System.out.println("HAPPY NEW YEAR!");
//
        // real use case
        // validate user input

//        int choice;
//        do{
//            System.out.println("Please select a menu (1-5):");
//            choice = sc.nextInt();
//        }while(choice < 1 || choice > 5); // run as long as valid choice is not received
//        // (just negate correct options) !(choice <= 5 && choice >= 1)
//
//        System.out.println("Thanks for ordering! Menu "+ choice + " is on its way!");


        // sometimes we want to skip some iterations
        // count from 1 to 10 but skip all numbers divisible by 3
//        for (int i = 1; i <= 10; i++) {
//            if(i % 3 == 0) {
//                System.out.println("Skipping "+ i);
//                continue; // skips the rest of current
//                // iteration and goes to the next one
//
//            }
//
//            System.out.println(i);
//        }

        // sometimes we want to exit loop earlier
        // count to 10 but exit when you see 7

//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println(i);
//            if(i == 7) break; //exits the loop
//        }
//        System.out.println("Printed after break;");
//
//       Helper.guessingGame(sc, rand);

//        if(){
//            if(){
//                if()
//            }
//        } // nested ifs

        // NESTED LOOPS
//        for(){
//            for(){
//                for(){
//
//                }
//            }
//        }

//        for (int i = 1; i <= 10; i++) { // write 1 row 10 times - rows
//            for (int j = 1; j <= 5; j++) { // columns
//                System.out.print(j); // prints 12345 - one row
//            }// go to new line/new row
//            System.out.println();
//        }

//        Helper.printCoordinates(3,3);
//        Helper.multiplicationTable(5);
        Helper.exampleA(7);


    }

}
