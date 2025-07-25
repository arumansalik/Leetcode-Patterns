package TwoPointers.Problems;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i  + 1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 3, 4};

        int k =  removeDuplicates(arr);

        System.out.println(k);
        System.out.println("After removing elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
