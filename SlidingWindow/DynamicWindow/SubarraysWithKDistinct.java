package SlidingWindow.DynamicWindow;

import java.util.HashMap;

public class SubarraysWithKDistinct {
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private static int atMost(int[] nums, int k) {
        int left = 0, res = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int right = 0; right < nums.length; right++) {
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            while (freq.size() > k) {
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if(freq.get(nums[left]) == 0) {
                    freq.remove(nums[left]);
                }
                left++;
            }
            res += (right - left + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1, 2, 3};
        int k1 = 2;
        System.out.println(subarraysWithKDistinct(nums1, k1)); // Expected 7

        int[] nums2 = {1, 2, 1, 3, 4};
        int k2 = 3;
        System.out.println(subarraysWithKDistinct(nums2, k2)); // Expected 3

        int[] nums3 = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        int k3 = 2;
        System.out.println(subarraysWithKDistinct(nums3, k3)); // Expected 16
    }
}

