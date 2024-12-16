package LeetCode.Easy;
/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */

import static java.lang.Math.abs;

public class Q7ReverseSigned32BitInteger {

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        boolean negative = false;
        negative = x <= 0;
        x = abs(x);
        StringBuilder s = new StringBuilder(String.valueOf(x));
        s.reverse();
        try{
            int i = Integer.parseInt(s.toString());
            return negative ? -i : i;
        } catch(Exception ex) {
            return 0;
        }
    }
}
