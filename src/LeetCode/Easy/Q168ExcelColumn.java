package LeetCode.Easy;

/**
 *
 */
public class Q168ExcelColumn {

    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
    }

    public static String convertToTitle(int columnNumber) {
        String str = "";
        while (columnNumber > 0) {
            columnNumber--;
            char a = (char) (columnNumber % 26 + 'A');
            str = a + str;
            columnNumber = columnNumber / 26;
        }
        return str;
    }
}
