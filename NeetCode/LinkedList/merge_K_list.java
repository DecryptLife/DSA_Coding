public /**
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

       ListNode res = new ListNode(0);

       for(ListNode list:lists){
           res.next = merge(res.next, list);
       }


       return res;
   }

   public ListNode merge(ListNode list1, ListNode list2){

       ListNode dummyHead = new ListNode(0);
       ListNode tail = dummyHead;

       while(list1 !=  null && list2 != null){

           if(list1.val <= list2.val){
               tail.next = list1;
           }
           else{
               tail.next = list2;
           }

           tail = tail.next;
       }


       if(list1 !=  null){tail.next = list1;}
       else{
           tail.next = list2;
       }

       return dummyHead.next;
   }
} merge_K_list {
    
}
