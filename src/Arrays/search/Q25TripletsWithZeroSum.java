package Arrays.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 */

public class Q25TripletsWithZeroSum {

    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        findTriplet(arr, set);

    }

    public static void findTriplet(int[] arr, Set set) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                if (x + arr[left] + arr[right] == 0) {
                    System.out.print(x + " ");
                    System.out.print(arr[left] + " ");
                    System.out.println(arr[right] + " ");
                    left++;
                    right--;
                } else if (x + arr[left] + arr[right] > 0) right--;
                else left++;
            }
        }
    }
}