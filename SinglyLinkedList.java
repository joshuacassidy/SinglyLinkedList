public class SinglyLinkedList<T extends Comparable<T>> {
    private Node first;

    public SinglyLinkedList() {
        first = null;
    }

    public boolean isEmpty(){
        //if first points to null that means no nodes connected to the list
        return (first == null);
    }

    //inserts at start of the list
    public void insertFirst(T data){
        //Creating a new instance of the node
        Node node = new Node();
        // the data of this instance is set to the data passed into this method
        node.setData(data);
        //inserting first at the very start of the list just after  first. nodes next field needs to be the old
        node.setNext(first);
        // then we take the first variable and point it to the new node
        first = node;
    }

    public void insertLast(T data)
        if(first != null){
            //setting the current to the first
            Node current = first;

            while(current.getNext() != null){
                // pushing the current to the last node
                current = current.getNext();
            }
            // creating a new node
            Node node = new Node();
            // setting the new nodes data
            node.setData(data);
            // pointing the current to this node.
            current.setNext(node);
        }
        else {
            insertFirst(data);
        }


    }

    public Node deleteFirst(){
        // temp variable current first
        Node temp = first;
        // changing first points to so the old first (temp) has nothing pointing to it and is thus deleted.
        first = first.getNext();
        return temp;
    }

    public void displayList(){
        System.out.println("List: first --> last");
        // Setting current to the first node
        Node current = first;
        while (current != null){
            current.displayNode();
            // changing the current to the next value
            current = current.getNext();
        }
    }



}
