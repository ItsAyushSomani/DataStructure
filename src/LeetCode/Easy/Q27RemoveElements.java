package LeetCode.Easy;
/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */

import GeeksForGeeks.Arrays.ArrayUtils;

public class Q27RemoveElements {

    public static void main(String[] args) {
        int arr[] = {3, 2, 2, 3};
        int j = removeElement(arr, 3);
        ArrayUtils.printArray(arr, j);
    }

    public static int removeElement(int[] nums, int val) {
        int j = nums.length - 1;
        for (int i = 0; i <= j; i++) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                i--;
                j--;
            }
        }
        return j;
    }
}
