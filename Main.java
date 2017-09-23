public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.insertFirst(1);
        singlyLinkedList.insertLast(2);
        singlyLinkedList.insertLast(3);
        singlyLinkedList.insertFirst(4);
        singlyLinkedList.insertLast(5);
        singlyLinkedList.insertLast(6);
        singlyLinkedList.deleteFirst();

        singlyLinkedList.displayList();
    }
}
