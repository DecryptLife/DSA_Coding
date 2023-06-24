package LinkedList.src.Leetcode;

public class SortList_Bubble {

     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


        public ListNode sortList(ListNode head) {
            if(head == null || head.next == null)
                return head;

            ListNode temp = head;

            int size=0;
            while(temp != null)
            {
                size++;
                temp = temp.next;
            }




            return sort(head,size,size,0);
        }
        public ListNode get(ListNode temp, int index)
        {
            while(index > 0)
            {
                temp = temp.next;
                index--;
            }

            return temp;

        }
        public void display(ListNode temp)
        {
            while(temp != null)
            {
                System.out.print(temp.val+ " -> ");
                temp = temp.next;

            }
            System.out.println("END");
        }
        public ListNode sort(ListNode temp, int size, int row, int col) {
            // swap at start(col =0)
            // swap in middle
            // swap at end(col==size-1)
            // boolean changed = false;
            // if(temp == null || temp.next == null)
            //     return ;

            if (row == 0)
                return temp;


            ListNode first = get(temp, col);
            ListNode second = get(temp, col + 1);


            if (second != null) {

                if (first.val > second.val) {
                    if (col == 0) {
                        first.next = second.next;
                        second.next = first;
                        temp = second;
                    } else if (col == size - 1) {
                        ListNode prev = get(temp, col - 1);
                        prev.next = first.next;
                        second.next = first;
                        first.next = null;
                    } else {
                        ListNode t = second;
                        first.next = second.next;
                        second.next = first;
                        ListNode prev = get(temp, col - 1);
                        prev.next = second;
                    }

                }
                return sort(temp, size, row, col + 1);

            } else {
                return sort(temp, size, row - 1, 0);
            }


        }
}
