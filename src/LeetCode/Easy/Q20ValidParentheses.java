package LeetCode.Easy;
/**
 *
 */

import java.util.HashMap;
import java.util.Stack;

public class Q20ValidParentheses {
    private static HashMap<Character, Character> mappings = null;

    Q20ValidParentheses() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public static void main(String[] args) {
        Q20ValidParentheses tp = new Q20ValidParentheses();
        System.out.println(tp.isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                char topOfStack = stack.empty() ? '#' : stack.pop();
                if (topOfStack != mappings.get(c))
                    return false;
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
