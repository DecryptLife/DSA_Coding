package LinkedList.src.Leetcode;

public class palindromeList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode secondHead = reverseList(mid);
        ListNode reverseHead = secondHead;

        // comapre the halves
        while(head != null && secondHead != null)
        {
            if(head.val != secondHead.val)
                break;

            head = head.next;
            secondHead = secondHead.next;
        }

        reverseList(reverseHead);

        if(head == null || secondHead == null)
            return true;
        else
            return false;




    }

    public ListNode middleNode(ListNode head)
    {
        ListNode f = head;
        ListNode s = head;

        while(f != null && f.next != null)
        {
            s = s.next;
            f = f.next.next;
        }

        return s;
    }

    public ListNode reverseList(ListNode head)
    {
        if(head == null || head.next == null)
            return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;

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
