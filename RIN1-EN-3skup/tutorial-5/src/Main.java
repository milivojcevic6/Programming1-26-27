import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

//        System.out.println(rand.nextInt(10); // int[0,9]
//        System.out.println(rand.nextInt(11)); // int[0,10]
//        System.out.println(rand.nextInt(14-5+1)+5); // (to - from + 1) + from
//        System.out.println(rand.nextInt(1,11)); // int[1,10] java17+

        // LOOPS - FOR, WHILE, DO WHILE

        // FOR - repeat something CERTAIN amount of times
//        System.out.println("Print HELLO 10 times");
            // (init of counter | condition | update of counter)
//        for(int i = 0; i < 10; i++){
//            System.out.println("HELLO");
//        }
//        //System.out.println(i); cant access outsied the loop

//        System.out.println("Insert number to count to: ");
//        int max = sc.nextInt();
//
//        for (int i = 1; i <= max; i++){
//            System.out.println("Value of i: " + i);
//        }
//
//        // sum numbers from 1 up to N
//        System.out.print("Enter N to sum numbers up to it: ");
//        int N = sc.nextInt();
//
//        int sum = 0; // must be done outside the loop
//        for (int i = 1; i <= N; i++) {
//            sum += i;
//        }
//
//        System.out.println("Sum: " + sum);

        //WHILE
//        System.out.println("Countdown from 10: ");
//        int countdown = 0; //  INIT OF COUNTER
//
//        while (countdown > 0){ // condition
//            System.out.println(countdown + "...");
//            countdown--; // same as countdown -= 1;
//        }
//        System.out.println("HAPPY NEW YEAR!!!");

        // DO WHILE
//        countdown = 0;
//
//        do{ // condition
//            System.out.println(countdown + "...");
//            countdown--; // same as countdown -= 1;
//        }while(countdown > 0);
//        System.out.println("HAPPY NEW YEAR!!!");

        // use do while when you want to validate user input
//        int choice;
//        do {
//            System.out.print("Please select menu (1 to 5):");
//            choice = sc.nextInt();
//        }while (choice < 1 || choice > 5); //repeat loop as long as number is not
//        // between 1 and 5
//        System.out.println("Thanks! Menu " + choice + " is on its way!");

        // If we want to skip 1 iteration - continue;
        // count from 1 ot 10 but skip all numbers divisible by 3
//        for (int i = 1; i <= 10; i++) {
//            if(i % 3 == 0) continue; // skip the rest of the code in this iteration
//            System.out.println(i);
//        }

//        // count from 1 ot 10 but stop when you come to 8
//        for (int i = 1; i <= 10; i++) {
//            if(i == 8) break; // exit the loop
//            System.out.println(i);
//        }
//        System.out.println("Executed after break;");

//        Helper.guessingGame(sc, rand);

//        if(){
//            if(){
//                if(){
//
//                }
//            }
//        } nested if statements

        // NESTED LOOPS - when we deal with 2d data structures
        // print 10 rows with numbers from 1 to 5
//        for (int i = 1; i <= 10; i++) {
//            // print 1 to 5 in one row
//            System.out.print("ROW "+ i+": ");
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(j + " ");
//            }// row ended
//            // start new row
//            System.out.println();
//        }
//        Helper.printCoordinates(4,4);
//        Helper.multiplicationTable(5);
        Helper.exapmleA(7);
        Helper.exapmleI(7);
        sc.close();

    }
}
