package LeetCode.Easy;
import java.util.Stack;

/**
 * String s = acba
 * abccbcba = acba
 * a b c c
 *   l
 *     lr
 *
     * abbcba
 * acba
 */

public class Q1047FindTheMissingNumber {

    public static void main(String[] args) {
        String input = "aaaaaaaa";
        System.out.println("output String is  " + removeDuplicateCharacters(input));
    }

    public static String removeDuplicateCharacters(String input) {
        if(input.length() < 2) return input;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i < input.length(); i++) {
            if(stack.size() >= 1 && input.charAt(i) == stack.peek()) {
                char cr = stack.pop();
                while(i < input.length() && cr == input.charAt(i)) {
                    i++;
                }
                i--;

            } else {
                stack.push(input.charAt(i));
            }
        }
        StringBuilder sb= new StringBuilder();
        while(stack.size() > 0) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
