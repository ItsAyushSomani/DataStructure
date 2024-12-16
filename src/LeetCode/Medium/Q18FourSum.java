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

public class Q18FourSum {

    public static void main(String[] args) {
        int arr[] = {1, 2, -2, -1};
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = 0;
        Set<List<Integer>> listParent = new HashSet<>();
        while (i < nums.length - 2) {
            j = i + 1;
            while (j < nums.length - 1) {
                int key = 0 - (nums[i] + nums[j]);
                if (Arrays.binarySearch(nums, j + 1, nums.length, key) > 0) {
                    List<Integer> listChild = new ArrayList<>();
                    listChild.add(nums[i]);
                    listChild.add(nums[j]);
                    listChild.add(key);
                    Collections.sort(listChild);
                    listParent.add(listChild);
                }
                j++;
            }
            i++;
        }
        return new ArrayList<>(listParent);
    }
}
