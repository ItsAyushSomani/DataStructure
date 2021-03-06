package GeeksForGeeks.Arrays.Sort;
/**
 *
 */

public class Q19CountPossibleTriangles {

    public static void main(String[] args) {
        int arr[] = {10, 21, 22, 100, 101, 200, 300};
        System.out.println("Total number of triangles possible is " +
                findNumberOfTriangles(arr));
    }

    public static int findNumberOfTriangles(int[] arr) {
        int i = 0, j = 1, k = 2, count = 0;
        while (i < arr.length - 3) {
            if (k == arr.length && j == arr.length - 2) {
                i++;
                j = i + 1;
                k = j + 1;
            } else if (k == arr.length) {
                j = j + 1;
                k = j + 1;
            }
            if (arr[k] < (arr[i] + arr[j])) {
                System.out.println("{" + arr[i] + "," + arr[j] + "," + arr[k] + "}");
                count++;
            }
            k++;
        }
        return count;
    }
}
