package Javamid2.generic.problem;

public class Container <T>{
    private T value;

    public boolean isEmpty() {
        return value == null;
    }

    public T getItem() {
        return value;
    }

    public void setItem(T data1) {
        this.value = data1;
    }
}
