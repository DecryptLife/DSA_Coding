package LinkedList.src.SingleLinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }


    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null)
            tail = head;

        size += 1;
    }

    public void insert(int val, int index)
    {
        if(index == 0)
        {
            insertFirst(val);
            return;
        }

        if(index == size)
        {
            insertEnd(val);
            return;
        }

        if(index < size)
        {
            Node node = new Node(val);
            Node temp = head;

            while(index-1 != 0)
            {
                temp = temp.next;
                index--;
            }

            Node rest =  temp.next;
            temp.next = node;
            node.next = rest;

            size+=1;
        }
        else
        {
            System.out.println("Invalid position given");
        }

    }

    // insert using recursion
    public void insertRec(int val, int index)
    {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val,int index, Node node)
    {
        if(index == 0)
        {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1,node.next);

        return node;

    }
    public void insertEnd(int val)
    {
        Node node = new Node(val);

        if(tail == null) {
            insertFirst(val);
            return;
        }
        tail.next =  node;
        tail = node;

        size += 1;
    }

    public void deleteFirst()
    {
        if(size <= 0)
        {
            System.out.println("Linked list empty");
            return;
        }

        head = head.next;

        if(head == null)
            tail = null;
        size--;
    }

    public void deleteLast()
    {

        if(head == tail)
        {
            deleteFirst();
            return;
        }

        Node temp = head;
        while(temp.next != tail)
        {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
    }

    public void delete(int index)
    {

        if(index == size)
        {
            deleteFirst();
            return;
        }

        if(index == size - 1)
        {
            deleteLast();
            return;
        }

        if(index <size)
        {
            System.out.println("Size: "+size);
            Node temp = head;
            for(int i=0;i<index-1;i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            size--;
        }



    }

    public void find(int val)
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.val == val) {
                System.out.println("Element present");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Element not present");
    }
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }
    private class Node{
        private int val;
        private Node next;

        public Node(int val)
        {
            this.val = val;
        }

        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }


}
