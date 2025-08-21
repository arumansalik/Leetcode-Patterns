package SlidingWindow;

public class maximumPointsYouCanObtainFromCards {
    public static int maxiPoints(int[] nums, int k) {
        int lSum = 0, rSum = 0, maxSum = 0;
        for (int i = 0; i <= k - 1; i++) {
            lSum += nums[i];
        }
        maxSum = lSum;
        int rIndex = nums.length - 1;
        for(int i = k - 1; i >= 0; i--) {
            lSum = lSum - nums[i];
            rSum = rSum + nums[rIndex];
            rIndex = rIndex - 1;
            maxSum = Math.max(maxSum, lSum + rSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;
        int ans = maxiPoints(arr, k);
        System.out.println("Maximum Points You Can Obtain from Cards is: " + ans );
    }
}
