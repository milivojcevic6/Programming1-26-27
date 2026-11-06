import java.util.Scanner;

public class ArraysHelper {
    public static void printIntArray(int [] arr, boolean fromStart){
        if(fromStart){
            // if we want to print it forwards
            System.out.print("Forward print: ");
            for (int i = 0; i < arr.length; i++){ // same as <= arr.length - 1
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }else{
            // if we want to print it backwards
            System.out.print("Backwards print: ");
            for (int i = arr.length - 1; i >= 0; i--){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static int sumOfElements(int [] arr){
        int sum = 0;

        // enhanced for loop (for each)
        for (int element : arr){ // for each int element in arr we do
            sum += element;
        }
//        for (int i = 0; i < arr.length; i++){ // for each int element in arr we do
//            sum += arr[i];
//        }

        return sum;
    }

    public static double averageOfArray(int [] arr){
        int sum = sumOfElements(arr); // keep your code DRY - dont repeat yourself
        return (double) sum / arr.length;
    }

    public static int findMax(int [] arr){
        int max = arr[0]; // set max to be first element in arr
        for (int elt : arr){
            if(elt > max) max = elt; // if we used i -> arr[i]
        }
        return max;
    }

    public static int countEven(int [] arr){
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                counter++;
            }
        }

        return counter;
    }


    public static boolean searchForElement(int [] arr, int target){
        for (int elt: arr){
            if(elt == target) return true;
        }
        return false;
    }

    // REVERSE ARRAY (not just print in reverse)
    public static int [] reverseIntArr(int [] arr){
        for (int i = 0; i < arr.length/2; i++){
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        return arr;
    }

    // allow user to enter array
    public static int [] createIntArray(Scanner sc){
        System.out.println("Please enter the length of array: ");
        int length = sc.nextInt();

        int [] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter " + i + "th element:");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static int [] createArrayFromString(Scanner sc){
        System.out.println("Enter numbers delimited by spaces: ");
        String input = sc.nextLine();

        String [] tokens = input.split(" "); // now we have {"1", "2"...}
        //tranform to integers
        int []arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]); // this transforms string to int if valid
        }

        return arr;
    }


}
