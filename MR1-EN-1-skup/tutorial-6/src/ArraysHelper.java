import java.util.Scanner;

public class ArraysHelper {
    public static void printIntArray(int [] arr, boolean fromStart){
        if(fromStart){
            // print forwards
            System.out.print("Forward print: ");
            for (int i = 0; i <= arr.length-1; i++) { // i < arr.length
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }else{
            // print backwards
            System.out.print("Backwards print: ");
            for (int i = arr.length-1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // sum of elements in array
    public static int sumOfElements(int [] arr){
        //arr[0] + arr[1] + ...
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    // average value of array
    public static double averageOfArray(int [] arr){
        int sum = sumOfElements(arr);

        double average = (double) sum / arr.length;
        return average;
    }

    // find max element in array(biggest number)
    public static int findMax(int [] arr){
        int max = arr[0]; // 0 does not work as a number
        //int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i]; // update max
        }

        return max;
    }

    // count even elements in array
    public static int countEven(int [] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) counter++;
        }

        return counter;
    }

    // check if number is in array or not
    public static boolean isElementInArray(int [] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number) return true;
        }
        return false;
    }

    // reverse array - in place
    public static int [] reverseArray(int [] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int tmp = arr[i]; // element from front of array
            arr[i] = arr[(arr.length - 1) - i]; // element from back of array
            arr[(arr.length - 1) - i] = tmp;
        }

        return arr;
    }

    public static boolean equals(int[] a, int[] b){
        if(a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) return false;
        }
        return true; // we went through whole array and did not find 2 elements that differ
    }

    // get array from user
    public static int [] createIntArray(Scanner sc){
        System.out.println("Please tell me number of elements:");
        int len = sc.nextInt();

        int [] arr = new int [len]; // {0,0,0,0,...0}

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at index "+ i + ": ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    // get all elements at once and dont ask for length
    public static int [] createArrayFromString(Scanner sc){
        System.out.println("Enter as many number as you want and separate them with comma: ");
        String input = sc.nextLine();

        System.out.println(input); // "1,2,3"
        String [] tokens = input.split(",");// String [] {"1", "2", "3"}
        int [] arr = new int [tokens.length];  // {1,2,3}

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]); // tries to convert string to int
        }

        return arr;
    }
}

