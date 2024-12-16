package GeeksForGeeks;


public class CastleBuilder {

    public static int countCastles(int[] A) {
        int n = A.length;
        if (n <= 1) {
            return n;  // If there's only one segment, only one castle is needed
        }

        int castles = 1;  // At least one castle will be built
        int trend = 0;    // 0 for flat, 1 for increasing, -1 for decreasing

        for (int i = 1; i < n; i++) {
            // Check if the current segment forms a hill or valley
            if (A[i] == A[i - 1]) {
                continue;  // Ignore flat segments
            }

            int newTrend = (A[i] > A[i - 1]) ? 1 : -1;  // Determine new trend

            // If the trend changes or it's the last segment, a castle is needed
            if (newTrend != trend || i == n - 1) {
                castles++;
            }
            trend = newTrend;
        }

        return castles;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 2, 2, 1, 1, 2, 3, 4, 2, 2, 2, 1};
        System.out.println("Number of castles: " + countCastles(A));
    }
}