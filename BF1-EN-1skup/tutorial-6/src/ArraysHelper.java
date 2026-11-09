import java.util.Scanner;

public class ArraysHelper {
    // print array
    public static void printIntArray(int [] arr, boolean fromStart){
        if(fromStart){
            // print from start (forwards)
            System.out.print("Forward print: ");
            for (int i = 0; i < arr.length; i++) { //i <= arr.length - 1
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else {
            // print from end (backwards)
            System.out.print("Backward print: ");
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // sum up elements in array
    public static int sumElements(int [] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Current sum: "+ sum);
//            System.out.println("Adding element at index "+ i + ": " + arr[i]);
            sum += arr[i];
        }

        return sum;
    }

    // average value
    public static double averageOfArray(int [] arr){
        int sum = sumElements(arr); // DRY - dont repeat yourself
        double average = (double) sum / arr.length;
        return average;
    }

    // find max element in array (biggest number in array)
    public static int findMax(int [] arr){
        //int max = Integer.MIN_VALUE; // -1, -10, -2
        int max = arr[0];

        // enhanced for loop (for each)
        for(int number : arr){
            if(number > max) max = number;
        }
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > max) max = arr[i];
//            System.out.println("Index is "+ i);
//        }


        return max;
    }

    // Count even elements in array
    public static int countEven(int [] arr){
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
           if(arr[i] % 2 == 0) counter++;
        }

        return counter;
    }

    // check if element is present in the array
    public static boolean isPresent(int [] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) return true;
        }
        return false;
    }

    // reverse array (in place)
    public static int [] reverseArray(int [] arr){
        for (int i = 0; i < arr.length/2; i++) { // stop at the middle when 2 indexes are equal (first == last)


            // comments are true only for i = 0
            int tmp = arr[i]; // store first element here
            arr[i] = arr[(arr.length - 1) - i]; // put last element on first place
            arr[(arr.length - 1) - i] = tmp;
        }

        return arr;
    }

    // How to use Standard Input (Scanner) to create array
    public static int [] createIntArray(Scanner sc){
        System.out.println("How many elements will you enter: ");
        int len = sc.nextInt();

        int [] arr = new int[len]; // {0,0,0..}

        for (int i = 0; i < len; i++) {
            System.out.print("Insert element on index "+ i + ": ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    // enter elements 1 after another in one line and separate by space(,;)
    public static int [] createArrayFromString(Scanner sc){
        System.out.println("Please enter all numbers you want to " +
                "store in array and separate them with space:");
        String input = sc.nextLine(); // "1 2 3"
        String [] tokens = input.split(" "); // String [] {"1","2","3"}
        int [] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]); // int[] {1,2,3}
        }
        return arr;
    }
}
