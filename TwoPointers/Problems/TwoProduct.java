package TwoPointers.Problems;

public class TwoProduct {
    public static boolean twoProduct(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while(left < right) {
            int prod = nums[left] * nums[right];

            if(prod == target) {
                return true;
            } else if(prod > target) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 10};
        int target = 18;

        boolean ans = twoProduct(arr, target);
        System.out.println(ans);
    }
}
