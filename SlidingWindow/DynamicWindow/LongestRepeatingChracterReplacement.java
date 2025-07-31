package SlidingWindow.DynamicWindow;

public class LongestRepeatingChracterReplacement {
    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0;
        int left = 0, maxLen = 0;

        for(int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;

            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            while((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int ans = characterReplacement(s, k);
        System.out.println(ans);
    }
}
