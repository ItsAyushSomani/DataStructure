package GeeksForGeeks;


public class Solution {
    public static int solution(String S) {
        char CHAR_A = 'A';
        int num_Bs = 0, min_dels = 0;

        for (char c : S.toCharArray()) {
            if (CHAR_A == c) {
                // Minimum deletions with this character included
                // is equal to the count of all Bs before it
                min_dels = Math.min(num_Bs, min_dels + 1);
            } else {
                // Increment the count of 'B's encountered
                num_Bs++;
                // There is no need to exclude the last 'B' at the end of
                // the string, the min_dels does not change
            }
        }

        return min_dels;
    }

    public int solutione(int[] blocks) {
        int n = blocks.length;
        int[] furthestRight = new int[n];
        int furthestR = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i + 1 < n && blocks[i] > blocks[i + 1]) furthestR = i;
            furthestRight[i] = furthestR;
        }
        int furthestLeft = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i - 1 >= 0 && blocks[i - 1] < blocks[i]) furthestLeft = i;
            ans = Math.max(ans, furthestRight[i] - furthestLeft + 1);
        }
        return ans;
    }

    public static int solution(int[] A) {
        if (A == null || A.length == 0)
            return 0;
        if (A.length == 1)
            return 1;
        int count = 1;
        int i = 0, j = i + 1;
        while (i < A.length && j < A.length) {
            if (A[j] == A[i]) {
                ++i;
                ++j;
            } else if (A[j] > A[i]) {
                ++count;
                int k = j + 1;
                while (k < A.length && A[k] >= A[k - 1]) {
                    ++k;
                }
                if (k == A.length)
                    return count;
                i = k - 1;
                j = k;
            } else {
                ++count;
                int k = j + 1;
                while (k < A.length && A[k] <= A[k - 1]) {
                    ++k;
                }
                if (k == A.length)
                    return count;
                i = k - 1;
                j = k;
            }
        }
        return count;
    }

    public static int solution1(int[] A) {
        if (A == null || A.length == 0) return 0;

        int count = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                count++;
                while (i < A.length - 1 && A[i] != A[i + 1]) {
                    i++;
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {

    }
}