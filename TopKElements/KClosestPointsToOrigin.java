package TopKElements;

import java.util.*;

public class KClosestPointsToOrigin {
    public static int[][] kClosest(int[][] points, int k) {
        // MaxHeap storing {distance, index}
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> b[0] - a[0]   // compare by distance, largest first
        );

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0], y = points[i][1];
            int dist = x * x + y * y; // squared distance

            maxHeap.offer(new int[]{dist, i});

            if (maxHeap.size() > k) {
                maxHeap.poll(); // remove farthest
            }
        }

        // Build result
        int[][] result = new int[k][2];
        int i = 0;
        while (!maxHeap.isEmpty()) {
            int index = maxHeap.poll()[1];
            result[i++] = points[index];
        }

        return result;
    }

    // Test
    public static void main(String[] args) {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        int k = 2;

        int[][] ans = kClosest(points, k);
        for (int[] p : ans) {
            System.out.println(Arrays.toString(p));
        }
        // Expected: [[3,3], [-2,4]] (order may vary)
    }
}
