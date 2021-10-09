package GeeksForGeeks;

/**
 * String = any number of digits any number of spaces and hyphens
 * group of three numbers, between hyphen
 * 1 digit last and group of two at the end
 * no hyphen or spaces before or after the string
 * “344444” -> “344-444”
 * 3444 -> 34-44
 * 344-- 344 -> 344-344
 * 3444 => 344-
 */
public class Test {

    public static void main(String[] args) {
        String str = "3366 888        9 0 - - - - 43";
        char[] cr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (int i = 0; i < cr.length; i++) {
            if (cr[i] != '-' && cr[i] != ' ') {
                if (k % 3 == 0 && k != 0) {
                    sb.append('-');
                }
                k++;
                sb.append(cr[i]);
            }
        }
        int lastIndex = sb.lastIndexOf("-");
        if (sb.length() - lastIndex <= 2 && sb.length() > 3) {
            char c = sb.charAt(lastIndex - 1);
            sb.replace(lastIndex - 1, lastIndex, "");
            sb.insert(sb.lastIndexOf("-") + 1, c);
        }
        System.out.println(sb.toString());
    }

}
