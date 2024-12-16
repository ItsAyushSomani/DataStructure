package Revision;

import java.util.Arrays;

/**
 *
 */
public class Amazon {
    public static void main(String[] args) {
        int teams = getTeams(new int[] { 9, 3, 5, 7, 1 }, 2, 1);
        System.out.println(teams);
    }

    static int getTeams(int[] skills, int teamSize, int maxDiff) {
        Arrays.sort(skills);

        int n = teamSize - 1;
        int count = 0;
        int first = 0;
        int last = n;
        while(last < skills.length ){
            if (skills[last] - skills[first] <= maxDiff) {
                first = last + 1;
                last = first + n;
                count++;
            } else {
                first++;
                last++;
            }
        }
        return count;
    }
}
