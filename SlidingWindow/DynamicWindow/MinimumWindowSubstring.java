package SlidingWindow.DynamicWindow;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();

        if(m < n) return "";

        int[] hashArr = new int[128];
        for (int i = 0; i < n; i++) {
            hashArr[t.charAt(i)]++;
        }

        int l = 0, r = 0;
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int sIndex = -1;

        while(r < m) {
            char rightChar = s.charAt(r);
            if(hashArr[rightChar] > 0) {
                count++;
            }
            hashArr[rightChar]--;
        }


    }
}
