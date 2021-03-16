package Arrays.search;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Input:
 * ar1[] = {1, 5, 10, 20, 40, 80}
 * ar2[] = {6, 7, 20, 80, 100}
 * ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
 * Output: 20, 80
 * <p>
 * Input:
 * ar1[] = {1, 5, 5}
 * ar2[] = {3, 4, 5, 5, 10}
 * ar3[] = {5, 5, 10, 20}
 * Output: 5, 5
 */

public class Q5CommonElementsThreeSortedArrays {

    public static void main(String[] args) {
        int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100} ;
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} ;
        Set s2 = Arrays.stream(ar2).boxed().collect(Collectors.toSet());
        Set s3 = Arrays.stream(ar3).boxed().collect(Collectors.toSet());
//        for (int i = 0; i < ar1.length; i++) {
//            if (s2.contains(ar1[i]) && s3.contains(ar1[i])) {
//                System.out.print(ar1[i]);
//            }
//        }
        for (int j = 0; j < ar1.length; j++) {
            if (search(ar2, 0, ar2.length-1, ar1[j]) && search(ar3, 0, ar3.length-1, ar1[j])) {
                System.out.print(ar1[j]);
            }
        }
    }

    public static boolean search(int arr[], int start, int end, int toBeSearched) {
        if (start <= end) {
            if (start == (arr.length - 1) && end == 0) {
                return false;
            }
            int mid = (start + end) / 2;
            if (arr[mid] == toBeSearched) {
                return true;
            }
            if (arr[start] > toBeSearched && arr[end] < toBeSearched)
                return search(arr, start, mid, toBeSearched);

            return search(arr, mid + 1, end, toBeSearched);
        }
        return false;
    }
}

