package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Q155MinStack {

    public static void main(String[] args) {
    }

    class MinStack {
        public List<Integer> list;
        int top = -1;
        int min = Integer.MAX_VALUE;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            list = new ArrayList<>();
        }

        public void push(int val) {
            list.add(val);
            top++;
            min = Math.min(this.min, val);
        }

        public void pop() {
            if (list.remove(this.top) == this.min) {
                if (list.size() > 0) {
                    System.out.println("list" + list);
                    this.min = list.stream().min(Integer::compare).get();
                } else {
                    this.min = Integer.MAX_VALUE;
                }
            }
            top--;
        }

        public int top() {
            System.out.println(this.top);
            System.out.println(list);
            return list.get(this.top);
        }

        public int getMin() {
            return this.min;
        }
    }
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
