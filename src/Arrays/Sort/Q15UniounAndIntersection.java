package Arrays.Sort;
/**
 * Given two unsorted arrays that represent two sets (elements in every array are distinct), find union and intersection of two arrays.
 * For example, if the input arrays are:
 * arr1[] = {7, 1, 5, 2, 3, 6}
 * arr2[] = {3, 8, 6, 20, 7}
 * Then your program should print Union as {1, 2, 3, 5, 6, 7, 8, 20} and Intersection as {3, 6, 7}.
 * Note that the elements of union and intersection can be printed in any order.
 */

import Arrays.ArrayUtils;

import java.util.HashSet;

public class Q15UniounAndIntersection {

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 6, 2, 3, 5};
        int brr[] = {2, 4, 5, 6, 8, 9, 4, 6, 5};
        printUnion(arr, brr);
        printIntersection(arr, brr);
//        ArrayUtils.printArray(arr);
    }

    public static void printUnion(int[] arr, int[] brr) {
        HashSet h = new HashSet();
        for (int ar : arr) {
            h.add(ar);
        }
        for (int br : brr) {
            h.add(br);
        }
        System.out.println(h);
    }

    public static void printIntersection(int[] arr, int[] brr) {
        HashSet h = new HashSet();
        for (int ar : arr) {
            h.add(ar);
        }
        for (int br : brr) {
            if (!h.add(br)) {
                System.out.print(br + "  ");
            }
        }
    }
}
