package SlidingWindow;

import java.util.Stack;

public class MaximumSumSubarrayOfSizeK {
    public static Stack<Integer> sumSubarray(int[] arr, int k) {
        Stack<Integer> result = new Stack<>();
        int left = 0;
        int sum = 0;

        for(int right = 0; right < arr.length; right++) {
            sum += arr[right];

            if(left >= k - 1) {
                result.push(sum / k);

                sum -= arr[left];

                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;

       sumSubarray(arr, k);

        for(int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
    }
}
