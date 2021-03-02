package Arrays.Rotation;

/**
 * Input: arr[] = {8, 3, 1, 2}
 * Output: 29
 * Explanation: Lets look at all the rotations,
 * {8, 3, 1, 2} = 8*0 + 3*1 + 1*2 + 2*3 = 11
 * {3, 1, 2, 8} = 3*0 + 1*1 + 2*2 + 8*3 = 29
 * {1, 2, 8, 3} = 1*0 + 2*1 + 8*2 + 3*3 = 27
 * {2, 8, 3, 1} = 2*0 + 8*1 + 3*2 + 1*3 = 17
 *
 * Input: arr[] = {3, 2, 1}
 * Output: 7
 * Explanation: Lets look at all the rotations,
 * {3, 2, 1} = 3*0 + 2*1 + 1*2 = 4
 * {2, 1, 3} = 2*0 + 1*1 + 3*2 = 7
 * {1, 3, 2} = 1*0 + 3*1 + 2*2 = 7
 */


public class MaximumSumOfAllRotation {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        int[] brr = new int[arr.length];
        for (int i=0; i< arr.length; i++) {
            brr[i] = rotationSum(arr);
        }
        System.out.println(findMax(brr));
    }

    public static int rotationSum(int[] arr) {
        int sum = 0;
        int temp = arr[0];
        int i;
        for (i = 0; i < (arr.length-1); i++) {
            arr[i] = arr[i+1];
            sum += arr[i]*i;
        }
        arr[i] = temp;
        return sum + (temp*i);
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
}
