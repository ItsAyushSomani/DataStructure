//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.

package days150.day1;

import java.util.HashMap;
import java.util.Map;


public class Q1TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hMap.containsKey(target - nums[i])) {
                return new int[]{hMap.get(target - nums[i]), i};
            } else {
                hMap.put(nums[i], i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = twoSum(new int[]{2, 11, 15, 7}, 9);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
