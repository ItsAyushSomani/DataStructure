//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
//
//        Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
//
//        Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
//        Return k.
//
//        Custom Judge:
//
//        The judge will test your solution with the following code:
//
//        int[] nums = [...]; // Input array
//        int[] expectedNums = [...]; // The expected answer with correct length
//
//        int k = removeDuplicates(nums); // Calls your implementation
//
//        assert k == expectedNums.length;
//        for (int i = 0; i < k; i++) {
//        assert nums[i] == expectedNums[i];
//        }
//
//        If all assertions pass, then your solution will be accepted.
//
//
//
//        Example 1:
//
//        Input: nums = [1,1,2]
//        Output: 2, nums = [1,2,_]
//        Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//        It does not matter what you le

package days150.day2;

import java.util.HashSet;
import java.util.Set;


public class Q1Q2RemoveDuplicateFromSortedArray1and2 {

    public static int removeDuplicates(int[] nums) {
        Set<Integer> hSet = new HashSet<>();
        int pos = 0;
        for(int i = 0; i < nums.length; i++) {
            if(!hSet.contains(nums[i])) {
                hSet.add(nums[i]);
                nums[pos++] = nums[i];
            }
        }
        return pos;
    }

    public static int removeDuplicatesWithoutMemory(int[] nums) {
        int pos = 1;
        for(int i=1; i<nums.length;i++) {
            if(nums[i] != nums[i-1]) {
                nums[pos++] = nums[i];
            }
        }
        return pos;
    }
    public static int removeDuplicates2(int[] nums) {
        int pos = 1;
        int count = 1;
        for(int i=1; i<nums.length;i++) {
            if(nums[i] != nums[i-1]) {
                nums[pos++] = nums[i];
                count = 1;
            } else if(nums[i] == nums[i-1] && count < 2) {
                nums[pos++] = nums[i];
                count++;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        int[] nums1 = new int[]{1,1,1,2,2,3};
        int[] nums2 = new int[]{1,1,1,2,2,3};
        removeDuplicates(nums);
        for (int num : nums) {
            System.out.print(num);
        }
        removeDuplicatesWithoutMemory(nums1);
        for (int num : nums1) {
            System.out.print(num);
        }
        removeDuplicates2(nums2);
        for (int num : nums2) {
            System.out.print(num);
        }
    }
}
