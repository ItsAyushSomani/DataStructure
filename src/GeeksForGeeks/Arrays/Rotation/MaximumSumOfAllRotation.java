package GeeksForGeeks.Arrays.Rotation;

import java.util.Arrays;

/**
 * Input: arr[] = {8, 3, 1, 2}
 * Output: 29
 * Explanation: Lets look at all the rotations,
 * {8, 3, 1, 2} = 8*0 + 3*1 + 1*2 + 2*3 = 11
 * {3, 1, 2, 8} = 3*0 + 1*1 + 2*2 + 8*3 = 29
 * {1, 2, 8, 3} = 1*0 + 2*1 + 8*2 + 3*3 = 27
 * {2, 8, 3, 1} = 2*0 + 8*1 + 3*2 + 1*3 = 17
 * <p>
 * Input: arr[] = {3, 2, 1}
 * Output: 7
 * Explanation: Lets look at all the rotations,
 * {3, 2, 1} = 3*0 + 2*1 + 1*2 = 4
 * {2, 1, 3} = 2*0 + 1*1 + 3*2 = 7
 * {1, 3, 2} = 1*0 + 3*1 + 2*2 = 7
 */


public class MaximumSumOfAllRotation {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = rotationSum(arr);
        }
        System.out.println(findMax(brr));
        System.out.println(maxSum(arr));
        Arrays.parallelSort(arr);
    }

    public static int rotationSum(int[] arr) {
        int sum = 0;
        int temp = arr[0];
        int i;
        for (i = 0; i < (arr.length - 1); i++) {
            arr[i] = arr[i + 1];
            sum += arr[i] * i;
        }
        arr[i] = temp;
        return sum + (temp * i);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = i;
            }
        }
        return max;
    }

    static int maxSum(int[] arr) {
        // Find array sum and i*arr[i] with no rotation
        int arrSum = 0;  // Stores sum of arr[i]
        int currVal = 0;  // Stores sum of i*arr[i]
        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];
            currVal = currVal + (i * arr[i]);
        }
        // Initialize result as 0 rotation sum
        int maxVal = currVal;
        // Try all rotations one by one and find
        // the maximum rotation sum.
        for (int j = 1; j < arr.length; j++) {
            currVal = currVal + arrSum - arr.length * arr[arr.length - j];
            if (currVal > maxVal)
                maxVal = currVal;
        }
        // Return result
        return maxVal;
    }
}
