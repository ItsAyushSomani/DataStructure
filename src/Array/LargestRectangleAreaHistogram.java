package Array;

public class LargestRectangleAreaHistogram {
    public static void main(String[] args) {
        int[] a= { 90, 58, 69, 70, 82, 100, 13, 57, 47, 18 };
        System.out.println(largestRectangleArea(a));
    }

    public static int largestRectangleArea(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        for(int currPos = 0; currPos <n ; currPos++) {
            b[currPos] = 0;
            for(int i=0; i<n; i++) {
                if(i >= currPos){
                    if(a[currPos] <= a[i]){
                        b[currPos] += a[currPos];
                    } else {
                        break;
                    }
                } else {
                    if(a[i] >= a[currPos]){
                        b[currPos] += a[currPos];
                    } else {
                        b[currPos] = 0;
                    }
                }
            }

        }
        int max = 0;
        for(int i=0; i< b.length; i++){
            System.out.println(b[i]);
        }
        return max;
    }
}
