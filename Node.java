public class Node<T extends Comparable<T>>   {
    public T data;
    public Node next;

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public void displayNode(){
        System.out.printf("data: %s\n", data);
    }


}
