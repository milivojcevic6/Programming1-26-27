import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // ARRAYS
        int [] arr = {8,2,1,0,-3,4,6,10,2};
        // shorthand initialization
        int [] arr1; // declaration
        //arr1 = {1,2,3}; // this is not allowed
        arr1 = new int [] {1,2,3};

        int [] arr2 = new int [10];
        // creates array for 10 int elements

        // how to access element
        System.out.println("Element at index 0: " + arr[0]);
        // default values for arrays
        System.out.println("Default value for int array: " + arr2[2]);
        String [] sArr = new String[3];
        System.out.println("Default value for String (or any Object) array: " + sArr[0]);

        boolean [] bArr = new boolean[2];
        System.out.println("Default value for boolean array: " + bArr[1]);

        System.out.println("First element of array: " + arr[0]);
        System.out.println("Length of array: " + arr.length);
        System.out.println("Last element of array: " + (arr[arr.length - 1]));
        //System.out.println("Invalid index of array: " + (arr[arr.length])); // out of bounds exception

        // print array
        System.out.println(arr);
        ArraysHelper.printIntArray(arr, true);
        ArraysHelper.printIntArray(arr, false);
        //System.out.printf("The number %d %s %.1f", 2, "ad", 2.3);
        System.out.println("SUM: " + ArraysHelper.sumOfArray(arr));
        System.out.println("AVERAGE: " + ArraysHelper.averageOfArray(arr));
        System.out.println("MAX: " + ArraysHelper.max(arr));
        System.out.println("# OF EVEN INTS: " + ArraysHelper.countEven(arr));
        System.out.println("Is -3 in array: " + ArraysHelper.findTarget(arr,-3));
        System.out.println("Is 123 in array: " + ArraysHelper.findTarget(arr,123));
        System.out.println("ORIGINAL ARRAY");
        ArraysHelper.printIntArray(arr,true);
        int [] reverse = arr.clone();
        ArraysHelper.reverseArray(reverse);
        System.out.println("REVERSED ARRAY");
        ArraysHelper.printIntArray(reverse,true);
        System.out.println("ORIGINAL ARRAY");
        ArraysHelper.printIntArray(arr,true);

        // check if 2 arrays are equal (exactly same) same elements on same indexes
        int [] a = {1,2,3};
        int [] b = {1,2,3};

        System.out.println("Are a and b equal? " + (a == b));
        System.out.println("Are a and b equal? " + (Arrays.equals(a,b)));
        System.out.println("Are a and b equal? " + (ArraysHelper.equals(a,b)));

        Scanner sc = new Scanner(System.in);
        int [] newArr = ArraysHelper.createArray(sc);
        ArraysHelper.printIntArray(newArr,true);

        sc.nextLine(); // just to process \n left by nextInt

        int [] newArr2 = ArraysHelper.createArrayFromString(sc);
        ArraysHelper.printIntArray(newArr2,true);

        // 1D arrays
        // 2D array

        int [][] matrix = {
                {1,2,3}, // row 0
                {4,5,6}, // row 1
                {7,8,9}
        };

        System.out.println("Print element at row 1 and col 2: " + matrix[1][2]);

        for (int i = 0; i < matrix.length; i++) { // rows
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            // go to new line
            System.out.println();
        }


    }
}
