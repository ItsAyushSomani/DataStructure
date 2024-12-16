package LeetCode.Easy;
/**
 *
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Stream;

public class Q26RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] s = new int[]{1, 1, 2};
        removeDuplicates(s);
        for (int i : s) {
            System.out.println(i);
        }
    }

    public static void removeDuplicates(int[] nums) {
        HashSet<Integer> hSet = new HashSet();
        for (int num : nums) {
            hSet.add(num);
        }
        nums = new int[hSet.size()];
//        Iterator<Integer> i = hSet.iterator();
//        int j = 0;
//
//        while (i.hasNext()) {
//            nums[j] = i.next();
//            j++;
//        }
//
//        return hSet.size();
    }
}
