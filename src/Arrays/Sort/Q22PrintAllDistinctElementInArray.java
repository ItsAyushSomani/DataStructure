package Arrays.Sort;
/**
 *
 */

import Arrays.ArrayUtils;

import java.util.HashMap;
import java.util.HashSet;

public class Q22PrintAllDistinctElementInArray {

    public static void main(String[] args) {
        int ar[] = {12, 10, 9, 45, 2, 10, 10, 45};
        HashSet<Integer> hSet = new HashSet<Integer>();
        for (int i = 0; i < ar.length; i++) {
            hSet.add(ar[i]);
        }
        // Using hm.keySet() to print output reduces time complexity. - Lokesh
        System.out.println(hSet);

    }
}
