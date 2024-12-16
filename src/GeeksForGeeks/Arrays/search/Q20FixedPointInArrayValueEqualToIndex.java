package GeeksForGeeks.Arrays.search;
/**
 *
 */

public class Q20FixedPointInArrayValueEqualToIndex {

    public static void main(String[] args) {
        int arr[] = {-10, -1, 0, 3, 10, 11, 30, 50, 100};
        System.out.println("Fixed Point is "
                + Search(arr, 0, arr.length - 1));
    }

    public static int Search(int[] arr, int start, int end) {
        if (end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == mid) return mid;
            if (mid > arr[mid])
                return Search(arr, (mid + 1), end);
            else
                return Search(arr, start, (mid - 1));
        }
        return -1;
    }
}
