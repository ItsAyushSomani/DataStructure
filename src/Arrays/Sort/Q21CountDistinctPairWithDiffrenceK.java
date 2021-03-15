package Arrays.Sort;
/**
 *
 */

import Arrays.ArrayUtils;

import java.util.Arrays;
import java.util.HashSet;

public class Q21CountDistinctPairWithDiffrenceK {

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 2};
        int k = 3;
        System.out.println("Count of pairs with given diff is "
                + countPairsWithDiffK(arr, k));
    }

    public static int countPairsWithDiffK(int[] arr, int k) {
        int count = 0;
        HashSet hset = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            hset.add(arr[i]);
            if (hset.contains(k - arr[i]) || hset.contains(arr[i] - k)) {
                count++;
            }
        }
        return count;
    }
}
