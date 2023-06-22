package LinkedList.src.Leetcode;

public class cycle2 {


     class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }


    public int cycleLength(ListNode head)
    {
        if(head == null)
            return 0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            //get cycle length
            if(slow == fast)
            {
                int length = 0;
                do{
                    slow = slow.next;
                    length++;
                }while(slow != fast);

                return length;
            }
        }

        return 0;
    }
    public ListNode detectCycle(ListNode head) {

        int cycLen = cycleLength(head);

        if(cycLen == 0)
            return null;

        ListNode f = head;
        ListNode s = head;

        while(cycLen > 0)
        {
            s = s.next;
            cycLen--;
        }

        while(f != s)
        {
            f=f.next;
            s = s.next;
        }

        return f;


    }
}
