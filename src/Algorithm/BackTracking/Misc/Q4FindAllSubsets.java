package Algorithm.BackTracking.Misc;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class Q4FindAllSubsets {

    public static void main(String[] args) {
        //Main List for storing all subsets
        Set<Set<Integer>> Set = new HashSet<>();
        Set<Integer> subSet = new HashSet<>();
        // Input ArrayList
        int[] arr = new int[]{1, 2, 3};
        findSubsets(Set, arr, subSet, 0);
        System.out.println(Set);
    }

    private static void findSubsets(Set<Set<Integer>> set, int[] arr, Set<Integer> subSet, int i) {
        if (i == arr.length) {
            set.add(new HashSet<>(subSet));
            return;
        }
        findSubsets(set, arr, subSet, i + 1);
        subSet.add(arr[i]);
        findSubsets(set, arr, subSet, i + 1);
        subSet.remove(arr[i]);
    }
}
