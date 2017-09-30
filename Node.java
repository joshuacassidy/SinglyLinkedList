public class Node<T extends Comparable<T>>   {
    private T data;
    private Node<T> next;

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void displayNode(){
        System.out.printf("data: %s\n", data);
    }


}
