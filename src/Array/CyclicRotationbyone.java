package Array;

public class CyclicRotationbyone {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr);
        for (int ar : arr) {
            System.out.print(ar);
        }
    }

    //cyclic rotation
    public static void rotate(int[] arr) {
        int temp = arr[arr.length - 1];
        int i;
        for (i = (arr.length - 1); i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
}
