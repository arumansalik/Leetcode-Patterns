package TwoPointers.SlowFastPointers;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int[] removeDuplicates(int[] nums) {
        int slow = 0;
        for(int fast = 1; fast < nums.length; fast++) {
            if(nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return nums;
    }

    public static int removeDuplicates1(int[] nums) {
        int slow = 0;
        for(int fast = 1; fast < nums.length; fast++) {
            if(nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3};
        int k = removeDuplicates1(nums);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }
}
