import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

//        int num = rand.nextInt(10); // outputs random int [0,9]
//        int num = rand.nextInt(1,6); // int [1,5] new way
//        int from = 5;
//        int to = 15;
//        int num = rand.nextInt(to - from  + 1) + from; // old way
//        System.out.println("Random from 1 to 5: " + num);

        // LOOPS (FOR, WHILE, DO WHILE)
//        System.out.println("Count to 10: ");
//        for(int i = 1; i <= 10; i++){//initialization of some counter/index, condition, update of index
//            System.out.println("Index i = " + i);
//            System.out.println("DO ANOTHER THING");
//        }


        // sum numbers from 1 to some N
//        System.out.print("Insert integer N: ");
//        int N = sc.nextInt();
//        int sum = 0; // initialize sum outside the loop!!!
//        for (int i = 1; i <= N; i++) {   // i = i + 1 or i += 1
//            sum += i; // add each i from 1 to N to this sum same as sum = sum + i;
//        }
//
//        System.out.println("Sum: " + sum);

        // WE USE FOR TO EXECUTE SOMETHING CERTAIN AMOUNT OF TIMES!!!

        // WHILE
//        int countdown = 10; // initialization our i from for loop
//
//        while (countdown > 0) { //condition goes in ()
//            System.out.println(countdown);
//            countdown--;// update countdown
//        }
//        System.out.println("HAPPY NEW YEAR!!!");
        // close scanner

        // DO WHILE
//        int iDoWhile = 5;

//        do {
//            System.out.println("DO SOMETHING!");
//            iDoWhile -= 2;// update
//        }while(iDoWhile > 0);//condition
//        sc.close();
//
        // Real world use case for DO WHILE
//        int choice;
//        // menu choice in restaurant
//        do{
//            System.out.println("Please select a menu from 1 to 5:");
//            choice = sc.nextInt();
//        }while(choice < 1 || choice > 5);

//        System.out.println("Thanks for selecting! Menu " + choice + " is on its way!");

        // INFINITE LOOPS
//        while(true){
//            System.out.println("HELP ME OUT!!!");
//        }

//        for(;;){
//            System.out.println("HELP ME OUT!!!");
//        }

        // We sometimes want to exit loop earlier or to skip something

//        System.out.println("Count to 20, but skip all numbers divisible by number you enter: ");
//        int skip = sc.nextInt();
//        for(int i = 1; i <= 20; i++){
//            if(i % skip == 0){ // it means number is divisible by 3
//                continue;
//            }
//            System.out.println(i);
//        }

//        System.out.println("Count from 1 to 10 but stop when we come to number 4: ");
//
//        for (int i = 1; i <= 10; i++){
//            if(i == 4) break;
//            System.out.println(i);
//        }
//        System.out.println("Thing after loop ended");

        // call function from main
        //Helper.guessingGame(sc, rand);

        // NESTED LOOPS
        // print numbers from 1 to 5
        // repeat it 10 times
//        for (int i = 1; i <= 10; i++) { // how many rows
//            for (int j = 1; j <= 5; j++){ // how many columns
//                System.out.print(j + " ");
//            }// inner loop
//            System.out.println();
//        }//outer loop
//
        Helper.printCoordinates(5,4);
        Helper.printMultiplicationTable(5);
        Helper.exampleA(7);

    }

}
