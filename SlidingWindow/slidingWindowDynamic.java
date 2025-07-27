package SlidingWindow;

public class slidingWindowDynamic {
    public static int slidingWindow(int[] nums, int target) {
        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;

        for(int right = 0; right  < nums.length; right++) {
            sum += nums[right];

            while(sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(slidingWindow(nums, target));
    }
}
