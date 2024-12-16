package LeetCode.Medium;

import java.util.HashSet;

/**
 *
 */
public class Q5LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) return 0;
        int maxLen = Integer.MIN_VALUE;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i + 1);
            int len = Math.max(len1, len2);
            maxLen = Math.max(len, maxLen);
        }
        return maxLen;
    }

    private static int expandFromMiddle(String s, int left, int right) {
        if (s == null || left > right) return 0;
        HashSet<Character> hSet = new HashSet();
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            System.out.println(s.charAt(left));
            hSet.add(s.charAt(left));
            left--;
            right++;

        }
        System.out.println("===================================");
        return hSet.size();
    }
}
