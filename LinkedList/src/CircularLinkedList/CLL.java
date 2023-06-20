package LinkedList.src.CircularLinkedList;

public class CLL {

    private Node head;
    private Node tail;

    private int size;

    CLL(){
        this.size = 0;
    }

    public void insert(int val)
    {
        Node node = new Node(val);
        if(head == null)
        {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;

        size +=1;
    }

    public void delete(int val)
    {
        Node node = head;
        // check if head
        if(node.val == val)
        {
            head = head.next;
            tail.next = head;
        }

        do{
            Node n = node.next;

            if(n.val == val)
            {
                node.next = n.next;
                break;
            }
            node = node.next;

        }while(node != head);


    }



    public void display()
    {
        Node node = head;
        do{
            System.out.print(node.val+" -> ");
            node = node.next;

        }while(node != head);
        System.out.println("HEAD");
    }
    private class Node{

        private int val;

        private Node next;

        Node(int val){
            this.val = val;
        }

        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
