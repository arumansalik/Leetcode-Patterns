package TwoPointers.Problems;

public class PalindromeOrNot {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        String str1 = "madgm";

        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));
    }
}
