package LeetCode.Medium;
/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Example 2:
 * <p>
 * Input: nums = []
 * Output: []
 * Example 3:
 * <p>
 * Input: nums = [0]
 * Output: []
 */

import java.util.*;

public class Q16ThreeSumClosest {

    public static void main(String[] args) {
        int arr[] = {0, 2, 1, -3};
        System.out.println(threeSumClosest(arr, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int mindDiff = Integer.MAX_VALUE;
        int output = 0;
        int i = 0, j = 0, k = 0;
        while (i < nums.length - 2) {
            j = i + 1;
            k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[k] + nums[j];
                int diff = Math.abs(sum - target);
                if (diff < mindDiff) {
                    mindDiff = diff;
                    output = sum;
                }
                if(sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
            i++;
        }
        return output;
    }
}
