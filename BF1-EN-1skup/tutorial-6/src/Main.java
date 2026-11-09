import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // ARRAY
        int [] arr = {1,3,5,0,-3,10,-11}; // shorthand initialization

        int [] arr1; // declare
        //arr1 = {1,2,3}; // not allowed
        arr1 = new int[]{1, 2, 3}; // not allowed

        int [] arr2 = new int[10]; // creates array that stores 10 integer values

        System.out.println("Element at index 3 in arr: " + arr[3]);
        System.out.println("Default value for int array: " + arr2[1]);
        String [] sArr = new String[23];
        System.out.println("Default value for String array: " + sArr[10]);
        boolean [] bArr = new boolean[5];
        System.out.println("Default value for boolean array: " + bArr[1]);

        System.out.println("Length of array: " + arr.length);
        System.out.println("First element is at index 0: " + arr[0]);
        System.out.println("Last element is at index length - 1: " + arr[arr.length - 1]);

        //System.out.println("Print element at index >= len: " + arr[10]);//out of bounds

        //System.out.println(arr);
        ArraysHelper.printIntArray(arr, true);
        ArraysHelper.printIntArray(arr, false);
        System.out.println("SUM: " + ArraysHelper.sumElements(arr));
        System.out.println("AVERAGE: " + ArraysHelper.averageOfArray(arr));
        System.out.println("MAX: " + ArraysHelper.findMax(arr));
        System.out.println("# of EVEN ELEMENTS: " + ArraysHelper.countEven(arr));
        System.out.println("Is 5 in arr: " + ArraysHelper.isPresent(arr,5));
        System.out.println("Is -5 in arr: " + ArraysHelper.isPresent(arr,-5));

        System.out.println("ORIGINAL");
        ArraysHelper.printIntArray(arr, true);

        int [] reversed = arr.clone(); // create new array with same elements
        ArraysHelper.reverseArray(reversed);


        System.out.println("REVERSED");
        ArraysHelper.printIntArray(reversed, true);


        System.out.println("ORIGINAL");
        ArraysHelper.printIntArray(arr, true);

        Scanner sc = new Scanner(System.in);
//        int [] newIntArr = ArraysHelper.createIntArray(sc);
//        ArraysHelper.printIntArray(newIntArr,true);
//
//        sc.nextLine(); // this will process \n left by nextInt()
//
//        int [] newIntArr2 = ArraysHelper.createArrayFromString(sc);
//        ArraysHelper.printIntArray(newIntArr2, true);

        // 2D array - Matrix, table, array of arrays
        int [][] matrix = {
                {1,2,3}, // row 0
                {4,5,6,-5}, // row 1
                {7,8,9} // row 2
        };

        System.out.println("Print element at row 1 and col 2: " + matrix[1][2]);

        // print whole matrix
        for (int i = 0; i < matrix.length; i++) { // rows
            for (int j = 0; j < matrix[i].length ; j++) { //cols
                System.out.print(matrix[i][j]  +" ");
            }
            System.out.println();//go to new line/row
        }


    }
}
