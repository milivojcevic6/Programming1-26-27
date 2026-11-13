import java.util.Arrays;

/*
 * Week 4 - Tasks
 * Teden 4 - Naloge
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
 * Fill in every method marked with TODO, then run main to check your output.
 * Dopolni vse metode oznacene s TODO in pozeni main, da preveris izpis.
 * Solutions / Resitve: TasksSolved.java
 */
public class Tasks {

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
     * indexOf([10, 20, 30, 20], 20) -> 1
     * indexOf([10, 20, 30], 99) -> -1
     */
    public static int indexOf(int[] arr, int target) {
        // TODO
        return -1;
    }

    /**
     * Task 2: Return how many times target appears in arr.
     * countOccurrences([4, 2, 4, 4, 1], 4) -> 3
     * countOccurrences([1, 2, 3], 5) -> 0
     */
    public static int countOccurrences(int[] arr, int target) {
        // TODO
        return 0;
    }

    /**
     * Task 3: Return true if all elements in arr are strictly positive (> 0).
     * Otherwise return false.
     * allPositive([3, 7, 1]) -> true
     * allPositive([3, -1, 4]) -> false
     */
    public static boolean allPositive(int[] arr) {
        // TODO
        return false;
    }

    /**
     * Task 4: Replace all occurrences of oldVal with newVal in arr in-place.
     * replaceAll([1, 2, 3, 2], 2, 99) -> [1, 99, 3, 99]
     */
    public static void replaceAll(int[] arr, int oldVal, int newVal) {
        // TODO
    }

    /**
     * Task 5: Return true if any two neighboring elements in arr are equal (arr[i] == arr[i+1]).
     * hasAdjacentDuplicates([1, 3, 3, 5]) -> true
     * hasAdjacentDuplicates([1, 2, 3, 1]) -> false
     */
    public static boolean hasAdjacentDuplicates(int[] arr) {
        // TODO
        return false;
    }

    /**
     * Task 6: Swap the elements at index i and index j in arr in-place.
     * swap([10, 20, 30, 40], 0, 3) -> [40, 20, 30, 10]
     */
    public static void swap(int[] arr, int i, int j) {
        // TODO
    }

    /**
     * Task 7: Return a NEW array where each element is the square of the corresponding element in arr.
     * The input array arr must remain unchanged.
     * squareAll([2, -3, 4]) -> [4, 9, 16]
     */
    public static int[] squareAll(int[] arr) {
        // TODO
        return new int[0];
    }

    /**
     * Task 8: Return a NEW array containing all elements of a followed by all elements of b.
     * concatenate([1, 2], [3, 4, 5]) -> [1, 2, 3, 4, 5]
     */
    public static int[] concatenate(int[] a, int[] b) {
        // TODO
        return new int[0];
    }

    /**
     * Task 9: Return a NEW array with elements from index from (inclusive) to to (exclusive).
     * subArray([10, 20, 30, 40, 50], 1, 4) -> [20, 30, 40]
     */
    public static int[] subArray(int[] arr, int from, int to) {
        // TODO
        return new int[0];
    }

    /**
     * Task 10: Convert a rectangular 2D matrix into a single 1D array row by row.
     * flatten({{1, 2, 3}, {4, 5, 6}}) -> [1, 2, 3, 4, 5, 6]
     */
    public static int[] flatten(int[][] matrix) {
        // TODO
        return new int[0];
    }
}
