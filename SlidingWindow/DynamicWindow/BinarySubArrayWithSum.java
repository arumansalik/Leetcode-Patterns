package SlidingWindow.DynamicWindow;

public class BinarySubArrayWithSum {
    public static int binarySum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    private static int atMost(int[] nums, int k) {
        if(k < 0) return 0;

        int left = 0, sum = 0, count = 0;

        for(int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while(sum > k) {
                sum -= nums[left++];
            }
            count += right - left + 1;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, 1, 0, 1};
        int k = 2;
        int ans = binarySum(nums, k);
        System.out.println(ans);
    }
}
