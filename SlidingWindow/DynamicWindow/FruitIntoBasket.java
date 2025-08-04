package SlidingWindow.DynamicWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBasket {
    public static int totalFruit(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxFruits = 0;

        for(int right = 0; right < nums.length; right++) {
            int rightFruit = nums[right];
            map.put(rightFruit, map.getOrDefault(rightFruit, 0) + 1);

            while(map.size() > 2) {
                int leftFruit = nums[left];
                map.put(leftFruit, map.get(leftFruit) - 1);
                if(map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                left++;
            }
            maxFruits = Math.max(maxFruits, right - left + 1);
        }
        return maxFruits;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3};
        int ans = totalFruit(arr);
        System.out.println(ans); // 4
        int[] arr1 = {1, 2, 3, 2, 2};
        int ans1 = totalFruit(arr1);
        System.out.println(ans1); // 4
        int[] arr2 = {0, 1, 2, 2};
        int ans2 = totalFruit(arr2);
        System.out.println(ans2); // 3
    }

}

/*
Start at index 0:

Pick 1 → basket 1

Pick 2 → basket 2

Pick 1 → already in basket 1

Pick 2 → already in basket 2

Pick 3 → ❌ can't fit (we already used 2 types)

So maximum you could pick in one go = 4 fruits ([1, 2, 1, 2])
    */
