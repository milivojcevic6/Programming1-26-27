import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // ARRAYS
        int [] arr = {1,2,8,7,-3,0,10,2}; // shorthand initialization

        int [] arr1; // declaration
        //arr1 = {1,2,34,5};
        arr1 = new int[]{1, 2, 34, 5};
        int [] arr2 = new int [10]; //we created array that stores 10 integers

        System.out.println("Element at index 3 in arr: " + arr[3]);
        System.out.println("First element of array: " + arr[0]);
        System.out.println("Length of array: " + arr.length);
        System.out.println("Last element of array: " + arr[arr.length - 1]);
        System.out.println("Last valid index of array: " + (arr.length - 1));
        //System.out.println("Access invalid index: " + arr[arr.length]); // out of bounds


        System.out.println("Default value for int array: " + arr2[2]);

        String [] sArr = new String[18];
        System.out.println("Default value for String array: " + sArr[12]);
        boolean [] bArr = new boolean[19];
        System.out.println("Default value for boolean array: " + bArr[2]);


//        System.out.println(arr);
        ArraysHelper.printIntArray(arr, true);
        ArraysHelper.printIntArray(arr, false);

        System.out.println("SUM: " + ArraysHelper.sumOfElements(arr));
        System.out.println("AVERAGE: " + ArraysHelper.averageOfArray(arr));
        System.out.println("MAX: " + ArraysHelper.findMax(arr));
        System.out.println("NUMBER OF EVEN ELEMENTS: " + ArraysHelper.countEven(arr));
        System.out.println("Is 7 in arr? " + ArraysHelper.isElementInArray(arr, 7));
        System.out.println("Is 77 in arr? " + ArraysHelper.isElementInArray(arr, 77));

        System.out.println("ORIGINAL");
        ArraysHelper.printIntArray(arr,true);

        System.out.println("REVERSED");
        int [] reversed = arr.clone(); // creates new instance of array with exactly same elements
        ArraysHelper.reverseArray(reversed);
        ArraysHelper.printIntArray(reversed, true);

        System.out.println("ORIGINAL");
        ArraysHelper.printIntArray(arr,true);

        int [] a = {1,2,3};
        int [] b = {1,2,3};

        System.out.println("Are a and b equal? "+ (a == b));
        System.out.println("Are a and b equal? "+ Arrays.equals(a,b));
        System.out.println("Are a and b equal? "+ ArraysHelper.equals(a,b));

        Scanner scan = new Scanner(System.in);
//        int [] newArr = ArraysHelper.createIntArray(scan);
//        ArraysHelper.printIntArray(newArr, true);
//
//        scan.nextLine(); // process \n left by nextInt()
//
//        int [] newArr2 = ArraysHelper.createArrayFromString(scan);
//        ArraysHelper.printIntArray(newArr2, true);

        // 2D arrays = Matrix, Table, array of arrays
        int [][] matrix = {
                {1,2,3}, // row 0
                {4,5,6,0}, // row 1
                {7,8,9} // row 2
        };

        System.out.println("Print element at row 1 and col 2: " + matrix[1][2]);

        for (int i = 0; i < matrix.length; i++) { // rows
            for (int j = 0; j < matrix[i].length; j++) { // num of columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();//go to new line/row
        }

    }
}
