package GeeksForGeeks.Arrays.Rearrangement;

import java.util.Arrays;

/**
 * (arr[j] + key).compareTo(key + arr[j]) < 0
 */

public class Q15BiggestNumber {
    public static void main(String[] args) {
        String[] arr = {"1", "34", "3", "98", "9", "76", "45", "4"};
        sort(arr);
        Arrays.stream(arr).forEach(System.out::print);
    }

    public static void sort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && (arr[j] + key).compareTo(key + arr[j]) < 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}


