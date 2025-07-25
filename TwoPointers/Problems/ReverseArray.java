package TwoPointers.Problems;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};

        reverseArray(arr);

        System.out.println(Arrays.toString(arr));

    }
}
