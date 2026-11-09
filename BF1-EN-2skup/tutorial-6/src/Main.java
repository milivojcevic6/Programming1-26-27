import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // ARRAYS  - data structure that allows us to store
        // more than 1 value in the variable
        int [] arr = {1,2,8,2,-10,5,8,-13}; // shorthand initialization

        int [] arr1; // declare
        arr1 = new int[]{1, 2, 3};

        int [] arr2 = new int [10]; // we created array that stores 10 integers

        // ACCESS ELEMENTS
        System.out.println("Print element at index 4: "+ arr[4]);
        System.out.println("Length of array: " + arr.length);

        System.out.println("Last valid index of arr is length-1: " + (arr.length - 1));
        //System.out.println(arr[arr.length]); //out of bounds

        System.out.println("Default value for int array: " + arr2[3]);
        String [] sArr = new String[4];
        System.out.println("Default value for String array: " + sArr[3]); // same for any object
        boolean [] bArr = new boolean[5];
        System.out.println("Default value for boolean array: " + bArr[3]);

        // PRINT ARRAY
        //System.out.println(arr); //1 2 8 2..-13
        ArraysHelper.printIntArray(arr, true);
        ArraysHelper.printIntArray(arr, false);
        System.out.println("SUM: " + ArraysHelper.sumElements(arr));
        System.out.println("AVERAGE: " + ArraysHelper.averageOfArray(arr));
        System.out.println("MAX: " + ArraysHelper.findMax(arr));
        System.out.println("# of EVEN ELEMENTS: " + ArraysHelper.countEven(arr));
        System.out.println("Is 8 in our arr? " + ArraysHelper.searchInArray(arr,8));

        System.out.println("ORIGINAL");
        ArraysHelper.printIntArray(arr, true);

        int [] reversed = arr.clone();
        ArraysHelper.reverseIntArray(reversed);
        System.out.println("REVERSED");
        ArraysHelper.printIntArray(reversed, true);

        System.out.println("ORIGINAL");
        ArraysHelper.printIntArray(arr, true);
        Scanner sc = new Scanner(System.in);
//        int [] newIntArray = ArraysHelper.createIntArray(sc);
//
//        ArraysHelper.printIntArray(newIntArray,true);
//
//        sc.nextLine(); // process \n left from nextInt()1
//
//        int [] newIntArray2 = ArraysHelper.createArrayFromString(sc);
//
//        ArraysHelper.printIntArray(newIntArray2,true);

        // 2D arrays = matrix or arrays of arrays
        int [][] matrix = {
                {1,2,3}, // row 0
                {4,5,6,-1}, // row 1
                {7,8,9}
        };

        System.out.println("Print element at row index 1 and col index 2: " + matrix[1][2]);

        // print matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            // go to new line/row
            System.out.println();
        }

    }
}
