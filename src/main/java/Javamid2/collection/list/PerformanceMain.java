package Javamid2.collection.list;

public class PerformanceMain {

    public static void main(String[] args) {

        int size = 50_000;
        addFirst(new ArrayList<>(), size);
        midFirst(new ArrayList<>(), size);
        endFirst(new ArrayList<>(), size);
        System.out.println();
        addFirst(new MyLinkedList<>(), size);
        midFirst(new MyLinkedList<>(), size);
        endFirst(new MyLinkedList<>(), size);
    }

    private static void addFirst(Mylist<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i);

        }
        long end = System.currentTimeMillis();
        System.out.println("addFirst time: " + (end - start));


    }
    private static void midFirst(Mylist<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2,i);

        }
        long end = System.currentTimeMillis();
        System.out.println("mid time: " + (end - start));


    }
    private static void endFirst(Mylist<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);

        }
        long end = System.currentTimeMillis();
        System.out.println("last time: " + (end - start));


    }
}
