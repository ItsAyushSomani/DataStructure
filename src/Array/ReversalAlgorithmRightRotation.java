package Array;

/**
 * Given an array, right rotate it by k elements.
 */

public class ReversalAlgorithmRightRotation {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rightRotaionIndex = 3;
        // We follow exactly reverse order of statments we evaluated for left rotation
        reverse(arr, 0, arr.length-1);
        reverse(arr, rightRotaionIndex, arr.length-1);
        reverse(arr, 0, rightRotaionIndex-1);
        for (int ar: arr) {
            System.out.println(ar);
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        int n = end - start;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[start + i];
            arr[start + i] = arr[end - i];
            arr[end - i] = temp;
        }
    }
}
