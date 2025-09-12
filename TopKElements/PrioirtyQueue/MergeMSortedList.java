package TopKElements.PrioirtyQueue;

import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {val = x; }
}

public class MergeMSortedList {
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {
            if(node != null) pq.offer(node);
        }

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(!pq.isEmpty()) {
            ListNode curr = pq.poll();
            temp.next = curr;
            temp = temp.next;

            if(curr.next != null) {
                pq.offer(curr.next);
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = {l1, l2, l3};

        ListNode result = mergeKLists(lists);

        while(result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
    }
}