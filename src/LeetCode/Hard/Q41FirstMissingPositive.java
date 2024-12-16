package LeetCode.Hard;

public class Q41FirstMissingPositive {

    public static int firstMissingPositive(int[] nums) {
        int positiveIntValue = 1;
        for(int i = 0; i < 1e5; i++) {
            if(!isValueAvailableInArray(nums, positiveIntValue)) {
                return positiveIntValue;
            }
            positiveIntValue++;
        }
        return -1;
    }
    public static boolean isValueAvailableInArray(int[] nums, int positiveIntValue) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == positiveIntValue) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1,2,0}));
        System.out.println(1e5);
    }
}
