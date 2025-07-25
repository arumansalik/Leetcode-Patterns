package TwoPointers;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int sum = numbers[left] + numbers[right];

            if(sum == target) {
                return new int[] {left, right};
            } else if(sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;

        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}