package GeeksForGeeks.Heap;

import java.util.PriorityQueue;

/**
 *
 */
public class Q10KthLargestElement {

    public static void main(String[] args) {
        int k = 3;
        int[] prim_array = {1, 23, 12, 9, 30, 2, 50};
        System.out.print(kLargest(prim_array, k));
    }

    private static int kLargest(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            priorityQueue.add(arr[i]);
        }
        for(int i=k; i<arr.length; i++) {
            if(priorityQueue.peek() < arr[i]) {
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }
        }
        return priorityQueue.peek();
    }
}
