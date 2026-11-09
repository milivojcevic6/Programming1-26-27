import java.util.ArrayList;
import java.util.Scanner;

public class ArraysHelper {
    // print method
    public static void printIntArray(int [] arr, boolean fromStart){
        // forward print
        if(fromStart){
            System.out.print("Printing array forwards: ");
            for (int i = 0; i < arr.length; i++) { //i <= arr.length - 1 is also valid
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }else {
            // print backwards
            System.out.print("Printing array backwards: ");
            for (int i = arr.length-1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // sum elements in array
    public static int sumOfElements(int [] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            //System.out.println("Current sum: " + sum + " adding arr[" + i + "] = " + arr[i]);
            sum += arr[i];
        }

        return sum;
    }

    // average value of array
    public static double averageOfArray(int [] arr){
        // check if array.length is 0
        if(arr.length == 0) return 0.0;
        // we need sum, and we divide by total number of elements
        int sum = sumOfElements(arr);

        double average = (double) sum / arr.length;
        return average;
    }

    // FIND MAX ELEMENT (biggest element) IN ARRAY
    public static int findMax(int [] arr){
        int max = arr[0];

        // enhanced for loop (for each)
        for(int element : arr){
            if(element > max) max = element;
        }

//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > max) max = arr[i];
//        }

        return max;
    }

    // COUNT EVEN ELEMENTS IN ARRAY
    public  static int countEven(int [] arr){
        int counter = 0;

        for (int element : arr){
            if(element % 2 == 0) {
                counter++;
                //System.out.println(element);
            }

        }

        return counter;
    }

    // check if some number is present in array
    public static boolean isThere(int [] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x) return true;
        }

        return false;
    }

    public static boolean equals(int[] a, int [] b){
        if(a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) return false;
        }

        return true;
    }

    // REVERSE ARRAY IN PLACE
    public static int [] reverseArray(int [] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int tmp = arr[i];
            arr[i] = arr[(arr.length - 1)- i];
            arr[(arr.length - 1)- i] = tmp; // whenever you need to do
            // swapping of 2 variables you need 3rd as helper
        }

        return arr;
    }

    // INPUT ARRAY USING SCANNER
    public static int [] createIntArray(Scanner sc){
        // we need length
        System.out.println("Please enter number of elements in array: ");
        int len = sc.nextInt();

        int [] arr = new int [len]; // {0,0,0,0...0}

        for (int i = 0; i < len; i++){
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static int [] createIntArrayFromString(Scanner sc){
        System.out.println("Please input all elements of array separated by space: ");
        String input = sc.nextLine();

        System.out.println(input); // "10 1 ..."

        String [] tokens = input.split(" "); // {"10","1"...}
        int [] arr = new int [tokens.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]); // {10,1..}
        }

        return arr;
    }







}
