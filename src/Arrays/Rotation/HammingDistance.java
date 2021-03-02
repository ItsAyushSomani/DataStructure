package Arrays.Rotation;

import java.util.Arrays;

/**
 * Given an array of n elements, create a new array which is a rotation of given array and hamming distance between both the arrays is maximum.
 * Hamming distance between two arrays or strings of equal length is the number of positions at which the corresponding character(elements) are different.
 * <p>
 * Note: There can be more than one output for the given input.
 * <p>
 * Input :  1 4 1
 * Output :  2
 * Explanation:
 * Maximum hamming distance = 2.
 * We get this hamming distance with 4 1 1
 * or 1 1 4
 * <p>
 * input :  N = 4
 * 2 4 8 0
 * output :  4
 * Explanation:
 * Maximum hamming distance = 4
 * We get this hamming distance with 4 8 0 2.
 * All the places can be occupied by another digit.
 * Other solutions can be 8 0 2 4, 4 0 2 8 etc.
 */

public class HammingDistance {

    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 0};
        System.out.println(calculateHamingDistance(arr));
    }

    public static int calculateHamingDistance(int[] arr) {
        int count = 0;
        int n = arr.length;
        int[] tempArr = Arrays.copyOf(arr, n);
        for (int j = 0; j < n; j++) {
            int newCount = 0;
            rotate(tempArr);
            Arrays.stream(tempArr).forEach(System.out::print);
            System.out.println();
            for (int i = 0; i < n; i++) {
                if (arr[i] != tempArr[i]) {
                    newCount++;
                }
            }
            count = Math.max(count, newCount);
        }
        return count;
    }

    public static void rotate(int[] arr) {
        int end = arr.length - 1;
        int temp = arr[end];
        for (int i = end; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
}

