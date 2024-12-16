package GeeksForGeeks.Arrays;

/**
 *
 */

public class ArrayUtils {


    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void printArray(int arr[], int maxLength) {
        for (int i = 0; i <= maxLength; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
