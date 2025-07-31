package SlidingWindow.DynamicWindow;

public class MaxConsecutiveOnes {
    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < nums.length; right++) {
            if(nums[right] == 0) k--;

            while(k < 0) {
                if(nums[left] == 0) k++;
                left++;
            }
            maxLen = Math.max(maxLen ,right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int ans = longestOnes(nums, k);
        System.out.println(ans);
    }
}
