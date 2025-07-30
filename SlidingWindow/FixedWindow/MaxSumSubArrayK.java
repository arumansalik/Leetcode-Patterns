package SlidingWindow.FixedWindow;

public class MaxSumSubArrayK {
    public static int maxSum(int[] nums, int k) {
        int sum = 0, max_sum = Integer.MIN_VALUE;

        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max_sum = sum;

        for(int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max_sum = Math.max(max_sum, sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 12, -5, -6, 50, 3};
        int k = 4;
        int ans = maxSum(arr, k);
        System.out.println(ans);
    }

}
