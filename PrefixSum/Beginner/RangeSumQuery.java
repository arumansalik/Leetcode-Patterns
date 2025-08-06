package PrefixSum.Beginner;

 class NumArray{
    public int[] prefix;

    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if(left == 0 ) return prefix[right];
        return prefix[right] - prefix[left - 1];
    }
}

public class RangeSumQuery {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        NumArray obj = new NumArray(nums);

        System.out.println("Sum of [0, 2]: " + obj.sumRange(0, 2)); // 1+2+3 = 6
        System.out.println("Sum of [1, 3]: " + obj.sumRange(1, 3)); // 2+3+4 = 9
        System.out.println("Sum of [2, 4]: " + obj.sumRange(2, 4)); // 3+4+5 = 12
        System.out.println("Sum of [0, 4]: " + obj.sumRange(0, 4)); // 1+2+3+4+5 = 15
    }
}