package GeeksForGeeks.Arrays.Rotation;

/**
 * Given an array, only rotation operation is allowed on array. We can rotate the array as many times as we want.
 * Return the maximum possible summation of i*arr[i].
 * Input: arr[] = {1, 20, 2, 10}
 * Output: 72
 * We can get 72 by rotating array twice.
 * {2, 10, 1, 20}
 * 20*3 + 1*2 + 10*1 + 2*0 = 72
 * <p>
 * Input: arr[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9}
 * Output: 330
 * We can get 330 by rotating array 9 times.
 * {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
 * 0*1 + 1*2 + 2*3 ... 9*10 = 330
 */

public class MaximumValueOfSum {

    public static void main(String[] args) {
        int currSum;
        int[] arr = {1, 20, 18, 19};
        int d = findMax(arr);
        int sum = 0;
        reverse(arr, 0, d);
        reverse(arr, d+1, arr.length-1);
        reverse(arr, 0, arr.length - 1);
        for (int i = 0; i< arr.length; i++) {
            sum += (arr[i]*i);
        }
        System.out.println(sum);
    }

    public static int findMax(int[] arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void reverse(int arr[], int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
