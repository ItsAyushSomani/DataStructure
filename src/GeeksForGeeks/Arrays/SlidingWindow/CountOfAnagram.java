package GeeksForGeeks.Arrays.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOfAnagram {

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        char[] ch = p.toCharArray();
        char[] sArray = s.toCharArray();
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : ch) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        int count = charCountMap.size();
        int i = 0, j = 0;

        while (j < sArray.length) {
            if (charCountMap.containsKey(sArray[j])) {
                charCountMap.put(sArray[j], charCountMap.get(sArray[j]) - 1);
                if (charCountMap.get(sArray[j]) == 0) {
                    count--;
                }
            }
            if (j-i+1 < p.length()) {
                j++;
            } else if (j - i + 1 == p.length()) {
                if (count == 0) {
                    result.add(i);
                }
                if (charCountMap.containsKey(sArray[i])) {
                    if (charCountMap.get(sArray[i]) == 0) {
                        count++;
                    }
                    charCountMap.put(sArray[i], charCountMap.get(sArray[i]) + 1);
                }
                i++;
                j++;
            }
        }
        return result;

    }
}
