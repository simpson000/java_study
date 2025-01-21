package Javamid2.collection.iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;
    private int[] array;

    public MyArrayIterator(int[] array) {
        this.array = array;
    }


    @Override
    public boolean hasNext() {
        return currentIndex < array.length-1;
    }

    @Override
    public Integer next() {
        return array[++currentIndex];
    }
}
