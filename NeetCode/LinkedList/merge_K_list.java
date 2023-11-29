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
    public ListNode mergeKLists(ListNode[] lists) {
        
        return partition(lists, 0, lists.length -1);

    }

    public ListNode partition(ListNode[] lists, int start, int end){

        if(start == end){
            return lists[start];
        }

        int mid = start + (end - start)/2;
        if(start < end){

            ListNode l1 = partition(lists, start, mid);
            ListNode l2 = partition(lists, mid+1, end);

            return merge(l1,l2);
        }
        else{
            return null;
        }
    }

    public ListNode merge(ListNode list1, ListNode list2){

            if(list1 == null) return list2;
            if(list2 == null) return list1;

            if(list1.val <= list2.val){
                list1.next = merge(list1.next, list2);
                return list1;
            }
            else{
                list2.next = merge(list1, list2.next);
                return list2;
            }
    

    }
}