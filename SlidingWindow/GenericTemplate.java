package SlidingWindow;

public class GenericTemplate {
    public static double slidingWindowFixed(int[] nums, int k) {
        int sum = 0;

        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max_sum = sum;

        for(int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max_sum = Math.max(max_sum, sum);
        }
        return (double) max_sum / k;
    }

    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        double ans = slidingWindowFixed(arr, 4);
        System.out.println(ans);
    }
}
