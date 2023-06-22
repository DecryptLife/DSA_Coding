package LinkedList.src.Leetcode;

public class cycleLength {

    class ListNode {
        int val;
        hasCycle.ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public int cycleLength(hasCycle.ListNode head) {

        if(head == null || head.next == null)
            return 0;

        hasCycle.ListNode slow = head;
        hasCycle.ListNode fast = head;

        while(fast.next!=null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            // move the slow pointer until it reaches the fast pointer
            if(slow == fast)
            {
                int length = 0;
                do
                {
                    slow = slow.next;
                    length += 1;
                }while (slow != fast);
                return length;
            }

        }

        return 0;
    }

}
