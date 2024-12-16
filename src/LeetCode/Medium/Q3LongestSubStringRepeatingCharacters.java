package LeetCode.Medium;
/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Example 4:
 * <p>
 * Input: s = ""
 * Output: 0
 */

import java.util.HashSet;
import java.util.Set;

public class Q3LongestSubStringRepeatingCharacters {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));

    }

    //Brute force approach
    public static int lengthOfLongestSubstring(String s) {
        char[] crr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int maxCount = 0;
        for (int i = 0; i < crr.length; i++) {
            int j = i;
            while (j < crr.length && set.add(crr[j])) {
                set.add(crr[j]);
                j++;
            }
            maxCount = Math.max(maxCount, set.size());
            set.clear();
        }
        return maxCount;
    }
}
