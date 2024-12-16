package LeetCode.Easy;
/**
 *
 */

public class Q70DPCLimbingStairs {
    static int[] memo = new int[5];

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        if (memo[n - 1] != 0) return memo[n - 1];
        return memo[n - 1] = climbStairs(n - 1) + climbStairs(n - 2);
    }
}
