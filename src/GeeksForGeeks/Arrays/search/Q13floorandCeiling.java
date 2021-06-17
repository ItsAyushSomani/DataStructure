package GeeksForGeeks.Arrays.search;

/**
 *
 */

public class Q13floorandCeiling {

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        findfloorandCeilLinearSearch(arr, 0);
        findfloorandCeilLinearSearch(arr, 1);
        findfloorandCeilLinearSearch(arr, 5);
        findfloorandCeilLinearSearch(arr, 20);
    }

    //    public static void findfloorandCeil(int[] arr, int x) {
//
//    }
    public static void findfloorandCeilLinearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                if (i == 0) {
                    System.out.println("No Floor Element");
                    System.out.println("ceil element is" + arr[i+1]);
                    break;
                }
                if (i == arr.length - 1) {
                    System.out.println("Floor Element" + arr[i-1]);
                    System.out.println("No ceil Element");
                    break;
                }
                System.out.println("Floor Element" + arr[i-1]);
                System.out.println("ceil element is" + arr[i+1]);
                break;
            }
        }
    }
}
