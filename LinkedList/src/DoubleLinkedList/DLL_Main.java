package LinkedList.src.DoubleLinkedList;

import LinkedList.src.DoubleLinkedList.DLL;

public class DLL_Main {

    public static void main(String[] args) {
        DLL dlist = new DLL();

        dlist.insertLast(43);
        dlist.display();
        dlist.insertFirst(22);
        dlist.insertLast(12);
        dlist.display();
        dlist.insertLast(35);
        dlist.display();
        dlist.insertFirst(8);
        dlist.insert(100,3);

        dlist.display();

    }
}
