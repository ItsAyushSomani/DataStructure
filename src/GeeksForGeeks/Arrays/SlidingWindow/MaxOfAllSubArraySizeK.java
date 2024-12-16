package GeeksForGeeks.Arrays.SlidingWindow;

import java.util.*;

public class MaxOfAllSubArraySizeK {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> queue = new LinkedList<>();
        int i = 0, j = 0;
        while(j < nums.length) {
            if(queue.size() == 0) {
                queue.add(nums[j]);
            } else {
                while(queue.size() > 0 && queue.peekLast() < nums[j]){
                    queue.removeLast();
                }
                queue.add(nums[j]);
            }
            if(j - i + 1 < k) {
                j++;
            } else if(j - i + 1 == k) {
                result.add(queue.peek());
                if(queue.peek() == nums[i]) {
                    queue.removeFirst();
                }
                i++;
                j++;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
