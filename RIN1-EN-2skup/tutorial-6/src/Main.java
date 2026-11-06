import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // Shorthand way to create array
        int [] arr = {1,2,5,-1,0,3,8,7,1};

        // if you separate declaration and initialization
        int [] arr1; // declare
        //arr1 = {2,3,4}; // this will not work
        arr1 = new int [] {2,3,4};

        int [] arr2 = new int [10]; // creates int array that can store 10 integers

        // Access elements using indexes
        System.out.println("Element at index 0: "+ arr[0]);
        System.out.println("Element at index 4: "+ arr[4]);
        //System.out.println("Element at index 40: "+ arr[40]); // error index out of bounds
        System.out.println("Length of array: " + arr.length);
        System.out.println("Last valid indes is: " + (arr.length - 1));
        // we start from 0 bcs index is basically offset from start of array not the position

        // default values for arrays
        System.out.println("Default value for int arrays: " + arr2[0]);
        String [] strArr = new String[2];
        System.out.println("Default value for String arrays: " + strArr[0]);
        boolean [] boolArr = new boolean[2];
        System.out.println("Default value for boolean arrays: " + boolArr[0]);

        // PRINT ARRAY
        System.out.println(arr);
        System.out.println(boolArr);
        System.out.println(strArr); // prints reference from the memory (not useful)

        ArraysHelper.printIntArray(arr, true);
        ArraysHelper.printIntArray(arr, false);

        // sum elements
        System.out.println("Sum of elements: "+ ArraysHelper.sumOfElements(arr));
        System.out.println("Average value: " + ArraysHelper.averageOfArray(arr));
        System.out.println("Max value: " + ArraysHelper.findMax(arr));
        System.out.println("# of odd numbers: " + ArraysHelper.countEven(arr));
        System.out.println("Is 8 in array? " + ArraysHelper.searchForElement(arr,8));
        System.out.println("Is 9 in array? " + ArraysHelper.searchForElement(arr,9));

        int [] a = {1,2,3};
        int [] b = {1,2,3};

        System.out.println("Are a and b exactly the same? " + (a==b));
        System.out.println("Are a and b exactly the same? " + (Arrays.equals(a,b)));

        // reverse array
        int [] reversed = arr.clone();
        ArraysHelper.reverseIntArr(reversed);
        ArraysHelper.printIntArray(reversed, true);
        System.out.println("ORIGINAL ARRAY:");
        ArraysHelper.printIntArray(arr, true);

        // clone array (create a copy)
//        int [] newArr =  arr.clone();
//        ArraysHelper.printIntArray(newArr,true);

        Scanner sc= new Scanner(System.in);
        int [] newArr = ArraysHelper.createIntArray(sc);

        ArraysHelper.printIntArray(newArr, true);

        sc.nextLine(); // process \n form nextInt

        int [] newArr1 = ArraysHelper.createArrayFromString(sc);

        ArraysHelper.printIntArray(newArr1, true);



        sc.close(); // good practice

        // 1D arrays
        // 2D array - matrix, array of arrays, table

//        int [][] matrix = new int [3][3];

        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // print element in row 1 and col 2
        System.out.println("Elemetn in row 1 and col 2: " + matrix[1][2]);

        for (int i = 0; i < matrix.length; i++) { // number of rows
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // go to new line
        }


    }
}
