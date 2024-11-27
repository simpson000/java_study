package javaBasic;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }
    public void increment() {
        if (isMax()){
            System.out.println("Max count reached");
        }
        else count+=1;
    }
    public int getCount() {
        return count;
    }
    private boolean isMax(){
        return count >= max;
    }
}
