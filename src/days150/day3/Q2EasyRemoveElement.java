package days150.day3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q2EasyRemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        IntStream.range(0, nums.length).forEach(i -> System.out.println(nums[i]));
//        removeElement(nums, 2);
//        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int first = 0, second = 0;
        int k = 0;
        while(first < nums.length && second < nums.length) {
            if(nums[first] == val) {
                while(second < (nums.length - 1) && nums[second] == val) {
                    second++;
                }
                if(nums[second] != val) {
                    int temp = nums[first];
                    nums[first++] = nums[second];
                    nums[second++] = temp;
                    k++;
                }
            }
            first++;
            second++;
        }
        return (nums.length - k);
    }
}
