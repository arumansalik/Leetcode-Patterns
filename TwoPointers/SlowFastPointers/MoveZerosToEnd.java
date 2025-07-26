package TwoPointers.SlowFastPointers;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void moveZeroes(int[] nums) {
        int slow = 0;

        for(int fast = 0; fast < nums.length; fast++) {
            if(nums[fast] != 0) {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
