package Arrays.RangeQueries;
/**
 *
 */

import Arrays.ArrayUtils;

import java.util.ArrayList;

public class Q1MOAlgorithm {

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 1, 3, 4, 5, 2, 8};
        ArrayList<Integer> q = new ArrayList<Integer>();
        q.add(Query(arr, 0, 4));
        q.add(Query(arr, 1, 3));
        q.add(Query(arr, 2, 4));
        System.out.println(q);
    }


    public static int Query(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
