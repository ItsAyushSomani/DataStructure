package GeeksForGeeks.Arrays.search;

/**
 *
 */

public class Q12LeaderIntheArray {

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        findLeaderofArr(arr);
    }

    public static void findLeader(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                }
            }
            if (count == 0 || i == (arr.length - 1)) {
                System.out.print(arr[i]);
            }
        }

    }
    public static void findLeaderofArr(int[] arr) {
        int n= arr.length-1;
        int max = arr[n];
        System.out.print(max);
        for (int i = n-1; i >=0; i--) {
            if(arr[i] > max) {
                max = arr[i];
                System.out.print(max);
            }
        }

    }

}
