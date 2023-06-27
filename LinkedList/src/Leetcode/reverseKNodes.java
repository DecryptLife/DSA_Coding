package LinkedList.src.Leetcode;

import java.util.List;

public class reverseKNodes {


      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


        public  static ListNode reverseKGroup(ListNode head, int k) {

            if(k <=1 || head == null)
                return  head;

            ListNode prev= null;
            ListNode current = head;

           while(true)
           {
               ListNode last = prev;
               ListNode newEnd = current;

               ListNode next = current.next;

               for(int i=0;current != null && i < k;i++)
               {
                   current.next = prev;
                   prev = current;
                   current = next;

                   if(next !=  null)
                       next = next.next;
               }
               if(last !=  null)
                   last.next = prev;
               else
                   head = prev;

               newEnd.next = current;

               if(current == null)
                   break;

               prev = newEnd;

           }
            return head;

        }

        public static ListNode reverseList(ListNode node, int k)
        {
            if(node == null || node.next == null)
            {
                return null;
            }

            ListNode prev = null;
            ListNode curr = node;
            ListNode next = curr.next;

            while(curr != null && k > 0)
            {
                curr.next = prev;
                prev = curr;
                curr = next;
                if(next != null)
                    next = next.next;
                k-=1;
            }

            return prev;
        }


        public static void display(ListNode node)
        {
            while(node != null)
            {
                System.out.print(node.val + " -> ");
            }
            System.out.println("END");
        }
    public static void main(String[] args) {
        ListNode node  =  new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        display(reverseKGroup(node,2));



    }
}
