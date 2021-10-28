package LinkedList;

public class Node {

    private Object data;
    private Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

    public Node next() {
        return next;
    }

    public void next(Node node) {
        this.next = node;
    }

    @Override
    public String toString() {
        return "[" + data + "] ";
    }
}
