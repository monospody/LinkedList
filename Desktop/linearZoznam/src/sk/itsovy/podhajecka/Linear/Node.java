package sk.itsovy.podhajecka.Linear;

public class Node<T> {
    private T name;
    private Node next;

    public T getName() {
        return name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(T name) {
        this.name = name;
        next = null;
    }

}
