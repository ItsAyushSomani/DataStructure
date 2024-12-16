package Revision;

import GeeksForGeeks.Arrays.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * [6:56 PM] Pradeep Jadhav
 * <p>
 * Input list-
 * [1,2,3,[4,5,6,[7,6,8,9,[10,11,12,13,14]],[15,16,17,18,[19,20,21,22,23]]]]
 * <p>
 * <p>
 * Output list-
 * [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23]
 */
public class TimeUtils {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List chilList = new ArrayList<>();
        chilList.add(4);
        chilList.add(5);
        chilList.add(6);
        List secondChilList = new ArrayList<>();
        secondChilList.add(7);
        secondChilList.add(8);
        secondChilList.add(9);
        chilList.add(secondChilList);
        list.add(chilList);
        ArrayList<Integer> outputList = new ArrayList();
        fLattenList(list, outputList);
        System.out.println(outputList);
    }

    private static void fLattenList(List list, List outputList) {
        for (int i = 0; i < list.size(); i++) {
            try {
                outputList.add((Integer) list.get(i));
            } catch (Exception e) {
                ArrayList childList = (ArrayList) list.get(i);
                for (int j = 0; j < childList.size(); j++) {
                    fLattenList(childList, outputList);
                }
            }
        }
    }


}

