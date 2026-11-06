import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // int array
        int [] arr = {1,2,3}; // indexes : 0,1,2 // offset from start of array
        // shorthand initialization
        System.out.println("Element at index 1: " + arr[1]);
        int [] arr1; // declaration
        //arr1 = {1,2,3,4}; only works in the same line
        //arr1 = new int[]{1,2,3,4}; // this works

        //how we do it usually
        int [] arr2 = new int [5]; // we created array that can store 5 integers
        System.out.println("Default value for int array: " + arr2[1]);
        String [] strArr = new String[10];
        System.out.println("Default value for String array: " + strArr[1]);
        boolean [] boolArr = new boolean[2];
        System.out.println("Default value for boolean array: " + boolArr[1]);

        // try to access index that does not exist
        //System.out.println(strArr[10]); // the most common error
        // How to get length of array
        System.out.println("Length of String array: " + strArr.length);
        // last legal index
        System.out.println("Last legal index: " + (strArr.length - 1));

        // PRINT ARRAY
        arr1 = new int[]{1,4,2,-5,0,-6,17,213,8};
//        System.out.println(strArr);
//        System.out.println(arr1);
//        System.out.println(boolArr); // reference to the place in memory
        ArraysHelper.printIntArray(arr1, true);
        System.out.println();
        ArraysHelper.printIntArray(arr1, false);

        //SUM UP ELEMENTS
        System.out.println();
        //System.out.println("SUM OF ELEMENTS OF arr: " + (arr[0] + arr[1] + arr[2]));
        // not efficient
        System.out.println("SUM: " + ArraysHelper.sumIntArray(arr1));

        // FIND AVERAGE OF ARRAY
        System.out.println("Average: " + ArraysHelper.averageOfIntArray(arr1));

        // FIND MAX
        System.out.println("MAX ELEMENT: " + ArraysHelper.findMax(arr1));

        // COUNT EVEN ELEMENTS
        System.out.println("Number of even elements: " + ArraysHelper.countEven(arr1));

        // Compare 2 arrays
        int [] a = {1,2,3};
        int [] b = {1,2,3};
//        System.out.println(a == b);
//        System.out.println(Arrays.equals(a, b));
        System.out.println("Are a and b equal? " + ArraysHelper.checkIfEqual(a,b));
        System.out.println("Are a and arr1 equal? " + ArraysHelper.checkIfEqual(a,arr1));
        // search for element
        System.out.println("Is 0 in arr1: " + ArraysHelper.searchForElt(arr1, 0));
        System.out.println("Is 5432 in arr1: " + ArraysHelper.searchForElt(arr1, 5432));

        // reverse array
        int [] reversed = ArraysHelper.createCopy(arr1);
        ArraysHelper.reverseArray(reversed);
        ArraysHelper.printIntArray(reversed, true);
        System.out.println();
        System.out.println("ORIGINAL ARRAY: ");
        ArraysHelper.printIntArray(arr1, true);


        // GET ARRAY FROM STANDARD INPUT (FROM USER)
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int [] newArr = ArraysHelper.createArray(sc);
        ArraysHelper.printIntArray(newArr,true);
        sc.nextLine(); // process \n at the end of nextInt

        int [] newArr2 = ArraysHelper.createArrayFromString(sc);
        ArraysHelper.printIntArray(newArr2,true);

        // 1D arrays
        // 2D arrays  - matrix

        int [][] matrix = {{1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Element at row 1 and col 2: " + matrix[1][2]);
    }
}
