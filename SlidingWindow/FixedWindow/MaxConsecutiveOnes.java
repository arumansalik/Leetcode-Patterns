package SlidingWindow.FixedWindow;

public class MaxConsecutiveOnes {
    public int longestOnes(int[] nums, int k) {
        int left = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) k--;

            while (k < 0) {
                if (nums[left] == 0) k++;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
