package FastAndSlowPointers;

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverse(slow);

        ListNode firstHalf = head;
        while (secondHalf != null) {
            if(firstHalf.val != secondHalf.val) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    private static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : values) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        // Example 1: Palindrome list
        int[] arr1 = {1, 2, 2, 1};
        ListNode head1 = createList(arr1);
        System.out.println("List 1 is palindrome? " + isPalindrome(head1));

//        // Example 2: Not a palindrome
//        int[] arr2 = {1, 2, 3, 4};
//        ListNode head2 = createList(arr2);
//        System.out.println("List 2 is palindrome? " + isPalindrome(head2));
//
//        // Example 3: Palindrome with odd length
//        int[] arr3 = {1, 2, 3, 2, 1};
//        ListNode head3 = createList(arr3);
//        System.out.println("List 3 is palindrome? " + isPalindrome(head3));
//
//        // Example 4: Single element (always palindrome)
//        int[] arr4 = {7};
//        ListNode head4 = createList(arr4);
//        System.out.println("List 4 is palindrome? " + isPalindrome(head4));
//
//        // Example 5: Empty list (considered palindrome)
//        int[] arr5 = {};
//        ListNode head5 = createList(arr5);
//        System.out.println("List 5 is palindrome? " + isPalindrome(head5));
    }

}
