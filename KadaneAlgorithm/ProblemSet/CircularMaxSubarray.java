package KadaneAlgorithm.ProblemSet;

public class CircularMaxSubarray {
    private static int kadaneMax(int[] nums) {
        int maxEnding = nums[0], maxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEnding = Math.max(nums[i], maxEnding + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEnding);
        }
        return maxSoFar;
    }

    private static int kadaneMin(int[] nums) {
        int minEnding = nums[0], minSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            minEnding = Math.min(nums[i], minEnding + nums[i]);
            minSoFar = Math.min(minEnding, minSoFar);
        }
        return minSoFar;
    }

    public static int maxSubArraySumCircular(int[] nums) {
        int maxKadane = kadaneMax(nums);
        int total = 0;
        for(int v : nums) total += v;
        int minKadane = kadaneMin(nums);

        if(maxKadane < 0) return maxKadane;

        return Math.max(maxKadane, total - minKadane);
    }

    public static void main(String[] args) {
        int[] a1 = {1, -2, 3, -2};
        int[] a2 = {5, -3, 5};
        System.out.println(maxSubArraySumCircular(a1)); // 3
        System.out.println(maxSubArraySumCircular(a2)); // 10
    }
}

