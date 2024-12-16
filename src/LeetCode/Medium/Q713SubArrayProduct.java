package LeetCode.Medium;

public class Q713SubArrayProduct {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        return getAllSubarrays(nums, k, nums.length);
    }

    public static int getAllSubarrays(int[] nums, int k, int index) {
        if(k <= 1 || index == 0 ) return 0;
        if(k > nums[index - 1]) {
            return 1 + getAllSubarrays(nums, k/nums[index-1], index-1) + getAllSubarrays(nums, k, index-1);
        } else {
            return getAllSubarrays(nums, k, index-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100));
    }
}
