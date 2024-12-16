package LeetCode.Easy;
/**
 *
 */

public class Q28IndexOfString {

    public static void main(String[] args) {
        System.out.println(strStr("", ""));
    }

    public static int strStr(String haystack, String needle) {
        if(needle == "" || haystack == "") return 0;
        return haystack.indexOf(needle) > 0 ? haystack.indexOf(needle) : -1;
    }
}
