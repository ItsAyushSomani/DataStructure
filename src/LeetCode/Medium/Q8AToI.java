package LeetCode.Medium;

public class Q8AToI {

    public static void main(String[] args) {
        System.out.println(myAtos("-91283472332"));
    }

    public static int myAtoi(String s) {
        if (s.trim().length() == 0) return 0;
        boolean negative = false;
        s = s.trim();
        if ("-".equals(s.substring(0, 1))) {
            negative = true;
            s = s.substring(1, s.length());
        } else if ("+".equals(s.substring(0, 1))) {
            s = s.substring(1, s.length());
        }
        char[] crr = s.toCharArray();
        int i = 0;
        while (crr.length > i) {
            if (Character.isDigit(crr[i])) {
                break;
            }
            i++;
        }
        if (i == 0) return 0;
        try {
            i = Integer.parseInt(s.substring(0, i));
        } catch (Exception e) {
            i = negative ? -2147483648 : 2147483647;
            return i;
        }
        return negative ? -i : i;
    }

    public static int myAtos(String s) {
        int len = s.length();
        int idex = 0;
        int signal = 1;
        while (idex < len && Character.isWhitespace(s.charAt(idex))) {
            idex++;
        }
        if (idex < len && s.charAt(idex) == '+') {
            idex++;
            signal = 1;
        } else if (idex < len && s.charAt(idex) == '-') {
            idex++;
            signal = -1;
        }
        long result = 0;
        while (idex < len) {
            char curr = s.charAt(idex);
            if (!Character.isDigit(curr)) {
                return (int) (result * signal);
            }
            result = result * 10 + (curr - '0');
            if (signal == 1 && result >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (signal == -1 && -1 * result <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            idex++;
        }
        return (int) (result * signal);
    }
}
/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 * <p>
 * The algorithm for myAtoi(string s) is as follows:
 * <p>
 * Read in and ignore any leading whitespace.
 * Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 * Read in next the characters until the next non-digit charcter or the end of the input is reached. The rest of the string is ignored.
 * Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 * If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
 * Return the integer as the final result.
 * Note:
 * <p>
 * Only the space character ' ' is considered a whitespace character.
 * Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "42"
 * Output: 42
 * Explanation: The underlined characters are what is read in, the caret is the current reader position.
 * Step 1: "42" (no characters read because there is no leading whitespace)
 * ^
 * Step 2: "42" (no characters read because there is neither a '-' nor '+')
 * ^
 * Step 3: "42" ("42" is read in)
 * ^
 * The parsed integer is 42.
 * Since 42 is in the range [-231, 231 - 1], the final result is 42.
 * Example 2:
 * <p>
 * Input: s = "   -42"
 * Output: -42
 * Explanation:
 * Step 1: "   -42" (leading whitespace is read and ignored)
 * ^
 * Step 2: "   -42" ('-' is read, so the result should be negative)
 * ^
 * Step 3: "   -42" ("42" is read in)
 * ^
 * The parsed integer is -42.
 * Since -42 is in the range [-231, 231 - 1], the final result is -42.
 * Example 3:
 * <p>
 * Input: s = "4193 with words"
 * Output: 4193
 * Explanation:
 * Step 1: "4193 with words" (no characters read because there is no leading whitespace)
 * ^
 * Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
 * ^
 * Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
 * ^
 * The parsed integer is 4193.
 * Since 4193 is in the range [-231, 231 - 1], the final result is 4193.
 * Example 4:
 * <p>
 * Input: s = "words and 987"
 * Output: 0
 * Explanation:
 * Step 1: "words and 987" (no characters read because there is no leading whitespace)
 * ^
 * Step 2: "words and 987" (no characters read because there is neither a '-' nor '+')
 * ^
 * Step 3: "words and 987" (reading stops immediately because there is a non-digit 'w')
 * ^
 * The parsed integer is 0 because no digits were read.
 * Since 0 is in the range [-231, 231 - 1], the final result is 0.
 * Example 5:
 * <p>
 * Input: s = "-91283472332"
 * Output: -2147483648
 * Explanation:
 * Step 1: "-91283472332" (no characters read because there is no leading whitespace)
 * ^
 * Step 2: "-91283472332" ('-' is read, so the result should be negative)
 * ^
 * Step 3: "-91283472332" ("91283472332" is read in)
 * ^
 * The parsed integer is -91283472332.
 * Since -91283472332 is less than the lower bound of the range [-231, 231 - 1], the final result is clamped to -231 = -2147483648.
 */