package SlidingWindow.FixedWindow;

public class MaximumAverageSubArrayI {
    public static double maxAvgSubArray(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;

        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max_sum = sum;

        for(int i = k; i < n; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            max_sum = Math.max(max_sum, sum);
        }
        return (double) max_sum / k;
    }

    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        double ans = maxAvgSubArray(arr, k);
        System.out.println(ans);
    }
}

/*
643. Maximum Average Subarray I
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 */
