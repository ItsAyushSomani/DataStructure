package GeeksForGeeks.Arrays.Sort;

import GeeksForGeeks.Arrays.ArrayUtils;

import java.util.PriorityQueue;

public class HeapSort {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
        heapSort(arr);
        ArrayUtils.printArray(arr);
    }

    public static void heapSort(int[] arr) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : arr) {
            minHeap.add(i);
        }
        int i = 0;
        while(minHeap.size() > 0) {
            arr[i] = minHeap.poll();
            i++;
        }
    }
}
