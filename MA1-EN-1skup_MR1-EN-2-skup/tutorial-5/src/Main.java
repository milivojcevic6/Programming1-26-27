import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args){
        // Math.random()
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

//        System.out.println(rand.nextInt(10)); // random int [0,9]
//        System.out.println(rand.nextInt(1,11)); // random int [1,10]
//        int from = 1;
//        int to = 10;
//        System.out.println((rand.nextInt(to - from + 1) + from)); // random int [1,10]

        // LOOPS - FOR, WHILE, DO WHILE

        // FOR - when we want to repeat some action certain amount of times

        //  (init counter/index; condition; update index)
//        for(int i = 1; i <= 10 ; i++){
//           // whatever is inside will be executed as long as condition is true
//            System.out.println("Hi");
//        }
//        // count form 1 to 20 by 2
//        for (int i = 1; i <= 20; i+=2) {
//            System.out.println(i);
//        }

        // sum numbers from 1 to N given N
//        System.out.println("Give me N:");
//        int N = sc.nextInt();
//        int res = 0;
//        for (int i = 1; i <= N; i++){ //  same as i+=1
//            System.out.println("Current res: "+ res);
//            res+=i;
//            System.out.println("We added " + i);
//        }
//        System.out.println("Result: " + res);

//        // WHILE
//        int countdown = 0; // init of counter
//        while (countdown > 0){ // condition
//            System.out.println(countdown + "...");
//            countdown--; // update of counter
//            //Thread.sleep(1000);
//        }
//        System.out.println("HAPPY NEW YEAR!!!");
//
//        countdown = 0;
//
//        //DO WHILE
//        do{
//            System.out.println(countdown + "...");
//            countdown--; // update of counter
//        }while(countdown > 0); // condition
//        System.out.println("HAPPY NEW YEAR!!!");

        // when we want to validate user input (make sure its legal)
//        int choice;

//        do{
//            System.out.print("Please choose a menu (1 to 5): ");
//            choice = sc.nextInt();
//        }while(choice < 1 || choice > 5); //  greater than 5 or less than 1
//
//        System.out.println("Thanks for ordering menu "+ choice +
//                ", it is on the way!!!");

        // sometimes we want to skip certain value/iteration
//        System.out.println("Count from 1 to 10 but skip all number divisible by 3: ");
//        for (int i = 1; i <= 10; i++){
//            if(i % 3 == 0) continue; // use this to skip the rest of the same
//            // iteration and jump to next one
//            System.out.println(i);
//        }
//
//        System.out.println("Count from 1 to 10 but stop when you find 7: ");
//        for (int i = 1; i <= 10; i++){
//            if(i == 7) break; // exit the loop
//            System.out.println(i);
//        }
//        System.out.println("Printed after break!");

//        Helper.guessingGame(sc, rand);

//        if()
//            if()
//                if() // nested ifs

        // NESTED LOOPS
//        for (int i = 1; i <= 10; i++) { // rows
//            for (int j = 1; j <= 5; j++) { // columns
//                System.out.print(j); // prints column by column of 1 row
////                for (int k = 0; k < 3; k++) {
////                    System.out.print(k);
////                }
////                System.out.println();
//            }// row finished
//            //go to new line
//            System.out.println();
//        }

        Helper.printCoordinates(3,3);
        Helper.multiplicationTable(5);

        Helper.exmpleA(7);
        System.out.println();
        Helper.exmpleI(7);



    }
}
