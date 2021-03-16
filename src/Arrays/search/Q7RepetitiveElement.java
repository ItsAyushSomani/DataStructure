package Arrays.search;

import java.util.HashSet;

/**
 * We are given an array arr[] of size n. Numbers are from 1 to (n-1) in random order. The array has only one repetitive element. We need to find the repetitive element.
 */

public class Q7RepetitiveElement {

    public static void main(String[] args) {
        int[] arr = {1, 5, 1, 2, 3, 4};
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (!set.add(j)) System.out.println(j);
        }
        System.out.println(findRepeating(arr, arr.length-1));
    }
//do element ko negative for all locations untill you find a negative element
    public static int findRepeating(int arr[], int n) {
        int missingElement = 0;

        // indexing based
        for (int i = 0; i < n; i++) {

            int element = arr[Math.abs(arr[i])];

            if (element < 0) {
                missingElement = arr[i];
                break;
            }

            arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
        }

        return Math.abs(missingElement);

    }

}
