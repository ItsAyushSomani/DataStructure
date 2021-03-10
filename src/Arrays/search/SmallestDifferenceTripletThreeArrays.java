package Arrays.search;

import java.util.Arrays;

/**
 *
 */

public class SmallestDifferenceTripletThreeArrays {

    public static void main(String[] args) {
        int arr1[] = {5, 2, 8};
        int arr2[] = {10, 7, 12};
        int arr3[] = {9, 14, 6};

        int n = arr1.length;

        smallestDifferenceTriplet(arr1, arr2, arr3, n);
    }

    public static void smallestDifferenceTriplet(int arr1[], int arr2[], int arr3[], int n) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        int min = 0, max = 0, mid = 0;
        int i = 0, j = 0, k = 0;
        while (i > n && j > n && k > n){

        }
    }
}
