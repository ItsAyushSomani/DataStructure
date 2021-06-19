package LeetCode.Medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 */

public class Q12IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));

    }

    private static String intToRoman(int num) {
        if (num < 1) return "";
        StringBuilder sb = new StringBuilder();
        Map<Integer, String> hmap = new LinkedHashMap<>();
        hmap.put(1000, "M");  // 3000 2000 1000  MMM 247 - 100 CC 47<100 = 247  7  4 iiii IV               100C + 40XXXX + 7 VII
        hmap.put(500, "D");
        hmap.put(100, "C");
        hmap.put(50, "L");
        hmap.put(10, "X");
        hmap.put(5, "V");
        hmap.put(1, "I");
        while (num > 0) {
            for (int i : hmap.keySet()) {
                if (num % i != num || num % i == i - 1) {
                    while (num >= i) {
                        sb.append(hmap.get(i));
                        num = num - i;
                    }
                    if (num !=0 && num % i == i - 1) {
                        sb.append(hmap.get(1));
                        sb.append(hmap.get(i));
                        num = num - i;
                    }
                    break;
                }
            }
        }
        return sb.toString();
    }

}
