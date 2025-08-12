package FastAndSlowPointers;

public class isHappy {
    public static boolean isHappyNum(int n) {
        int slow = n;
        int fast = getNext(n);

        while(fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }

    private static int getNext(int num) {
        int sum = 0;
        while(num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        boolean ans = isHappyNum(n);
        System.out.println(ans);
    }
}
