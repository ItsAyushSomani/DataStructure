package LeetCode.Easy;
/**
 *
 */

public class Q58LastWordOFString {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a "));
    }

    public static int lengthOfLastWord(String s) {
        if (s == "") return 0;
        s = s.trim();
        int index = s.lastIndexOf(" ");
        return s.substring(++index, s.length()).length();
    }
}
