package LeetCode.Medium;

/**
 *
 */

public class Q29DivideTwoNumbers {

    public static void main(String[] args) {
        System.out.println(divide(Integer.MIN_VALUE, -1));
    }

    public static int divide(int dividend, int divisor) {
        int i = 0;
        int abs = 1;
        if (dividend < 0 ^ divisor < 0) {
            abs = -1;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        try {
            while (dividend >= divisor) {
                dividend -= divisor;
                i++;
            }
            if (i <= 0) {
                throw new Exception("test");
            }
        } catch (Exception e) {
            return abs <= 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return abs * i;
    }
}
