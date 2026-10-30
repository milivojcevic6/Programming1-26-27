import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // Random int
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // generate random int from range
//        System.out.println(rand.nextInt(10)); // int [0,9]
//        System.out.println(rand.nextInt(10 - 1 + 1) + 1); // we needed form = 1 and
//        // to = 10 and we get int [1,10]
//        System.out.println(rand.nextInt(1,11)); // int [0,10]

        // LOOPS - WHILE; FOR; DO WHILE

        // FOR - when we want to repeat something certain amount of times
//        System.out.println("Count from 3 to 10: ");
//      //     init counter      condition  update counter
//        for (int i = 3; i <= 10; i++) {  // same as i += 1 and i = i + 1
//            System.out.println(i);
//        }
//        System.out.println("print after loop ended");
//
//        // sum up numbers upto N
//
//        System.out.println("Please enter integer number N to sum up from 1 to that number: ");
//        int N = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= N; i++){
//            sum += i;
//        }
//
//        System.out.println("SUM IS: " + sum);

        //WHILE LOOP
//        System.out.print("Give me int number to count from: ");
//        int countdown = sc.nextInt(); // counter
//        while (countdown > 0){ // condition is in ()
//            System.out.println(countdown + "...");
//            //Thread.sleep(1000);
//            countdown--;
//        }
//        System.out.println("HAPPY NEW YEAR!!!");

        // DO WHILE LOOP - executes loop at least once

//        do{
//            System.out.println(countdown);
//            countdown--;
//        }while(countdown > 0);
//        System.out.println("HAPPY NEW YEAR!!!");

        // real world use case
        // validate user input and repeat until satisfied

//        int choice;
//        do {
//            System.out.print("Please select the menu (1 to 5): ");
//            choice = sc.nextInt();
//        }while (choice < 1  || choice > 5);
//        System.out.println("Thank you! Menu " + choice + " is on its way!");

        // if we want ot skip 1 iteration or exit earlier
//        System.out.println("Count to 10 but skip all numbers divisible by 3: ");
//        for (int i  = 1; i <=10; i++){
//            if(i % 3 == 0) continue;
//            System.out.println(i);
//        }
//
//        System.out.println("Count to 10 but stop when you find 6: ");
//        for (int i  = 1; i <=10; i++){
//            if(i == 6) break;
//            System.out.println(i);
//        }
//        System.out.println("thing done after break");
//        Helper.guessingGame(sc,rand);
//        if(){
//            if(){
//                if()
//            }
//        } nested if statements

        // NESTED LOOPS

        // we need 10 rows of this
//        for (int i = 1; i <= 10; i++) { // rows
//            // print numebrs from 1 to 5 in one row
//            for (int j = 1; j <= 5; j++) { // colums
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        Helper.printCoordinates(5,2);
        Helper.multiplicationTable(5);
        Helper.printSquare(5);
        System.out.println("Example A");
        Helper.exapmleA(7);
        System.out.println();
        System.out.println("Example I");
        System.out.println();
        Helper.exampleI(7);
        sc.close(); // close scanner
    }
}
