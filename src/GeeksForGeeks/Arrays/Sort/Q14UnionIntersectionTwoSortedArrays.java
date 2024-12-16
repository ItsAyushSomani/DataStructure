package GeeksForGeeks.Arrays.Sort;
/**
 *
 */

public class Q14UnionIntersectionTwoSortedArrays {

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };
        UniounArray(arr1, arr2);
    }

    public static void IntersectionArray(int[] arr, int[] brr) {
        int i = 0, j = 0;
        int temp;
        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                i++;
            } else if (arr[i] > brr[j]) {
                j++;
            } else {
                System.out.println(arr[i]);
                i++;
                j++;
            }
        }
    }

    public static void UniounArray(int[] arr, int[] brr) {
        int i = 0, j = 0;
        int temp = -1;
        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                if (temp != arr[i]) {
                    System.out.println(arr[i]);
                    temp = arr[i];
                }
                i++;
            } else if (arr[i] > brr[j]) {
                if (temp != arr[i]) {
                    System.out.println(brr[j]);
                    temp = brr[j];
                }
                j++;
            } else {
                System.out.println(brr[j]);
                temp = brr[j];
                i++;
                j++;
            }

        }
        while (i < arr.length || j < brr.length) {
            if (i < arr.length) {
                System.out.println(arr[i]);
                i++;
            } else {
                System.out.println(brr[j]);
                j++;
            }

        }
    }
}
