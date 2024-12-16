package days150.day1;
//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//
//
//
//        Example 1:
//
//        Input: nums = [-4,-1,0,3,10]
//        Output: [0,1,9,16,100]
//        Explanation: After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100].

public class Q5SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-4,-1,0,3,10};
        nums = sortedSquares(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int pos = nums.length-1;
        for(int i = 0; i < nums.length; i++ ){
            nums[i] = nums[i] * nums[i];
        }
        while(left <= right) {
            if(nums[left] > nums[right]) {
                result[pos] = nums[left];
                left++;
            } else {
                result[pos] = nums[right];
                right--;
            }
            pos--;
        }
        return result;
    }
}
