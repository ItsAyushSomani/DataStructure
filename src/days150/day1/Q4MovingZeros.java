//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//        Note that you must do this in-place without making a copy of the array.
//
//
//
//        Example 1:
//
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//
//        Example 2:
//
//        Input: nums = [0]
//        Output: [0]


        package days150.day1;

public class Q4MovingZeros {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 11, 15, 7};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int left = 0;
        int right = 1;
        while (left < nums.length - 1 && right < nums.length) {
            if (nums[left] == 0) {
                while (right < nums.length) {
                    if (nums[right] != 0) {
                        nums[left] = nums[right];
                        nums[right] = 0;
                        break;
                    }
                    right++;
                }
            } else {
                left++;
                right++;
            }
        }
    }
}

