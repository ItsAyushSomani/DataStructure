package GeeksForGeeks.Arrays;
/**
 *"2a", "grea3t", "l3earning", "geeksfor0geeks", "p5latform", "is1"
 */

import java.util.*;

public class Test1 {

    public static void main(String[] args) {
        String[] arr = new String[]{"apple", "ape", "april"};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(String[] arr) {
       String s = "";
       int cr = 0;
       boolean isSame = true;
        while (isSame){
            for (int j = 1; j < arr.length; j++) {
               if(arr[j].charAt(cr) != arr[0].charAt(cr)) {
                   isSame = false;
                   break;
               }
            }
            if(isSame) {
                s += arr[0].charAt(cr);
            }
            cr++;
        }
        System.out.println(s);
    }
}





