package PrefixSum.Beginner;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int left = 0, total = 0;

        for(int num : nums) {
            total += num;
        }

        for (int i = 0; i < nums.length; i++) {
            int right = total - left - nums[i];

            if(left == right) {
                return i;
            }

            left += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int ans = pivotIndex(nums);
        System.out.println(ans);
    }
}
