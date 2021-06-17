package GeeksForGeeks.Arrays.Sort;
/**
 *
 */

import java.util.Arrays;

public class Q25ProductMaximumFirstArrayMinimumInSecond {
    public static void main(String[] args) {
        int arr1[] = {5, 7, 9, 3, 6, 2};
        int arr2[] = {1, 2, 6, -1, 0, 9};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1[arr1.length-1]*arr2[0]);
    }
}
