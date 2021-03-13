package Arrays.Rearrangement;

import Arrays.ArrayUtils;

/**
 *Given an array of integers, update every element with multiplication of previous and next elements with following exceptions.
 * a) First element is replaced by multiplication of first and second.
 * b) Last element is replaced by multiplication of last and second last.
 *
 * Example:
 *
 * Input: arr[] = {2, 3, 4, 5, 6}
 * Output: arr[] = {6, 8, 15, 24, 30}
 *
 * // We get the above output using following
 * // arr[] = {2*3, 2*4, 3*5, 4*6, 5*6}
 */

public class Q23ReplaceEveryElementByMulPrevandNext {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int temp = 1;
        int tempPrev = arr[0];
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            if (i == 0) {
                arr[i] = arr[i] * arr[i + 1];
            } else if (i == (arr.length - 1)) {
                arr[i] = tempPrev * arr[i];
            } else {
                arr[i] = tempPrev * arr[i + 1];
            }
            tempPrev = temp;
        }
        ArrayUtils.printArray(arr);
    }
}
