package LeetCode.Easy;
/**
 *Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * Example 3:
 *
 * Input: nums = [1]
 * Output: 1
 */

public class Q136SingleNumber {

    public static void main(String[] args) {
        int arr[] = {2, 2, 1};
        System.out.println(tempMethod(arr));
    }

    public static int tempMethod(int[] arr) {
        int sum = 0;
        for (int ar: arr) {
            sum = sum ^ ar;
        }
        return sum;
    }
}




