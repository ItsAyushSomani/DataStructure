package GeeksForGeeks.Arrays.search;

/**
 * In an unsorted array, the Array.search operation can be performed by linear traversal from the first element to the last element.
 */
public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {12, 34, 10, 6, 40};
        int n = arr.length;

        // Using a last element as Array.search element
        int key = 40;
        int position = linearSearch(arr, key);

        if (position == - 1)
            System.out.println("Element not found");
        else
            System.out.println("Element Found at Position: "
                    + (position + 1));
    }

    public static int linearSearch(int[] arr, int toBeSearched) {
        if (arr.length < 1) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toBeSearched) {
                return i;
            }
        }
        return -1;
    }
}
