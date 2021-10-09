package Algorithm.BackTracking.Misc;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class Q8WordBreak {

    public static void main(String[] args) {
        String str1 = "iloveicecreamandmango"; // for first test case
        // for second test case
        int n1 = str1.length();                 // length of first string
//        int n2 = str2.length();                 // length of second string
        // List of strings in dictionary
        List<String> dict = Arrays.asList("i", "iloveicecrea");
        System.out.println("First Test:");
        // call to the method
        if (wordBreak(0, 0, dict, str1)) {
            System.out.println("first test passed");
        }
    }

    private static boolean wordBreak(int i, int j, List<String> dict, String str1) {
        if (j == str1.length()) {
            if (i == str1.length()) {
                return true;
            }
            return false;
        }
        if (dict.contains(str1.substring(i, j + 1))) {
            return wordBreak(i, j + 1, dict, str1);
        } else {
            if (wordBreak(1, j + 1, dict, str1)) return true;
            return wordBreak(j + 1, j + 1, dict, str1);
        }

    }
}
