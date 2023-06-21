package LinkedList.src.SingleLinkedList;

import LinkedList.src.SingleLinkedList.LL;

public class Main {

    public static void main(String[] args) {
        LL list = new LL();

//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertEnd(33);
//        list.insert(5,2);
//        list.display();
//        list.deleteFirst();
//        list.display();
//        list.deleteLast();
//        list.display();
//        list.delete(1);
//        list.display();
//        list.delete(1);
//        list.insert(29,0);
//        list.insert(40,3);
//        list.insert(45,3);
//        list.find(45);
//        list.find(100);
        list.insertEnd(3);
        list.insertEnd(5);
        list.insertEnd(9);
        list.insertEnd(1);
        list.insertRec(7,3);


        list.display();

    }
}
