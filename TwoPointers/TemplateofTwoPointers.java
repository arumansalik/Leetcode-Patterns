package TwoPointers;

public class TemplateofTwoPointers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0;
        int right = arr.length - 1;
        int target = 5;

        while(left < right) {
            int sum = arr[left] + arr[right];

            if(sum == target) {
                System.out.println(left + " " + right);
                break;
            } else if (sum > target){
                right--;
            } else {
                left++;
            }
        }
    }
}

/*
arr = [1, 2, 3, 4, 6, 8, 9], target = 10
left = 0 → pointing at 1

right = 6 → pointing at 9

→ Check sum: 1 + 9 = 10 ✅ ✅
→ Done. If not equal:

If sum < target → move left++

If sum > target → move right--
 */