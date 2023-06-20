package LinkedList.src.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CLL clist = new CLL();

        clist.insert(34);
        clist.insert(41);
        clist.insert(48);
        clist.insert(55);
        clist.delete(48);

        clist.display();
    }
}
