package GeeksForGeeks.Arrays.Sort;
/**
 *
 */

import java.util.*;

public class Q9SortAccToFrequency {

    public static void main(String[] args) {
        int arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};
        sortAccToFreq(arr);
    }

    static <K, V extends Comparable<? super V>>
    SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(
                new Comparator<Map.Entry<K, V>>() {
                    @Override
                    public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                        int res = e2.getValue().compareTo(e1.getValue());
                        return res != 0 ? res : 1;
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }

    public static void sortAccToFreq(int[] arr) {
        TreeMap<Integer, Integer> hmap = new TreeMap<>();
        for (int ar : arr) {
            if (hmap.containsKey(ar)) {
                hmap.put(ar, hmap.get(ar) + 1);
            } else {
                hmap.put(ar, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : entriesSortedByValues(hmap)) {
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print(entry.getKey() + "  ");
            }
        }
    }
}
