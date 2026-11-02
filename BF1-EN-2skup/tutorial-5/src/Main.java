import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args){
        // There is easier way to get random number
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // generate random int
//        System.out.println(rand.nextInt(9)); // int [0,8]
//        System.out.println(rand.nextInt(10)); // int [0,9]
//        System.out.println(rand.nextInt(1,10+1)); // int [1,10]
//        // java 17+
//        int from = 2;
//        int to = 7;
//        System.out.println(rand.nextInt(to - from + 1)+from);

        // LOOPS - FOR, WHILE, DO WHILE
        // to check arrays (future topic)
        // init some counter/index ; condition ; update of index
        //int number = 8;
//        for(int i = 1; i <= 10; i++) { // same as i+= 1 or i = i + 1
//            System.out.println("Hi!");
//        }
//        System.out.println(i); // not available outside the loop
//        System.out.println(number);

        // write a program that counts 1 to 10 and prints each number

//        for (int i = 1; i <= 10; i++){
//            System.out.println("Value of i is: " + i);
//        }

        // sum up numbers up to N
//        System.out.print("Insert N to sum up to it:");
//        int N = sc.nextInt();
//        // if N = 4 -> 1 + 2 + 3 + 4 = 10
//        int sum = 0;
//        for (int i = 1; i <= N; i++){
//            System.out.println("Current sum = "+ sum);
//            System.out.println("We add " + i);
//            sum += i;
//        }
//        System.out.println("SUM: " + sum);

        // WHILE

        // we want to countdown from 10 to 0
//        System.out.println("WHILE");
//        int countdown = 0; // init of counter/index
//        while (countdown > 0){ // () condition
//            System.out.println(countdown + "...");
//            // update the countdown
//            countdown--; // same as countdown -= 1 or countdown = countdown - 1;
//           // Thread.sleep(1000);
//        }
//        System.out.println("Happy New Year!!!");
//        System.out.println();
//        System.out.println("DO WHILE");
//        // DO WHILE
//        countdown = -10000; // init of counter/index
//        do{
//            System.out.println(countdown + "...");
//            // update the countdown
//            countdown--; // same as countdown -= 1 or countdown = countdown - 1;
//        }while (countdown > 0); // condition
//        System.out.println("Happy New Year!!!");

        // real world use case of do while
//        int choice;
//        do{
//            // check if user has selected valid menu option
//            System.out.println("Select menu (1-5):");
//            choice = sc.nextInt(); // update of index
//        }while (choice < 1 || choice > 5); // run as long as we don't have valid entry one way negate valid !(choice <= 5 && choice >=1)
//        System.out.println("Thanks for ordering! Menu "+ choice + " is on its way!!!");

        // sometimes we want to skip certain iterations
        // count from 1 to 10 but skip all numbers divisible by 3
//        for (int i = 1; i <= 10; i++) {
////            if(i % 3 == 0) {
////                i++;
////            }
////            System.out.println(i);
//
//            if (i % 3 == 0) continue; // skip the rest of this iteration
//            System.out.println(i);
//        }
//

        // sometimes we want to exit loop earlier
        // count to 10 but stop when you find 7
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//            if(i == 7) break; // exit loop not just iteration
//
//        }
//        System.out.println("Printed after break;");

//        Helper.guessingGame(sc, rand);

//        if(){
//            if(){
//                if(){
//                }
//            }
//
//        } nested ifs

        // NESTED LOOPS
        // we want 10 rows
//        for (int i = 1; i <= 10; i++) { // write 1 row 10 times
//            for (int j = 1; j <= 5; j++) { // columns of 1 row
//                System.out.print(j); // one row of numbers
//            }
//            // go to new line/next row
//            System.out.println();
//        }

//        Helper.printCoordinates(3,3);
//        Helper.multiplicationTable(5);
        Helper.exampleA(7);

    }

}
