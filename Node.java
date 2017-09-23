public class Node<T extends Comparable<T>>   {
    public T data;
    public Node next;

    public void displayNode(){
        System.out.printf("data: %s\n", data);
    }


}
