package LinkedList.src.Leetcode;

public class reorderList {

      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public void reorderList(ListNode head) {

        if(head == null || head.next == null)
            return;

        // get the middle node of the list
        ListNode mid = middleNode(head);
        ListNode secondHead = reverseList(mid);
        ListNode temp = null;

        while(head != null && secondHead != null)
        {

            temp = head.next;
            head.next = secondHead;
            head = temp;

            temp = secondHead.next;
            secondHead.next = head;
            secondHead = temp;
        }


    }

    public ListNode middleNode(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    public ListNode reverseList(ListNode node)
    {
        if(node == null || node.next == null)
        {
            return null;
        }

        ListNode prev = null;
        ListNode curr = node;
        ListNode next = curr.next;

        while(curr != null)
        {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null)
                next = next.next;
        }

        return prev;
    }

}
