package GeeksForGeeks.Arrays.Sort;
/**
 *
 */

public class Q20FindPairsXYArrayWhereXPOWYGreaterThanYPOWX {

    public static void main(String[] args) {
        int X[] = {2, 1, 6};
        int Y[] = {1, 5};
        System.out.println("Total pairs = " + countPairs(X, Y));
    }

    public static int countPairs(int[] arr, int[] brr) {
        int count = 0;
        int[] tempArray = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                if (Math.pow(arr[i], brr[j]) >
                        Math.pow(brr[j], arr[i])) {
                    count++;
                }
            }
        }
        return count;
    }
}
