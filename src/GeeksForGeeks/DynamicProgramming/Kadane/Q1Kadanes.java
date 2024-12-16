package GeeksForGeeks.DynamicProgramming.Kadane;

/**
 *
 */

public class Q1Kadanes {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,-2,4};
        int result = arr[0];
        int currSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum * arr[i]);
            result = Math.max(result, currSum);
        }
        System.out.println(result);
    }


}




