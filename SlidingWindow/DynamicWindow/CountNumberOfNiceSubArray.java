package SlidingWindow.DynamicWindow;

public class CountNumberOfNiceSubArray {
    public static int numberOfSubArray(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private static int atMost(int[] nums, int k) {
        int left = 0, count = 0, odds = 0;

        for(int right = 0; right< nums.length; right++) {
            if(nums[right] % 2 == 1) {
                odds++;
            }

            while(odds > k) {
                if(nums[left] % 2 == 1) {
                    odds--;
                }
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        int ans = numberOfSubArray(nums, k);
        System.out.println(ans );
    }
}
