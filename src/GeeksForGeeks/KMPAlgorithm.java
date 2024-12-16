package GeeksForGeeks;

import java.util.Arrays;

public class KMPAlgorithm {

    public static String longestPrefix(String str, String s) {
        int len = 0;
        int[] lps = new int[s.length()];
        for (int i = 1; i < s.length(); ) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i++] = len;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i++] = len;
                }
            }
        }
        int j = 0;
        for(int i = 0; i < str.length(); i++) {
            if(s.charAt(lps[j]) == str.charAt(i)) {
                i++;
                j++;
            } else {
                j = lps[j - 1];
            }
            if(j == s.length()) {
                System.out.println(i - j);
            }
        }
        System.out.println(Arrays.toString(lps));
        return s.substring(0, lps[s.length() - 1]);
    }

    public static void main(String[] args) {
//        System.out.println(longestPrefix("levlel"));
    }
}

//leveler
//ler
