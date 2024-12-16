package Algorithm.BackTracking.Misc;

/**
 *
 */
public class Q25PossibleStringsByPlacingSpaces {

    public static void main(String[] args) {
        String str = "ABCD";
        printPattern(str, 1, str.length());
    }

    private static void printPattern(String str, int i, int len) {
        if(i == len) {
            System.out.println(str);
            return;
        }

        printPattern(str, i+1, len);
        str = str.substring(0, i) + " " + str.substring(i, len);
        printPattern(str, i+2, len+1);
        str = str.substring(0, i) + str.substring(i+1, str.length());
    }
}
