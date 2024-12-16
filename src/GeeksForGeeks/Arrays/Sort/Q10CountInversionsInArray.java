package GeeksForGeeks.Arrays.Sort;
/**
 *
 */

public class Q10CountInversionsInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 20, 6, 4, 5};
        System.out.println("Number of inversions are "
                + getInvCount(arr));
    }

    public static int getInvCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
