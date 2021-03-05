package Arrays.search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 */

public class TripletWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int sum = 22;
//        Set set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        findTriplet(arr, sum);
    }

    public static void findTriplet(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            Set set = new HashSet();
            int x = sum - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (set.contains(x - arr[j])) {
                    System.out.println(x - arr[j]);
                    System.out.println(arr[j]);
                    System.out.println(arr[i]);
                }
                set.add(arr[j]);
            }
        }

    }
}
