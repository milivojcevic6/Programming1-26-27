import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // ARRAYS
        int [] arr = {1,2,0,-3,18,9,-2,8};//shorthand initialization

        int [] arr2; // declare it
        //intArr2 = {1,2,3};
        arr2 = new int [] {1,2,3};
        int [] arr3 = new int [10];
        // creates int array that can store 10 int values
        System.out.println("Element at index 0: " + arr[0]);
        // index tells offset of the start of array not the position in array

        arr2[0] = 123124;
        System.out.println("Changed elemetn at index 0: " + arr2[0]);


        System.out.println("Default value for int array: " + arr3[2]);
        String [] strArr = new String [3];
        System.out.println("Default value for String array: " + strArr[2]);
        boolean [] boolArr = new boolean[3];
        System.out.println("Default value for boolean array: " + boolArr[0]);

        System.out.println("Length of array: " + arr.length);

        System.out.println("Last element: " + arr[arr.length - 1]);
        //System.out.println("Illegal index: " + arr[arr.length]);

        // PRINT ARRAY
        System.out.println(arr);
        System.out.println(strArr);
        // prints reference to the object in memory not actual data
        ArraysHelper.printIntArray(arr, true);
        ArraysHelper.printIntArray(arr, false);
        System.out.println("Sum: " + ArraysHelper.sumElements(arr));
        System.out.println("Average: " + ArraysHelper.averageOfArray(arr));
        System.out.println("Max element: "+ ArraysHelper.findMax(arr));
        System.out.println("Even elements: "+ ArraysHelper.countEven(arr));
        System.out.println("Is element -3 in array?: "+ ArraysHelper.findInArray(arr,-3));
        System.out.println("Is element 10 in array?: "+ ArraysHelper.findInArray(arr,10));

        // COMPARE TWO ARRAYS
        int [] a = {1,2,3};
        int [] b = {1,2,3};
        System.out.println("Are a and b exactly the same? " + (a == b)); // compares pointers/references
        System.out.println("Are a and b exactly the same? " + Arrays.equals(a,b)); // compares element by element
        System.out.println("Are a and b exactly the same? " + ArraysHelper.equals(a,b)); // our own implementatnion

        System.out.println("ORIGINAL ARR: ");
        ArraysHelper.printIntArray(arr, true);
        // if we want to keep original array untouched we need to create a copy
        int [] reversed = arr.clone(); // exact same array on new location in memory
        ArraysHelper.reverseArray(reversed);
        System.out.println("REVERSED ARRAY");
        ArraysHelper.printIntArray(reversed, true);
        System.out.println("ORIGINAL ARR: ");
        ArraysHelper.printIntArray(arr, true);

        // How to prompt user about array
        Scanner sc = new Scanner(System.in);
        int [] newArr = ArraysHelper.createArray(sc);
        ArraysHelper.printIntArray(newArr, true);
        sc.nextLine(); // process \n left from nextInt
        System.out.println();
        int [] newArr2 =  ArraysHelper.createArrayFromString(sc);
        ArraysHelper.printIntArray(newArr2,true);

        // 1D arrays everything above
        // 2D array - matrix, table, array of arrays

        //int [][] matrix = new int[2][2];
        int [][] matrix = {
                {1,2,3}, // row 0
                {4,5,6}, // row 1
                {7,8,9}
        };

        System.out.println("Printing element in row 1 and column 2: " + matrix[1][2]);

        for (int i = 0; i < matrix.length; i++) { // rows
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // go to next line/row
        }






    }
}
