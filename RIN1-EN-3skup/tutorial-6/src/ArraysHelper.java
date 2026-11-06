import java.util.Scanner;

public class ArraysHelper {
    public static void printIntArray(int [] arr, boolean fromStart){
        if(fromStart) {
            System.out.println("Forward print: ");
            for (int i = 0; i < arr.length; i++) {//i <= arr.length - 1 also okay
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }else{
            System.out.println("Backwards print: ");
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static int sumElements(int [] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) sum+=arr[i];

        return sum;
    }

    public static double averageOfArray(int [] arr){
        int sum = sumElements(arr); // Keep code DRY - dont repeat yourself

        return (double) sum / arr.length;
    }

    public static int findMax(int [] arr){
        int max = arr[0];

        // enhanced for (for each)
        for (int element : arr){ // for each int element in arr we do
            if(element > max) max = element;
        }

//        for (int i = 0; i < arr.length; i++){ // for each int element in arr we do
//            if(arr[i] > max) max = arr[i];
//        }
//
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

    public static boolean findInArray(int[] arr, int target){
        //boolean isPresent = false;
        for(int elt : arr){
            if(target == elt) return true; // isPresent = true;
        }

        //return isPresent;
        return false;
    }

    public static boolean equals(int [] a , int [] b){
        if(a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) return false;
        }

        return true;
    }

    // reverse an array
    public static int [] reverseArray(int [] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        return arr;
    }

    // Get array from STDIN
    public static int [] createArray(Scanner sc){
        System.out.println("Length of array: ");
        int length = sc.nextInt();

        int [] arr = new int[length]; // currently it is {0,0,0...}

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter "+ i + "th element of array: ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static int [] createArrayFromString(Scanner sc){
        System.out.println("Please enter as many number as you want but separate them with space: ");
        String input = sc.nextLine(); // we get "10 2 3"
        // use split to split input into string array
        String [] tokens = input.split(" "); // we get {"10", "2", "3"}
        int [] arr = new int[tokens.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]); // {10,2,3}
        }
        return arr;
    }
}
