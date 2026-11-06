import java.util.Scanner;

public class ArraysHelper {
    public static void printIntArray(int [] arr, boolean fromStart){
        if(fromStart) {
            System.out.println("Forward print:");
            for (int i = 0; i < arr.length; i++) { //  <= arr.length - 1
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }else{
            System.out.println("Backward print:");
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // find a sum ot all elements
    public static int sumOfArray(int [] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }

        return sum;
    }

    // average of array
    public static double averageOfArray(int [] arr){
        int sum = sumOfArray(arr); // keep our code DRY - Dont Repeat Yourself

        return (double) sum / arr.length;
    }

    // find max element (biggest number in array)
    public static int max(int [] arr){
        // enhanced for loop (for each)
        int max = arr[0]; //or any other index
        for (int element : arr){
            if(element > max) max = element;
        }

        return max;
    }

    // count how many even numbers in array
    public static int countEven(int [] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) counter++;
        }
        return counter;
    }

    // check if some number is in array

    public static boolean findTarget(int [] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) return true;
        }
        return false;
    }

    // Lets reverse array {1,2,3} -> {3,2,1}
    public static int [] reverseArray(int [] arr){
//        int [] copy = new int[arr.length];
//
//        for (int i = arr.length - 1; i >= 0 ; i--) {
//            copy[arr.length - 1 -i] = arr[i];
//        }
//
//        return copy; // this is very good solution and totally correct
        // lets try to do it in-place (without creating new array)
        for (int i = 0; i < arr.length/2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp; // swap value of 2 "variables"
        }

        return arr;
    }

    public static boolean equals(int [] a, int [] b){
        if(a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) return false;
        }

        return true;
    }

    // CREATE ARRAY USING STDIN
    public static int[] createArray(Scanner sc){
        System.out.println("How many elements you want in array?");
        int length = sc.nextInt();

        int [] arr = new int[length]; // we have {0,0,0,0...}
        // fill in array with numbers of our choice
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element on index "+ i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int [] createArrayFromString(Scanner sc){
        System.out.println("Please enter all numbers separated by space: ");
        String input = sc.nextLine();
        String [] tokens = input.split(" ");
        int [] arr = new int [tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        return arr;
    }
}
