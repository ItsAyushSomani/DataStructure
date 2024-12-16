package LeetCode.Easy;

/**
 *
 */
public class Q171ExcelColumntoNumber {

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }

    public static int titleToNumber(String columnTitle) {
        int length = columnTitle.length() - 1;
        int sum = 0;
        for (int i = 0; i <= length; i++) {
            int j = columnTitle.charAt(i);
            sum = 26 * sum + j - 64;
        }
        return sum;
    }

}
