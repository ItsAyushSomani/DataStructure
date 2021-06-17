package LeetCode.Easy;
/**
 *
 */

public class Q69Sqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(2));

    }

    public static int mySqrt(int x) {
        for (int i = 1; i <= x; i++) {
            if ((i * i) == x) return i;
            else if ((i * i) > x) return i - 1;
        }
        return 0;
    }
}
