package LinkedList.src.Leetcode;

public class middleLinkedList {


     public class ListNode {
         int val;
         ListNode next;

         ListNode() {
         }

         ListNode(int val) {
             this.val = val;
         }

         ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }

     }
        public ListNode middleNode(ListNode head) {

            ListNode slow = head;
            ListNode fast = head;

            if(head == null || head.next == null)
            {
                return head;
            }

            do{
                if(fast.next == null)
                    return slow;
                else if(fast.next.next == null)
                    return slow.next;
                slow = slow.next;
                fast = fast.next.next;

            }while(fast != null);

            return null;
        }


}
