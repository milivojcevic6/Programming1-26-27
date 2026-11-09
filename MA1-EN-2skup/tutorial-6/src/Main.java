import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // ARRAYS
        int [] arr = {5,2,1,3,10,-2,-15,11}; // shorthand initialization

        // declaration
        int [] arr1;

        // initialization
        //arr1 = {2,3,4}; // not allowed
        arr1 = new int [] {2,3,4}; // not allowed
        int [] arr2 = new int[5]; // creates array that stores 5 integers

        System.out.println(arr[1]); // element of arr at index 1
        // (offset from start is 1, position is 2)

        System.out.println("Default value for int array: " + arr2[2]); // default
        String [] sArr = new String[2];
        System.out.println("Default value for String array: " + sArr[1]); // for any object
        boolean [] bArr = new boolean [5];
        System.out.println("Default value for boolean array: " + bArr[1]);

        System.out.println("Length of array: " + arr.length);
        System.out.println("Last valid index for arr: " + (arr.length - 1));

        //System.out.println("Try to access element at index>=len of array: " + bArr[5]);

        // PRINT ARRAY

//        System.out.println(arr);
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.printf("Hello %s I am %d years old %.1f", "Bogdan", 25, 3.123);

        ArraysHelper.printIntArray(arr, true);
        ArraysHelper.printIntArray(arr, false);

        System.out.println("SUM: " + ArraysHelper.sumOfElements(arr));
        System.out.println("AVERAGE: "+ ArraysHelper.averageOfArray(arr));
        System.out.println("MAX ELEMENT: " + ArraysHelper.findMax(arr));
        System.out.println("NUMBER OF EVEN ELEMENTS: " + ArraysHelper.countEven(arr));
        System.out.println("IS 10 IN arr: " + ArraysHelper.isThere(arr,10));
        System.out.println("IS 112 IN arr: " + ArraysHelper.isThere(arr,112));

        int [] a = {1,2,3};
        int [] b = {1,2,3};

        System.out.println("Are a and b exactly the same: " + (a == b));
        System.out.println("Are a and b exactly the same: " + Arrays.equals(a,b)); //built in
        System.out.println("Are a and b exactly the same: " + ArraysHelper.equals(a,b)); // our own method

        System.out.println("ORIGINAL");
        ArraysHelper.printIntArray(arr, true);

        int [] reversed = arr.clone(); // creates copy of array but new object/referce
        ArraysHelper.reverseArray(reversed);
        System.out.println("REVERSED ARRAY");
        ArraysHelper.printIntArray(reversed, true);

        System.out.println("ORIGINAL");
        ArraysHelper.printIntArray(arr, true);

        Scanner sc = new Scanner(System.in);
//        int [] newIntArr = ArraysHelper.createIntArray(sc);
//
//        ArraysHelper.printIntArray(newIntArr, true);
//
//        sc.nextLine(); // processes \n created by nextInt
//
//        int [] newIntArr2 = ArraysHelper.createIntArrayFromString(sc);
//
//        ArraysHelper.printIntArray(newIntArr2, true);

        // 2D array - matrix or array of arrays
        int [][] matrix = {
                {1,2,3}, // row 0
                {4,5,6,9}, // row 1
                {7,8,9} // row 2
        };

        System.out.println("Print element in row 1 and col 2: " + matrix[1][2]);

        for (int i = 0; i < matrix.length; i++) { // number of rows (arrays)
            for (int j = 0; j < matrix[i].length; j++) { // number of elements in each row (array)
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // start new row
        }



    }
}
