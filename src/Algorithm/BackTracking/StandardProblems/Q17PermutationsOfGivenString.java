package Algorithm.BackTracking.StandardProblems;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 */
public class Q17PermutationsOfGivenString {

    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        Set<String> set = new TreeSet<>();
        permute(str, 0, n - 1, set);
        System.out.println(set);
    }

    private static void permute(String str, int i, int i1, Set set) {
        if (i == i1) {
            set.add(str);
            return;
        }
        for (int j = i; j <= i1; j++) {
            str = swap(str, i, j);
            permute(str, i + 1, i1, set);
            str = swap(str, i, j);
        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
