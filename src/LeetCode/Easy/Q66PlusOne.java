package LeetCode.Easy;
/**
 *
 */

import GeeksForGeeks.Arrays.ArrayUtils;

import java.util.ArrayList;
import java.util.Collections;

public class Q66PlusOne {

    public static void main(String[] args) {
        int arr[] = {9, 9, 9};
        arr = plusOne1(arr);
        ArrayUtils.printArray(arr);
    }

    public static int[] plusOne(int[] arr) {
        long num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        num = num + 1;
        ArrayList<Long> list = new ArrayList<>();
        while (num != 0) {
            list.add(num % 10);
            num /= 10;
        }
        Collections.reverse(list);
        return list.stream().mapToInt(Long::intValue).toArray();
    }

    public static int[] plusOne1(int[] arr) {
        ArrayList<Long> list = new ArrayList<>(arr.length + 1);
        if (arr[arr.length - 1] != 9) {
            arr[arr.length - 1] = arr[arr.length - 1] + 1;
            return arr;
        }
        int j = arr.length - 1;
        while (j >= 0 && arr[j] == 9) {
            arr[j] = 0;
            j--;
        }
        if (arr[0] == 0) {
            int[] k = new int[arr.length + 1];
            k[0] = 1;
            j = 1;
            for (int i : arr) {
                k[j] = i;
                j++;
            }
            return k;
        }
        arr[j] = arr[j] + 1;
        return arr;
    }
}
