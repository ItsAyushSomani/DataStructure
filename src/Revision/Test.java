package Revision;

/**
 * x =
 * x = 512
 */
public class Test {

    public static void main(String[] args) {
        int x = 512;
        System.out.println((x & x - 1) == 0);
    }

    private static boolean checkPowerOF2(float x) {
//        return (x & x-1 == 0);
        return false;
    }

}
