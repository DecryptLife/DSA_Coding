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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        

        ListNode end = head;

        int count = 0;
        while(end != null){

            end = end.next;
            count++;
        }

        int remove = count - n;

        ListNode prev = null;
        ListNode curr = head;

        if(remove == 0) return head.next;
        while(remove > 0){
            prev = curr;
            curr = curr.next;
            remove--;

        }

        if(prev != null) {
            prev.next = curr.next;
           curr.next = null;
        }else{
            prev = curr.next;
            curr.next = null;
        }

        return head;
    }
}