package Array;

public class ReverseAlgorithArrayRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 2);
        for (int ar : arr) {
            System.out.print(ar);
        }
    }

    // reverse till d
    //reverse d to n
    // reverse all elements
    private static void rotate(int[] arr, int d) {
        if(arr.length == 0) return;
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    // logic to reverse
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
