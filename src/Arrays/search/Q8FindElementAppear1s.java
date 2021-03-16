package Arrays.search;

/**
 *XOR of element with itself is zero
 * Given an array of integers. All numbers occur twice except one number which occurs once. Find the number in O(n) time & constant extra space.
 *Input:  ar[] = {7, 3, 5, 4, 5, 3, 4}
 * Output: 7
 */

public class Q8FindElementAppear1s {

    public static void main(String[] args) {
        int arr[] = {7, 3, 5, 4, 5, 3, 4};
        int elementToBeSearched = 0;
        for (int ar: arr) {
            elementToBeSearched = elementToBeSearched^ar;
        }
        System.out.println(elementToBeSearched);
    }
}
