import java.util.Arrays;

/*
 * Week 4 - Solutions
 * Teden 4 - Resitve
 *
 * Topics / Teme:
 *  - 1D array indexing, search, and traversal
 *      (indeksiranje, iskanje in sprehod po 1D tabelah)
 *  - in-place modification and swapping
 *      (spreminjanje elementov na mestu in zamenjava)
 *  - creating and transforming arrays
 *      (ustvarjanje in predelava tabel)
 *  - 2D arrays (matrices)
 *      (dvodimenzionalne tabele / matrike)
 *
 * Try to solve Tasks.java on your own first!
 * Najprej poskusi sam/a resiti naloge v Tasks.java!
 */
public class TasksSolved {

    public static void main(String[] args) {

        // ===== Part A: Search & Traversal / Iskanje in sprehod =====
        System.out.println("--- Task 1: indexOf ---");
        int[] numbers = {10, 20, 30, 20, 40};
        System.out.println(indexOf(numbers, 20)); // Expected: 1
        System.out.println(indexOf(numbers, 40)); // Expected: 4
        System.out.println(indexOf(numbers, 99)); // Expected: -1

        System.out.println("\n--- Task 2: countOccurrences ---");
        int[] scores = {4, 2, 4, 4, 1, 5, 4};
        System.out.println(countOccurrences(scores, 4)); // Expected: 4
        System.out.println(countOccurrences(scores, 2)); // Expected: 1
        System.out.println(countOccurrences(scores, 9)); // Expected: 0

        System.out.println("\n--- Task 3: allPositive ---");
        System.out.println(allPositive(new int[]{3, 7, 1, 12})); // Expected: true
        System.out.println(allPositive(new int[]{3, -1, 4, 8}));  // Expected: false
        System.out.println(allPositive(new int[]{5, 0, 9}));      // Expected: false


        // ===== Part B: In-Place Modification / Spreminjanje na mestu =====
        System.out.println("\n--- Task 4: replaceAll ---");
        int[] items = {1, 2, 3, 2, 4, 2};
        replaceAll(items, 2, 99);
        System.out.println(Arrays.toString(items)); // Expected: [1, 99, 3, 99, 4, 99]

        System.out.println("\n--- Task 5: hasAdjacentDuplicates ---");
        System.out.println(hasAdjacentDuplicates(new int[]{1, 3, 3, 5})); // Expected: true
        System.out.println(hasAdjacentDuplicates(new int[]{1, 2, 3, 1})); // Expected: false
        System.out.println(hasAdjacentDuplicates(new int[]{7}));          // Expected: false

        System.out.println("\n--- Task 6: swap ---");
        int[] letters = {10, 20, 30, 40};
        swap(letters, 0, 3);
        System.out.println(Arrays.toString(letters)); // Expected: [40, 20, 30, 10]


        // ===== Part C: Creating & Combining Arrays / Ustvarjanje tabel =====
        System.out.println("\n--- Task 7: squareAll ---");
        int[] original = {2, -3, 4};
        int[] squared = squareAll(original);
        System.out.println(Arrays.toString(squared));  // Expected: [4, 9, 16]
        System.out.println(Arrays.toString(original)); // Expected: [2, -3, 4] (unchanged)

        System.out.println("\n--- Task 8: concatenate ---");
        int[] first = {1, 2};
        int[] second = {3, 4, 5};
        System.out.println(Arrays.toString(concatenate(first, second))); // Expected: [1, 2, 3, 4, 5]

        System.out.println("\n--- Task 9: subArray ---");
        int[] values = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(subArray(values, 1, 4))); // Expected: [20, 30, 40]
        System.out.println(Arrays.toString(subArray(values, 0, 2))); // Expected: [10, 20]


        // ===== Part D: 2D Arrays (Matrices) / 2D tabele (matrike) =====
        System.out.println("\n--- Task 10: flatten ---");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println(Arrays.toString(flatten(matrix))); // Expected: [1, 2, 3, 4, 5, 6]
    }

    /**
     * Task 1: Return the first index where target appears in arr, or -1 if not found.
     */
    public static int indexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Task 2: Return how many times target appears in arr.
     */
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int element : arr) {
            if (element == target) {
                count++;
            }
        }
        return count;
    }

    /**
     * Task 3: Return true if all elements in arr are strictly positive (> 0).
     */
    public static boolean allPositive(int[] arr) {
        for (int element : arr) {
            if (element <= 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Task 4: Replace all occurrences of oldVal with newVal in arr in-place.
     */
    public static void replaceAll(int[] arr, int oldVal, int newVal) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldVal) {
                arr[i] = newVal;
            }
        }
    }

    /**
     * Task 5: Return true if any two neighboring elements in arr are equal.
     */
    public static boolean hasAdjacentDuplicates(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Task 6: Swap the elements at index i and index j in arr in-place.
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Task 7: Return a new array where each element is squared.
     */
    public static int[] squareAll(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * arr[i];
        }
        return result;
    }

    /**
     * Task 8: Return a new array containing all elements of a followed by b.
     */
    public static int[] concatenate(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            result[a.length + j] = b[j];
        }
        return result;
    }

    /**
     * Task 9: Return a new array with elements from index from (inclusive) to to (exclusive).
     */
    public static int[] subArray(int[] arr, int from, int to) {
        int length = to - from;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = arr[from + i];
        }
        return result;
    }

    /**
     * Task 10: Convert a rectangular 2D matrix into a single 1D array row by row.
     */
    public static int[] flatten(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] result = new int[rows * cols];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[index++] = matrix[i][j];
            }
        }
        return result;
    }
}
