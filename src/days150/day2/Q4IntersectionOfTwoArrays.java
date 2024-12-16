package days150.day2;
//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
//
//
//
//        Example 1:
//
//        Input: nums1 = [1,2,2,1], nums2 = [2,2]
//        Output: [2]
//
//        Example 2:
//
//        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//        Output: [9,4]
//        Explanation: [4,9] is also accepted.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q4IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        System.out.println(set);
        for (final int num : nums2)
            if (set.remove(num))
                ans.add(num);

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,1};
        int[] nums1 = new int[]{2, 2};

        int[] nums3 = intersection(nums, nums1);
        for (int num : nums3) {
            System.out.print(num);
        }
    }

}
