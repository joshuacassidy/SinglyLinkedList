public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();

        singlyLinkedList.insertFirst("1");
        singlyLinkedList.insertLast("2");
        singlyLinkedList.insertLast("3");
        singlyLinkedList.insertFirst("4");
        singlyLinkedList.insertLast("5");
        singlyLinkedList.insertLast("6");
        singlyLinkedList.deleteFirst();

        singlyLinkedList.displayList();
        System.out.println(singlyLinkedList.isEmpty() ? "The Linked List is empty." : "The Linked List is not empty.");
    }
}
