package SlidingWindow.DynamicWindow;
import java.util.*;

public class LongestSubStringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();

        while(right < s.length()) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen ,right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
        String s1 = "pwwkew";
        int ans1 = lengthOfLongestSubstring(s1);
        System.out.println(ans1);
    }
}
