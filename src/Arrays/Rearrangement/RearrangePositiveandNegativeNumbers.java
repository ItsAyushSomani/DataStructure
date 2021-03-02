package Arrays.Rearrangement;

/**
 * Input :  arr[] = [12, 11, -13, -5, 6, -7, 5, -3, -6]
 * Output : arr[] = [-13, -5, -7, -3, -6, 12, 11, 6, 5]
 * -13 12 11 -5 -6
 * <p>
 * Input :  arr[] = [-12, 11, 0, -5, 6, -7, 5, -3, -6]
 * Output : arr[] =  [-12, -5, -7, -3, -6, 0, 11, 6, 5]
 */


public class RearrangePositiveandNegativeNumbers {

    public static void main(String[] args) {
       int arr[] = {0, -12, 11, 0, -5, 6, -7, 5, 0, -3, 0,  -6, 0};
//        int arr[] = {1, 2, 3, 4};
//        rotateRight(arr, 0, 3);
        reArrangeWithSingleTraversal(arr);
        for (int ar : arr) {
            System.out.println(ar);
        }
    }

    // o(n) , single traversal; // solution for move Zeros to end
    private static void reArrangeWithSingleTraversal(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        while (j < n) {
            if (arr[j] < 0) {  // if need to move positive to end change this cond to arr[i]<0
                rotateRight(arr, i, j);
                i++;
            }
            else if(arr[j] == 0){
                rotateRight(arr, i, j);
            }
            j++;
        }
    }

    public static void rotateRight(int[] arr, int start, int end) {
        int temp = arr[end];
        for (int i = end; i > start; i--) {
            arr[i] = arr[i-1];
        }
        arr[start] = temp;
    }

    public static void reverse(int[] arr, int start, int end) {
        int n = end - start;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[start + i];
            arr[start + i] = arr[end - i];
            arr[end - i] = temp;
        }
    }
}
