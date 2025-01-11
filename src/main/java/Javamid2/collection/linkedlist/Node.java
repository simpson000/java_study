package Javamid2.collection.linkedlist;

public class Node {
    Object item;
    Node next;
    public Node(Object node) {
        this.item = node;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x
                    = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
