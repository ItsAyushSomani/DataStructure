package LeetCode.Easy;

/**
 *
 */

public class Q88MergeSortedArrays {

    public static void main(String[] args) {
        int nums1[] = {0};
        int nums2[] = {1};
        merge(nums1, 0, nums2, 1);
        for (int i = 0; i < nums1.length; i++)
            System.out.print(nums1[i] + " ");
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k=0;
        while (k < m  && j < n) {
            if (nums2[j] < nums1[i]) {
                int temp = (m + n) - 1;
                while (temp > i) {
                    nums1[temp] = nums1[temp - 1];
                    temp--;
                }
                nums1[temp] = nums2[j];
                i++;
                j++;
            } else {
                i++;
                k++;
            }
        }
        while (j < n) {
            nums1[i] = nums2[j];
            i++;
            j++;
        }
    }

}
