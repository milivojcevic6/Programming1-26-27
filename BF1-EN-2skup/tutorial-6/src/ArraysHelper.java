import java.util.Scanner;

public class ArraysHelper {
    // print array
    public static void printIntArray(int [] arr, boolean fromStart){
        if(fromStart){
            // print forwards
            System.out.print("Printing array forwards: ");
            for (int i = 0; i <= arr.length - 1; i++) { //i < arr.length
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else {
            // print backwards
            System.out.print("Printing array backwards: ");
            for (int i = arr.length - 1; i >= 0; i--) { //i < arr.length
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // sum up all elements in array
    public static int sumElements(int [] arr){
        int sum = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
//            System.out.println("Current sum: " + sum);
//            System.out.println("Adding arr at " + i + " to it: " + arr[i]);
            sum = sum + arr[i]; // sum += arr[i];
        }
        return sum;
    }

    // calculate average of array
    public static double averageOfArray(int [] arr){
        int sum = sumElements(arr); // dry - dont repeat yourself

        double average = (double) sum / arr.length;
        return average;
    }

    // find max element (biggest number in array)
    public static int findMax(int [] arr){
        int max = arr[0]; // -1, -10, -2

        // enhanced for loop (for each loop)
        for(int element : arr){
            if(max < element) max = element;
        }

//        for(int i = 0; i < arr.length; i++){
//            if(max < arr[i]) max = arr[i];
//        }

        return max;
    }

    // count even elements in array
    public static int countEven(int [] arr){
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) counter++; // counter += 1; 1 will not work on negative numbers
        }

        return counter;
    }

    // check if some number is in the array or not
    public static boolean searchInArray(int [] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]) return true;
        }
        return false;
    }

    // Reverse array
    public static int [] reverseIntArray(int [] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int tmp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = tmp;
        }
        return arr;
    }

    // Create array using Scanner
    public static int [] createIntArray(Scanner sc){
        System.out.println("What is the length of array?");
        int len = sc.nextInt();

        int [] arr = new int[len]; // {0,0,...0}

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Insert element at index "+ i + ":");
            arr[i] = sc.nextInt();
        }

        return arr;

    }
    // if we want user to enter elements without telling us length
    // insert separated by space
    // "1 2 3"
    // use split(" ") -> {"1","2","3"}
    // transform strings to ints {1,2,3}

    public static int [] createArrayFromString(Scanner sc){
        System.out.println("Enter all elements separated by space: ");
        String input = sc.nextLine();
        String [] tokens = input.split(" ");
        int [] arr = new int [tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        return arr;
    }
}
