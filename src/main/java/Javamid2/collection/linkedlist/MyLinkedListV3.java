package Javamid2.collection.linkedlist;


public class MyLinkedListV3 <T>{
    private Node<T> first;
    private int size = 0;

    public void add (T o) {
        Node<T> newNode = new Node<>(o);
        if (first == null) {
            first = newNode;
        }
        else {
            Node<T> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }
    public void add (int index, T o) {
        Node<T> newNode = new Node<>(o);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        }
        else {
            Node<T> prevNode = getNode(index - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;
        
    }

    private Node<T> getLastNode() {
        Node<T> lastNode = first;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        return lastNode;
    }

    public T set(int index, T o) {
        Node<T> currentNode = getNode(index);
        T oldvalue = currentNode.item;
        currentNode.item = o;
        return oldvalue;
    }
    public T remove(int index) {
        Node<T> currentNode = getNode(index);
        T oldvalue = currentNode.item;
        if (index == 0) {
            first = currentNode.next;
        }
        else {
            Node<T> prev = getNode(index - 1);
            prev.next = currentNode.next;

        }
        currentNode.item = null;
        currentNode.next = null;
        size--;
        return oldvalue;

    }

    private Node<T> getNode(int index) {
        Node<T> currentNode = first;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
    public int indexOf (T o) {
        int index =0;
        for (Node<T> x = first; x != null; x = x.next) {
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


    private static class Node<E> {
        E item;
        Node<E> next;
        public Node(E item) {
            this.item = item;
        }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> temp = this;
            sb.append("[");
            while (temp != null) {
                sb.append(temp.item);
                if (temp.next != null) {
                    sb.append("->");
                }
                temp
                        = temp.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }

}
