package LinkedList;


public class Main {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.insertInLinkedList(1,0);
        sll.insertInLinkedList(2, 1);
        sll.insertInLinkedList(3, 3);
        sll.insertInLinkedList(4, 4);


        sll.traverseLinkedList();
        sll.searchNode(4);
        sll.deletingNode(0); // start
        sll.traverseLinkedList();
        sll.deletingNode(4); // end
        sll.traverseLinkedList();
        sll.deletingNode(1);// middle when first is deleted
        sll.traverseLinkedList();
    }
}
