package SlidingWindow.DynamicWindow;

import java.util.HashMap;

public class LongestSubstringKDistinct {
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(s == null || s.isEmpty() || k == 0) return 0;

        int left = 0, maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if(map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s1 = "eceba";
        int k1 = 2;
        System.out.println("Input: " + s1 + ", k = " + k1);
        System.out.println("Longest length: " + lengthOfLongestSubstringKDistinct(s1, k1)); // Output: 3 ("ece")

        String s2 = "aa";
        int k2 = 1;
        System.out.println("Input: " + s2 + ", k = " + k2);
        System.out.println("Longest length: " + lengthOfLongestSubstringKDistinct(s2, k2)); // Output: 2 ("aa")

        String s3 = "abcadcacacaca";
        int k3 = 3;
        System.out.println("Input: " + s3 + ", k = " + k3);
        System.out.println("Longest length: " + lengthOfLongestSubstringKDistinct(s3, k3)); // Output: 11
    }
}
