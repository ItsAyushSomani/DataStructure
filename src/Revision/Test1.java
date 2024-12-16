package Revision;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * S = "subhransu"
 * 012345678
 * aabbccdeeabcde
 * 01234567890123
 */

public class Test1 {

    public static void main(String[] args) {
//        System.out.println(getLongestSubstring("aabbccdeeabcde"));
        List<Integer> list = Arrays.asList(10, 15, 12);
        System.out.println(list.size());
    }

    private static String getLongestSubstring(String str) {
        StringBuilder subString = new StringBuilder();
        StringBuilder maxString = new StringBuilder();
        char[] cr = str.toCharArray();
        int i = 0;
        while (i < cr.length) {
            Character c = cr[i];
            int index = subString.indexOf(c.toString());
            if (index > -1) {
                subString = new StringBuilder(subString.substring(index + 1, subString.length()));
            } else {
                subString = subString.append(c);
            }
            maxString = maxString.length() > subString.length() ? maxString : subString;
            i++;
        }
        return maxString.toString();
    }
}
