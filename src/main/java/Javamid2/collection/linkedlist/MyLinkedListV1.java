package Javamid2.collection.linkedlist;


public class MyLinkedListV1 {
    private Node first;
    private int size = 0;

    public void add (Object o) {
        Node newNode = new Node(o);
        if (first == null) {
            first = newNode;
        }
        else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }
    public void add (Object o, int index) {
        Node newNode = new Node(o);

    }

    private Node getLastNode() {
        Node lastNode = first;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        return lastNode;
    }

    public Object set(int index, Object o) {
        Node currentNode = getNode(index);
        Object oldvalue = currentNode.item;
        currentNode.item = o;
        return oldvalue;
    }

    private Node getNode(int index) {
        Node currentNode = first;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
    public int indexOf (Object o) {
        int index =0;
        for (Node x = first; x != null; x = x.next) {
            if (o.equals(x.item))
                return index;
            index++;
        }
        return -1;
    }
    public int size () {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    public String get(int i) {
        return getNode(i).item.toString();
    }

}
