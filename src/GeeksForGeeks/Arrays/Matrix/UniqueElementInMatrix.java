package GeeksForGeeks.Arrays.Matrix;

import java.util.HashMap;
import java.util.Map;

/**
 *Given a matrix mat[][] having n rows and m columns. We need to find unique elements in matrix i.e, those elements which are not repeated in the matrix or those elements whose frequency is 1.
 *
 * Examples:
 *
 * Input :  20  15  30  2
 *          2   3   5   30
 *          6   7   6   8
 * Output : 3  20  5  7  8  15
 *
 * Input :  1  2  3
 *          5  6  2
 *          1  3  5
 *          6  2  2
 * Output : No unique element in the matrix
 */

public class UniqueElementInMatrix {

    public static void main(String[] args) {
        int arr[][] = {{ 1, 2, 3, 20},
            {5, 6, 20, 25},
            {1, 3, 5, 6},
            {6, 7, 8, 15}};

        // function that calculate unique element
        printUnique(arr);
    }

    public static void printUnique(int arr[][]) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i=0; i< arr.length; i++) {
            for (int j=0; j< arr[0].length; j++) {
                if(hmap.containsKey(arr[i][j])){
                    hmap.put(arr[i][j], hmap.get(arr[i][j])+1);
                } else {
                    hmap.put(arr[i][j], 1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
