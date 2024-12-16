package GeeksForGeeks.Heap;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 */
public class Q48SortNearlySortedArray {

    public static void main(String[] args) {
        int[] ar = {6, 5, 3, 2, 8, 10, 9};
        for (int i : sortedArray(ar, 3)) {
            System.out.print(i + "  ");
        }
    }

    private static int[] sortedArray(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue
                = new PriorityQueue<>();
        for (int i = 0; i <= k; i++) {
            priorityQueue.add(arr[i]);
        }
        int index = 0;
        for (int i = k + 1; i < arr.length; i++) {
            arr[index++] = priorityQueue.poll();
            priorityQueue.add(arr[i]);
        }

        Iterator<Integer> itr = priorityQueue.iterator();

        while (itr.hasNext()) {
            arr[index++] = priorityQueue.peek();
            priorityQueue.poll();
        }
        return arr;
    }
}
