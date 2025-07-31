package SlidingWindow.DynamicWindow;

public class LongestSubarrayWithSumLessThanOrEqualToK {
    public static int longestSubarrayWithSumAtMostK(int[] nums, int k) {
        int left = 0, maxLen = 0, sum = 0;

        for(int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while(sum > k) {
                sum -= nums[left];
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 0, 1, 1, 0};
        int k = 4;
        int ans = longestSubarrayWithSumAtMostK(arr, k);
        System.out.println(ans);
    }
}
