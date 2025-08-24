package SlidingWindow.DynamicWindow;

public class NumberOfSubStringsContainsAllThreeChar {
    public static int numberOfSubstrings(String s) {
        int n = s.length();
        int[] freq = new int[3];
        int left = 0, count = 0;

        for (int right = 0; right < n; right++) {
            freq[s.charAt(right) - 'a']++;

            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                count += (n - right);

                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abcabc";
        int ans = numberOfSubstrings(s);
        System.out.println(ans);
    }
}
