package Array;

public class Programforarrayrotation {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        arr = rotate(arr, 2, arr.length);
        for (int ar : arr) {
            System.out.print(ar);
        }
    }

    // complexity n
    public static int[] rotate(int arr[], int d, int n) {
        int j = 0;
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++, d++) {
             if (d < n) {
                newArr[i] = arr[d];
            } else {
                 newArr[i] = arr[j];
                 j++;
             }
        }
        return newArr;
    }

//    public static void rotate1(int arr[], int d, int n) {
//        for (int i = 0; i < n-1 ; i++) {
//            arr[i] = arr[n];
//
//        }
//        return newArr;
//    }
}
