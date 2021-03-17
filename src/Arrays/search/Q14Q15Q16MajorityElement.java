package Arrays.search;
/**
 *
 */

import Arrays.ArrayUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q14Q15Q16MajorityElement {

    public static void main(String[] args) {
        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        majorityElement(arr);
        System.out.println("Two POinter results");
        majorityElementTwoPointer(arr);

    }

    public static void majorityElement(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (h.containsKey(arr[i])) {
                h.put(arr[i], h.get(arr[i]) + 1);
            } else {
                h.put(arr[i], 1);
            }
        }
        System.out.println(h);
        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            if (entry.getValue() > (arr.length / 2)) {
                System.out.println("Majority Element");
                return;
            }
        }
        System.out.println("Not a majority Element");
    }

    public static void majorityElementTwoPointer(int[] arr) {
        int i = 0, j = 0;
        int count = 0, max = 0;
        Arrays.sort(arr);
        while (j < arr.length) {
            if (arr[j] != arr[i]) {
                max = Math.max(max, j - i);
                i = j;
            }
            j++;
        }
        max = Math.max(max, j - i);
        if (max < (arr.length / 2)) {
            System.out.println("Not a majority Element");
        } else {
            System.out.println("majority");
        }
    }
}
