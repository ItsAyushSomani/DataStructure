package Revision;

import java.util.List;

/**
 *
 */
public class Dupliates {

    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 1, 1};
        int N = 5;
        printDuplicates(arr, N);
    }

    // 0
    // num = 4
    //

    private static void printDuplicates(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            int num = Math.abs(arr[i]) - 1;
            if(arr[num] < 0) {
                System.out.println(Math.abs(arr[i]));
            }
            arr[num] = -Math.abs(arr[num]);
        }
    }

}
