package KadaneAlgorithm.ProblemSet;

public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProd = nums[0], minProd = nums[0], ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];
            // when x is negative swap max and min
            if (x < 0) {
                int tmp = maxProd;
                maxProd = minProd;
                minProd = tmp;
            }
            maxProd = Math.max(x, maxProd * x);
            minProd = Math.min(x, minProd * x);
            ans = Math.max(ans, maxProd);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2, 3, -2, 4})); // 6
        System.out.println(maxProduct(new int[]{-2, 0, -1}));  // 0
    }
}
