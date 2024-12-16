package GeeksForGeeks.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ClosestDistanceToOrigin {
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<DistanceToOrigin> pq = new PriorityQueue<>();
        for(int i = 0; i < points.length; i++) {
            DistanceToOrigin dist = new DistanceToOrigin(points[i]);
            System.out.println(Arrays.toString(points[i]) + "dist distance is " + dist.distance);
            if(i < k) {
                pq.add(dist);
            } else if(pq.peek().distance > dist.distance) {
                System.out.println("pq distance is " + pq.peek().distance);
                pq.poll();
                pq.add(dist);
            }
        }
        int[][] result = new int[pq.size()][1];
        int i = 0;
        while(pq.size() != 0) {
            result[i] = pq.poll().arr;
            i++;
        }
        return result;
    }

    static class DistanceToOrigin implements Comparable<DistanceToOrigin>{
        public int[] arr;
        public double distance;
        DistanceToOrigin(int[] arr) {
            this.arr = arr;
            this.distance = distance(arr);
        }

        @Override
        public int compareTo(DistanceToOrigin otherDistance) {
            return -1 * Double.compare(this.distance, otherDistance.distance);
        }

        public double distance(int[] arr) {
            return Math.sqrt((Math.pow(Math.abs(arr[0]), 2)) + (Math.pow(Math.abs(arr[1]), 2)));
        }
    }

    public static void main(String[] args) {
        int[][] result = {{-6, -5}, {-5, 4}, {4, 6}};
        result = kClosest(result, 2);
        for (int[] res: result) System.out.println(Arrays.toString(res));
    }
}
