package TopKElements;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmalestElements {
    public static List<Integer> findSmallest(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for(int num : arr) {
            maxHeap.offer(num);
            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return new ArrayList<>(maxHeap);
    }

    public static void main(String[] args) {
        int[] nums = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(findSmallest(nums, k));
    }
}

/*
Steps:

Add 7 → heap = [7]

Add 10 → heap = [10, 7]

Add 4 → heap = [10, 7, 4] (size == 3)

Add 3 → heap = [10, 7, 4, 3] → size > 3 → poll 10 → heap = [7, 3, 4]

Add 20 → heap = [20, 7, 4, 3] → size > 3 → poll 20 → heap = [7, 3, 4]

Add 15 → heap = [15, 7, 4, 3] → size > 3 → poll 15 → heap = [7, 3, 4]

✅ Final heap = [7, 3, 4] → the 3 smallest elements.
 */
