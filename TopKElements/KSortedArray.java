package TopKElements;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KSortedArray {
    public static void sortKSortedArray(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int index = 0;

        for (int i = 0; i <= k && i < arr.length; i++) {
            minHeap.add(arr[i]);
        }

        for(int i = k + 1; i < arr.length; i++) {
            arr[index++] = minHeap.poll(); // extract min
            minHeap.add(arr[i]); //Insert Next
        }

        while (!minHeap.isEmpty()) {
            arr[index++] = minHeap.poll();
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;

        sortKSortedArray(arr, k);

        System.out.println(Arrays.toString(arr));
    }
}
