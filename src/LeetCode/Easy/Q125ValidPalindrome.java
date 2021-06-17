package LeetCode.Easy;

import java.util.Locale;

/**
 * Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 * <p>
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 */

public class Q125ValidPalindrome {

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        String input1 = "race a car";
        System.out.println("'A man, a plan, a canal: Panama' a palindrome string?" + checkPalindrome(input));
        System.out.println("'race a car' a palindrome string?" + checkPalindrome(input1));
    }

    public static boolean checkPalindrome(String sentence) {
        StringBuilder sb = new StringBuilder(sentence.replaceAll("\\s", "").toLowerCase(Locale.ROOT).replaceAll("[^a-zA-Z0-9]+",""));
        System.out.println(sb);
        System.out.println(sb.reverse());
        return sb.toString().equals(sb.reverse().toString());
    }
}
