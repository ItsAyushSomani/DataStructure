package GeeksForGeeks.Arrays;
/**
 *
 */

import java.util.LinkedList;
import java.util.Queue;

public class Test1 {

    public static void main(String[] args) {
        extractData("{My Name is anthony {abcd}}");
    }

    public static void extractData(String data) {
        Queue<String> str = new LinkedList<>();
        char[] chars;
        chars = data.toCharArray();
        int count = 0;
        StringBuilder s = new StringBuilder();
        for(int i=0; i<chars.length; i++){
            if('{' == chars[i]) {
                if(!s.equals("")) {
                    str.add(s.toString());
                }
                str.add("{");
            } else if('}' == chars[i]) {
                str.add(data.substring(count, i));
            } else {
                s.append(chars[i]);
            }

        }
        System.out.println(str);
    }
}
