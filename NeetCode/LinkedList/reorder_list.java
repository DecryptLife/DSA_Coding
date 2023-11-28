/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {


    public ListNode middle(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverse(ListNode temp){

        ListNode prev = null;
        ListNode curr = temp;
        ListNode next = temp.next;


        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;

            if(next != null){
                next = next.next;
            }
        }

        return prev;

    }
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null) return;
        // use two pointers
        ListNode mid = middle(head);
        ListNode rev = reverse(mid.next);
        mid.next = null;

        ListNode c1 = head;
        ListNode c2 = rev;

        ListNode f1 = null;
        ListNode f2 = null;

        while(c1 != null & c2 != null){
            f1 = c1.next;
            f2 = c2.next;

            c1.next = c2;
            c2.next = f1;

            c1 = f1;
            c2 = f2;
        }




    }
}