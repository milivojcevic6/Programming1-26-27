import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // LOOPS - FOR, WHILE, DO WHILE
        // Math.random()
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
//        System.out.println(rand.nextInt(9)); // int [0,9) -> [0,8]
//        System.out.println(rand.nextInt(2,9)); // int [2,9) -> [2,8]
        // init index ; ending condition; update index
//        for (int i = 0; i < 100; i++) { // same as i += 1 or i = i + 1
//            System.out.println("Hi!");
//        }

        // use for loop to count from 1 to 100
        //int number = 8;
//        for (int i = 1; i <= 10000; i++){
//            System.out.println(i);
//        }
        //System.out.println(i);
        //System.out.println(number);

        // use for loop to sum numbers from 1 to N
        // get N from the user
//        System.out.println("Insert N to sum up to N:");
//        int N = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= N; i++){
//            // we want for N=3 -> 1 + 2+ 3 = 6
//            sum += i;
//        }
//        System.out.println("SUM: " + sum);

//        // WHILE
//        System.out.println("WHILE");
//        int countdown = -10; // init index
//        while (countdown > 0){ // () condition != 0 works as well
//            System.out.println(countdown + "...");
//            countdown--;// update
////            Thread.sleep(1000);
//        }
//        System.out.println("HAPPY NEW YEAR!!!");
//
//
//        //DO WHILE
//        System.out.println();
//        System.out.println("DO WHILE");
//
//        countdown = -10; // init index
//
//        do{
//            System.out.println(countdown + "...");
//            countdown--;// update
//        }while (countdown > 0);// condition
//
//        System.out.println("HAPPY NEW YEAR!!!");
//        // difference is that do while runs at least once
//

        // real use case for do while

//        int choice; // index
//
//        do {
//            System.out.print("Please select menu (1-5): ");
//            choice = sc.nextInt();
//        } while (choice < 1 || choice > 5); // we repeat until we get valid option
//    //}while(!(choice > 1 && choice < 5));
//        System.out.println("Thanks for ordering, menu "
//                + choice + " is on the way!");

        // sometimes we want to skip some iterations
        // count from 1 to 10 but skip numbers divisible by 3
//        for (int i = 1; i <= 10; i++) {
//            if(i % 3 == 0) {
//                System.out.println("SKIPPING " + i);
//                continue;
//            }
//                // skip the rest of current iteration
//            // and go to the next one
//            System.out.println(i);
//        }

//        // when we want to exit loop earlier
//        // count from 1 to 10 but stop when you find 7
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//            if(i == 7) break;
//        }
//        System.out.println("Printed after break;");
//        Helper.guessingGame(sc, rand);
        // NESTED LOOPS
//        if(){
//            if(){
//                if(){
//            }
//        } nested ifs, conditions
// we need 10 such rows
//        for (int i = 0; i < 10; i++) { // for rows
//            for (int j = 1; j < 6; j++) { // for cols
//                System.out.print(j); // prints number by number in 1 row
//            }// go to new line
//            // start new row
//            System.out.println();
//        }

//        Helper.printCoordinates(3,5);
 //           Helper.multiplicationTable(5);
        Helper.exampleA(7);
        System.out.println();
        Helper.exampleI(7);

    }
}
