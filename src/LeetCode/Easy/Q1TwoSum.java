package LeetCode.Easy;
/**
 *
 */

import java.util.HashMap;
import java.util.Map;

public class Q1TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int key = map.get(nums[i]);
                return new int[]{key, i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = twoSum(new int[]{2, 7, 11, 15}, 9);
        if (arr != null) {
            for (int i : arr) {
                System.out.println(i);
            }
        }
    }
}
