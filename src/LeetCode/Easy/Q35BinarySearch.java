package LeetCode.Easy;
/**
 *
 */

public class Q35BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        System.out.println(searchInsert(arr, 2));

    }

    public static int searchInsert(int[] nums, int target) {
        return BinarySearch(nums, 0, nums.length - 1, target);
    }

    private static int BinarySearch(int[] nums, int start, int end, int target) {
        if(target > nums[end]) return end+1;
        if(start < end) {
            int mid = (start+end)/2;
            if(nums[mid] == target) return mid;

            if(target < nums[mid])
                return BinarySearch(nums, start, mid, target);

            return BinarySearch(nums,  mid+1, end, target);
        }
        return start;
    }
}
