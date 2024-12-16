package GeeksForGeeks.DynamicProgramming.Kadane;

/**
 *
 */

public class MaxSubarrayProduct {

    public static void main(String[] args) {
        int[] arr = new int[]{-2,3,-4};
        int result = arr[0];
        int max = result;
        int min = result;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                int temp = max;
                max = min;
                min =temp;
            }
            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);
            result = Math.max(result, max);
        }
        System.out.println(result);
    }


}




