package LinkedList.src;

public class DLL {

    private int size;
    private Node head;
    private Node tail;
    DLL(){
        this.size = 0;
    }

    private class Node{

        private int val;

        private Node next;
        private Node prev;

        private Node(int val){
            this.val = val;
        }

        private Node(int val, Node prev, Node next)
        {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }

    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null)
            head.prev = node;
        head = node;

        if(tail == null)
            tail = head;

        size += 1;
    }

    public void insertLast(int val){

        if(head == null)
        {
            insertFirst(val);
            return;
        }

        Node slast = get(size);

        Node node = new Node(val);
        node.prev = slast;
        slast.next = node;
        node.next = null;
        tail = node;

        size+=1;
    }

    public void insert( int val, int index)
    {

        Node slast =  get(index-1);

        Node node = new Node(val);

        node.prev = slast;
        Node rest = slast.next;
        slast.next = node;
        node.next = rest;
        rest.prev = node;

        size +=1;

    }

    public Node get(int index)
    {
        Node temp = head;
        for(int i=0;i<index-1;i++)
        {
            temp = temp.next;
        }

        return temp;
    }

    public void display()
    {
        Node temp = head;
        Node last = null;
        while(temp != null)
        {
            System.out.print(temp.val+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("In Reverse");
        while(last != null)
        {
            System.out.print(last.val +" -> ");
            last = last.prev;
        }
        System.out.println("END");

    }
}
