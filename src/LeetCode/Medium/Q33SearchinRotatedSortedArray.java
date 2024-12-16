package LeetCode.Medium;

/**
 *
 */
public class Q33SearchinRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public static int binarySearch(int[] nums, int start, int end, int target) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) return mid;
            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target <= nums[mid]) {
                    return binarySearch(nums, start, mid - 1, target);
                }
                return binarySearch(nums, mid + 1, end, target);
            }
            if (target >= nums[mid] && target <= nums[end])
                return binarySearch(nums, mid + 1, end, target);
        }
        return -1;
    }
}
