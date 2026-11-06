import java.util.Scanner;

public class ArraysHelper {
    public static void printIntArray(int [] arr, boolean fromStart){
        if(fromStart){
            System.out.print("From start: ");
            // print in regular order form index 0 to len-1
            for (int i = 0; i <= arr.length - 1; i++){ // < arr.length works as well
                System.out.print(arr[i] + " ");
            }
        }else{
            System.out.print("Printed backwards: ");
            // print in reverse order form index  len-1 to 0
            for (int i = arr.length-1; i >= 0; i--){ // < arr.length works as well
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static int sumIntArray(int [] arr){
        int sum = 0;

        // enhanced for loop or for each
        for (int element : arr){
            sum += element;
        }

//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
        return sum;
    }

    public static double averageOfIntArray(int [] arr){
        int sum = sumIntArray(arr);

        double average = (double) sum / arr.length;

        return average;
    }

    // find max element
    public static int findMax(int [] arr){
        int max = arr[0]; // take element at start
        //max = Integer.MIN_VALUE; // both work

//        for (int element: arr){
//            if(element > max) max = element;
//        }

        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }

        return max;
    }

    public static int countEven(int [] arr){
        int counter = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0) counter++;
        }

        return counter;
    }

    public static boolean checkIfEqual(int [] a, int [] b){
        // check if the length is the same
        if(a.length != b.length) return false;

        //boolean isEqual = true;

        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                //isEqual = false;
                return false;
                //break;
            }
        }

        //return isEqual;
        return true;

    }

    public static boolean searchForElt(int [] arr, int target){
        for (int elt: arr){
            if(elt == target) return true;
        }

        return false;
    }

    public static int [] reverseArray(int [] arr){
        for (int i = 0; i < arr.length/2; i++){
            int tmp = arr[i]; // store one of swapping values in this variable
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }

        return arr;
    }

    public static int [] createCopy(int []arr){
        int [] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    public static int [] createArray(Scanner sc){
        System.out.println("Tell me the number of elements in array: ");
        int length = sc.nextInt();

        int [] arr = new int[length];

        for (int i = 0; i < length; i++){
            System.out.println("Enter " + i + "th element: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int [] createArrayFromString(Scanner sc){
        System.out.println("Enter all integers separated by space:");
        String input = sc.nextLine();
        // split the input into tokens
        String [] tokens = input.split(" ");
        int [] arr =  new int [tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]); // transform String to int if possible
        }

        return arr;
    }







}
