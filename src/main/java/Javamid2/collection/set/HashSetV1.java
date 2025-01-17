package Javamid2.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashSetV1 {

    static final int DEFAULT_CAPACITY = 16;

    LinkedList<Integer> []buckets;

    private int size = 0;
    private int capacity = DEFAULT_CAPACITY;

    public HashSetV1() {
        intBuckets();
    }
    public HashSetV1(int capacity) {
        this.capacity = capacity;
        intBuckets();
    }

    private void intBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }

    }
    public boolean add(int key) {
        int hashIndex = hashIndex(key);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (bucket.contains(key)) {
            return false;
        }
        else {
            bucket.add(key);
            size++;
            return true;
        }
    }
    public boolean remove(int key) {
        int hashIndex = hashIndex(key);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean found = bucket.remove(Integer.valueOf(key));
        if (found){
            size--;
            return true;
        }
        else {
            return false;
        }

    }
    public boolean contains(int key) {
        int hashIndex = hashIndex(key);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(key);
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "HashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
