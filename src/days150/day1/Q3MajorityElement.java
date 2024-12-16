//Given an array nums of size n, return the majority element.
//
//        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//
//
//        Example 1:
//
//        Input: nums = [3,2,3]
//        Output: 3
//
//        Example 2:
//
//        Input: nums = [2,2,1,1,1,2,2]
//        Output: 2

package days150.day1;

public class Q3MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
    }

    public static int majorityElement(int[] nums) {
        int index = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == index) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                index = nums[i];
                count = 1;
            }
        }
        count = 0;
        for (int num : nums) {
            count = num == index ? count + 1 : count;
        }

        if (count > (nums.length / 2)) return index;
        return 0;
    }
}
