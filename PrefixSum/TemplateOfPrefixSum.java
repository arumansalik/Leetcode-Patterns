package PrefixSum;

public class TemplateOfPrefixSum {
    public static int[] prefixSum(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int[] ans = prefixSum(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}

/*
To get sum of range [L, R]:
if (L == 0) return prefix[R];
else return prefix[R] - prefix[L - 1];
 */
