package LeetCode.Easy;
/**
 *
 */

public class Q67AddTwoBinary {

    public static void main(String[] args) {
        int arr[] = {};
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        return Long.toBinaryString(Long.parseLong(a, 2) + Long.parseLong(b, 2));
    }
}
