package Arrays.search;

/**
 *Since array is sorted, the first thing clicks into mind is binary search, but the problem here is that we don’t know size of array.
 * If the array is infinite, that means we don’t have proper bounds to apply binary search. So in order to find position of key, first we find bounds and then apply binary search algorithm.
 *
 * Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element,
 * ->if it is greater than high index element then copy high index in low index and double the high index.
 * ->if it is smaller, then apply binary search on high and low indices found.
 *
 *
 * Solution - till val is less than to be searched do left = right and update value of right by 2 if less than array.length
 */

public class searchInSortedInfiniteArray {

    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int ans = search(arr,10);
        if (ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
    }

    public static int search(int[] arr, int toBeSearched) {
        int val = arr[0];
        int firstPointer = 0;
        int secondPointer = 1;
        while(val < toBeSearched) {
           firstPointer = secondPointer;

            if(secondPointer*2 < arr.length-1) {
                secondPointer = 2*secondPointer;
            } else {
                secondPointer = arr.length - 1;
            }
            val = arr[secondPointer];
        }
        return binarySearch(arr, firstPointer, secondPointer, toBeSearched);
    }

    public static int binarySearch(int arr[], int start, int end, int toBeSearched) {
        if (start <= end) {
            if (start == (arr.length - 1) && end == 0) {
                return -1;
            }
            int mid = (start + end) / 2;
            if (arr[mid] == toBeSearched) {
                return mid;
            }
            if (arr[start] > toBeSearched && arr[end] < toBeSearched)
                return binarySearch(arr, start, mid, toBeSearched);

            return binarySearch(arr, mid + 1, end, toBeSearched);
        }
        return -1;
    }
}
